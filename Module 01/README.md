# PROGRAMMING LANGUAGES & INTRODUCTION TO JAVA

## 1. What is Programming?

Programming is the process of writing instructions that tell a computer what to do.

A computer cannot think or make decisions on its own. It follows the instructions provided by a programmer.

Examples:
- A calculator performing mathematical operations.
- A website responding when we click a button.
- A robot moving according to sensor readings.
- A mobile application displaying information.

## 2. What is a Programming Language?

A programming language is a formal language used to communicate instructions to a computer.

It allows programmers to write programs that solve problems, perform calculations, process data, and control devices.

Examples:
- Python
- Java
- C
- C++
- JavaScript
- C#

### Main Components of a Programming Language

1. **Syntax:** Rules for writing valid instructions.
2. **Keywords:** Reserved words with predefined meanings.
3. **Variables:** Named memory locations used to store data.
4. **Data Types:** Define the type of data being stored.
5. **Operators:** Perform operations on data.
6. **Control Structures:** Control the flow of program execution.
7. **Functions/Methods:** Reusable blocks of code.

## 3. Why Do We Need Programming Languages?

Programming languages help us:

- Automate repetitive tasks.
- Develop websites and applications.
- Build games and software.
- Analyse and process large amounts of data.
- Develop Artificial Intelligence and Machine Learning systems.
- Control robots and electronic devices.
- Solve complex real-world problems.

## 4. How Does a Computer Understand a Program?

Computers fundamentally understand instructions in binary form, using 0s and 1s.

Programming languages provide a convenient way for humans to write instructions. These instructions are translated into a form that the computer can execute.

Some important language translators are:

### Compiler
A compiler translates source code into another form, often machine code or an intermediate representation.

Example: Java uses a compiler called `javac` to convert source code into bytecode.

### Interpreter
An interpreter executes program instructions through an execution environment, often one instruction or operation at a time.

Example: Python commonly uses an interpreter-based execution process.

### Assembler
An assembler converts assembly language instructions into machine code.

## 5. Types of Programming Languages

Programming languages are broadly classified into two categories:

1. Low-Level Languages
2. High-Level Languages

## 6. Low-Level Languages

Low-level languages are programming languages that are closer to the hardware and provide less abstraction from the computer's architecture.

They are generally more difficult for humans to understand.

### Types of Low-Level Languages

**A. Machine Language**

- It is represented using binary digits (0 and 1).
- It is directly understood by the processor.
- It is difficult for humans to read and write.
- It is hardware-dependent.

**B. Assembly Language**

- It uses short symbolic instructions called mnemonics.
- It is easier to understand than machine language.
- It requires an assembler for translation.
- It is generally hardware-dependent.

### Advantages

- Provides close control over hardware.
- Can be useful for hardware-specific operations.
- Can be highly efficient for certain tasks.

### Disadvantages

- Difficult to learn and maintain.
- Hardware-dependent.
- Requires detailed knowledge of computer architecture.

## 7. High-Level Languages

High-level languages are designed to be easier for humans to read, write, understand, and maintain.

They use words, symbols, and structures that are closer to human language and mathematical notation.

Examples:
- Python
- Java
- C++
- JavaScript
- C#

### Advantages

- Easy to read and understand.
- Easier to write and debug.
- Faster software development.
- More portable across different systems, depending on the language and environment.
- Suitable for developing complex applications.

### Disadvantages

- Usually require translation or a runtime environment.
- May provide less direct hardware control.
- Performance depends on the language, implementation, and application.

## 8. Difference Between High-Level and Low-Level Languages

| High-Level Languages | Low-Level Languages |
|---|---|
| Closer to human language | Closer to machine instructions |
| Easier to understand | More difficult to understand |
| Easier to develop and maintain | More difficult to develop and maintain |
| Generally more portable | Generally hardware-dependent |
| Examples: Python, Java | Examples: Machine language, Assembly |

# INTRODUCTION TO JAVA

## 9. What is Java?

Java is a high-level, general-purpose, object-oriented programming language.

It was developed by James Gosling and his team at Sun Microsystems and officially released in 1995.

Java is widely used to develop:
- Desktop applications.
- Web applications.
- Enterprise software.
- Android applications.
- Banking and financial systems.
- Backend services.
- Some robotics applications.

Java is popular because it is portable, secure, robust, and supports object-oriented programming.

## 10. Important Features of Java

### 1. Simple
Java has a relatively easy-to-understand syntax compared with many lower-level languages.

### 2. Object-Oriented
Java organizes programs around classes and objects.

### 3. Platform Independent
Java follows the principle:

"Write Once, Run Anywhere."

Java source code is compiled into bytecode, which can run on any compatible Java Virtual Machine (JVM).

### 4. Secure
Java provides security features such as bytecode verification and controlled memory access.

### 5. Robust
Java includes features such as exception handling and automatic memory management.

### 6. Multithreaded
Java supports executing multiple threads within a program.

### 7. Portable
Java bytecode can be executed on different platforms with compatible JVM implementations.

### 8. Rich Standard Library
Java provides built-in classes and methods for working with files, collections, networking, input, and many other tasks.

## 11. Understanding JDK, JRE, and JVM

These three terms are important when learning Java.

### JVM (Java Virtual Machine)

- JVM stands for Java Virtual Machine.
- It executes Java bytecode.
- It makes Java platform independent.
- It manages memory during program execution.

### JRE (Java Runtime Environment)

- JRE stands for Java Runtime Environment.
- It provides the environment required to run Java applications.
- It includes the JVM and supporting runtime libraries.

### JDK (Java Development Kit)

- JDK stands for Java Development Kit.
- It is used to develop Java applications.
- It includes tools such as the Java compiler and runtime components.

### Simple Relationship

JDK → Development tools + Runtime components

JRE → JVM + Runtime libraries

JVM → Executes Java bytecode

## 12. How Does a Java Program Execute?

Java follows a two-step process:

1. Compilation
2. Execution

The process is:

1. A programmer writes Java source code in a `.java` file.
2. The Java compiler (`javac`) compiles the source code.
3. The compiler generates bytecode in a `.class` file.
4. The JVM loads and executes the bytecode.
5. The program produces the required output.

Example:

Java Source Code → Compiler → Bytecode → JVM → Output