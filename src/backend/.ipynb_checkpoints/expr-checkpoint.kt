package backend

abstract class Expr {
    abstract fun eval(runtime: Runtime): Data
}

class NoneExpr() : Expr() {
    override fun eval(runtime: Runtime): Data = None
}

class IntLiteral(val lexeme: String) : Expr() {
    override fun eval(runtime: Runtime): Data = IntData(Integer.parseInt(lexeme))
}

class StringLiteral(val lexeme: String) : Expr() {
    override fun eval(runtime: Runtime): Data = StringData(lexeme)
}

class BooleanLiteral(val lexeme: String) : Expr() {
    override fun eval(runtime: Runtime): Data = BooleanData(lexeme.equals("true"))
}

class FunctionExpr(val params: List<String>, val body: Expr) : Expr() {
    override fun eval(runtime: Runtime): Data = FunctionData(params, body)
}

class Declare(
    val name: String,
    val parameters: List<String>,
    val body: Expr
) : Expr() {
    override fun eval(runtime: Runtime): Data {
        val funcdata = FuncData(name, parameters, body)
        runtime.symbolTable[name] = funcdata
        return None
    }
}

class Deref(
    val name:String
): Expr() {
    override fun eval(runtime:Runtime):Data {
        val v = runtime.symbolTable[name]
        if(v != null) {
            return v
        } else {
            return None
        }
    }
}

class Invoke(
    val funcname: String,
    val arguments: List<Expr>
) : Expr() {
    override fun eval(runtime: Runtime): Data {
        val f = runtime.symbolTable[funcname]
        if (f == null) {
            throw Exception("$funcname does not exist.")
        }
        if (f !is FuncData) {
            throw Exception("$funcname is not a function.")
        }
        if (arguments.size != f.parameters.size) {
            throw Exception("$funcname expects ${f.parameters.size} arguments, but ${arguments.size} given.")
        }
        
        // Evaluate each argument to a data
        val argumentData = arguments.map {
            it.eval(runtime)
        }

        // Create a subscope and evaluate the body using the subscope
        return f.body.eval(runtime.subscope(f.parameters.zip(argumentData).toMap()))
    }
}

enum class Operator {
    ADD,
    SUB,
    MUL,
    DIV
}

class Arith(
    val op: Operator,
    val left: Expr,
    val right: Expr
) : Expr() {
    override fun eval(runtime: Runtime): Data {
        val x = left.eval(runtime)
        val y = right.eval(runtime)
        if (x is IntData && y is IntData) {
            return IntData(
                when (op) {
                    Operator.ADD -> x.v + y.v
                    Operator.SUB -> x.v - y.v
                    Operator.MUL -> x.v * y.v
                    Operator.DIV -> x.v / y.v
                }
            )
        } else {
            throw Exception("Only support int")
        }
    }
}

class Assign(
    val name: String,
    val expr: Expr
) : Expr() {
    override fun eval(runtime: Runtime): Data {
        val v: Data = expr.eval(runtime)
        runtime.symbolTable[name] = v
        return None
    }
}

class Block(val exprs:List<Expr>):Expr() {
    override fun eval(runtime:Runtime):Data
    = exprs.map { it.eval(runtime) }.last()
}

class For(
    val variable: String,
    val rangeStart: Int,
    val rangeEnd: Int,
    val body: Expr
) : Expr() {
    override fun eval(runtime: Runtime): Data {
        for (i in rangeStart..rangeEnd) {
            runtime.symbolTable[variable] = IntData(i)
            body.eval(runtime)
        }
        return None
    }
}

class Print(val expr: Expr) : Expr() {
    override fun eval(runtime: Runtime): Data {
        val data = expr.eval(runtime)
        println(data.toString()) 
        return None
    }
}

class Concat(val leftExpr: Expr, val rightExpr: Expr) : Expr() {
    override fun eval(runtime: Runtime): Data {
        val leftData = leftExpr.eval(runtime)
        val rightData = rightExpr.eval(runtime)
        if (leftData is StringData && rightData is StringData) {
            return StringData(leftData.v + rightData.v)
        } else {
            throw Exception("Concatenation only supports strings")
        }
    }
}

class Repeat(val stringExpr: Expr, val timesExpr: Expr) : Expr() {
    override fun eval(runtime: Runtime): Data {
        val stringData = stringExpr.eval(runtime)
        val timesData = timesExpr.eval(runtime)
        

        val repeatedString = StringBuilder()
        val times = timesData.toString().toInt()
        for (i in 0 until times) {
            repeatedString.append(stringData.toString())
        }

        return StringData(repeatedString.toString())
    }
}
