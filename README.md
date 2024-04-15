# Simple-Programming-Language

## Requirements to uses this project in Linux
- Kotlin
- Jupyter Notebook
- Kotlin Kernel for Jupyter Notebook
- Python3 or Anaconda
- ANTLR v4
- IntelliJ IDEA (Optional)
- ANTLR v4 plugin for IntelliJ IDEA (Optional, but recommended if you want to add new features to the language)

## How to install Kotlin
[Kotlin Docs](https://kotlinlang.org/docs/command-line.html)

## How to install ANTLR v4.11.1
- Open a terminal
```
  cd /
  sudo curl -O https://www.antlr.org/download/antlr-4.11.1-complete.jar
  ```
## How install Kotlin Kernel for Jupyter Notebook
Check [Kotlin Kernel for Jupyter Notebook](https://github.com/Kotlin/kotlin-jupyter?tab=readme-ov-file#installation) for more details.
### Conda
```
conda install -c jetbrains kotlin-jupyter-kernel
```
### Pip
```
pip install kotlin-jupyter-kernel
```

## How to run the project
1. Run the following command in the terminal in the root of the project to build
```
make
```
2. Then in your Jupiter Notebook, or Jupiter Lab, Make sure select the Kotlin Kernel, and Restart every build you make, 
and run the cells.


## Parser Tree
![Parser Tree](./images/parseTree.png)

Original Idea was to create a simple programming language that can be used to teach programming to beginners,
in spanish. However, the project was not completed, and the language is not fully functional. The keywords are not
translated to Spanish, for lack of time. Next steps would be to complete the language,translate keywords, and add more features to it.