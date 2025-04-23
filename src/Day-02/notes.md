# **Installing JDK**

[Official Site Link](https://www.oracle.com/in/java/technologies/downloads/)

Verify

```bash
javac --version
```

```code
javac 24.0.1
```

```bash
java --version
```

```code
java 24.0.1 2025-04-15
Java(TM) SE Runtime Environment (build 24.0.1+9-30)
Java HotSpot(TM) 64-Bit Server VM (build 24.0.1+9-30, mixed mode, sharing)
```

```bash
which java
```

```code
/usr/bin/java
```

Installation has been successful!

## **Compiling and Running**

Create a class and run the command to convert your java class int Byte Code. 

```bash
javac <file_name.java>
```

The _javac(java compiler)_ will give you the byte code and then run the command

```bash
java <file_name>
```

This will run the byte code(on JVM - Java Virtual Machine) and will give you the output. 


## **Anatomy of a class**

```code 
import java.lang.*;

public class FirstProgram {
    public static void main (String[] arg) {
        System.out.println("Hello world!");
    }
}
```

- public :: Access Control (Public means it can accessible by everyone)
- class  :: This is a class
- FirstProgram :: Class Name
- {}     :: Closing and Opening of the class

Inside the class we define our class's variables, functions(methods), ...etc

- static :: We'll cover this one later.
- void   :: The return type that the function/method is going to return. Void means there's no return value. 
- main   :: The name of the method
- String[] :: Argument of the method (This method must be given an array of strings and the array will be called as 'args')
- {}     :: Opening & Closing braces of the method
- System.out.println :: This says print to standard output (default to command-line)
- "Hello world!" :: The string we want to print
- ;      :: Line Terminator (Every statement must end in a semicolon).

## **File Extension**

- .java
  - Contains Java Source Code
  - High Level Human Readable
  - Used for development
  - File is editable

- .class
  - Contains Java Bytecode
  - This is for consumption of JVM
  - Used for execution
  - This is not meant to be edited

## **JDK | JRE | JVM**

- JDK (Java Development Kit) :: It's a software development kit required to develop Java applications. It includes the JRE, an interpreter | loader (java), a compiler(javac) and other tools needed for java development.  

- JRE (Java Runtime Environment) :: It's a part of the JDK but can be downloaded separately. It provides libraries, the JVM and other components to run application. Almost, in every device there is already JRE is installed so that we can run softwares. 

- JVM (Java Virtual Machine) :: It's a part of JRE and responsible for executing the bytecode. It ensures Java's "Write once run anywhere" capability. It is _not platform independent_; a different JVM is needed for each type of OS, CPU, etc.

## **Importance of the main method**

It's an entry point of a Java Program, where the execution starts. Without the main method, the JVM does not know where to begin running the code. 

## **Install Intellij Idea**

[Download Community Edition](https://www.jetbrains.com/idea/download/?section=linux)
