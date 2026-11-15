# MODULE 2: YOUR FIRST JAVA PROGRAM, OUTPUT METHODS & ESCAPE SEQUENCES

## 1. Creating Our First Java Program

The first program traditionally written by beginners in almost every programming language is called the **Hello World Program**.

Its purpose is to display the message "Hello, World!" on the screen.

### Our First Java Program

    public class Main {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
        }
    }

### Output

    Hello, World!

Congratulations! We have successfully written our first Java program.

But what exactly does every word and symbol in this program mean? Let's understand it step by step.

---

## 2. Understanding Every Keyword and Component

Our Hello World program contains several important keywords, identifiers, methods, symbols, and statements.

Let's break down the program.

### 2.1 public

    public class Main

- `public` is an access modifier in Java.
- Access modifiers control the accessibility of classes, methods, and variables.
- When something is declared public, it can generally be accessed from other classes, subject to Java's access rules.
- In our example, the class Main is declared public.

**In simple words:** Public means that the declared component can be accessed from outside its class.

### 2.2 class

    public class Main

- `class` is a reserved keyword in Java.
- It is used to declare or define a class.
- A class acts as a blueprint for creating objects.
- It can contain variables, methods, and constructors.

**In simple words:** A class is like a blueprint that describes what an object will contain and what it can do.

### 2.3 Main

    public class Main

- `Main` is the name of our class.
- It is an identifier, not a Java keyword.
- An identifier is a name given to programming elements such as classes, variables, and methods.
- Java is case-sensitive, so `Main` and `main` are different.

**Important:** If a class is declared public, its name must match the Java source filename. For example, `public class Main` should normally be saved in a file named `Main.java`.

### 2.4 Curly Braces { }

- Curly braces are used to define a block of code.
- The opening brace `{` marks the beginning of a block.
- The closing brace `}` marks the end of that block.
- In our program, the outer braces define the class body, while the inner braces define the main method body.

**In simple words:** Curly braces tell Java which instructions belong together.

### 2.5 public static void main(String[] args)

This is one of the most important lines in a basic Java program.

It is called the **main method**.

The main method is the entry point from which the Java Virtual Machine starts executing a traditional Java application.

Let's understand every component separately.

#### A. public

- It is an access modifier.
- It allows the JVM to access the main method from outside the class.

#### B. static

- `static` is a Java keyword.
- It means that the method belongs to the class rather than an individual object.
- Because the main method is static, the JVM can call it without first creating an object of the class.

**In simple words:** Static allows the main method to be called without creating an object.

#### C. void

- `void` is a keyword used to indicate that a method does not return a value.
- Our main method performs instructions but does not send a result back to the JVM.

For example:

    void display() {
        System.out.println("Hello");
    }

This method displays a message but does not return any value.

#### D. main

- `main` is the name of the method.
- It is the special method name recognized as the entry point of a traditional Java application.
- Java execution begins from this method when the class is launched in the usual way.

**Important:** `main` is not a reserved keyword. It is a method name with a special role.

#### E. String[] args

This part may look complicated, but it is quite simple when divided into smaller components.

**String**
- `String` is a predefined Java class.
- It is used to represent a sequence of characters.
- Examples include `"Hello"`, `"Java"`, and `"Programming"`.

**[]**
- Square brackets represent an array.
- An array is used to store multiple values of the same type.

**args**
- `args` is the variable name.
- It refers to the array that receives command-line arguments when the program is launched.

For example:

    public static void main(String[] args) {
        System.out.println(args.length);
    }

If we launch the program with three command-line arguments, the output will be:

    3

**Remember:** `args` is just a variable name. We can use another valid name, such as `arguments`, instead.

### 2.6 System.out.println()

    System.out.println("Hello, World!");

This statement is used to display output on the console.

Let's understand its components.

#### A. System

- `System` is a predefined class available in Java's `java.lang` package.
- It provides useful features related to the system.
- These include standard input, standard output, and error output.

#### B. out

- `out` is a static field of the `System` class.
- It represents the standard output stream.
- By default, it is connected to the console or terminal.

#### C. println()

- `println()` is a method of the `PrintStream` class.
- It prints the given information and then moves the cursor to the next line.

#### D. Parentheses ( )

- Parentheses are used to pass information to a method.
- The information supplied inside them is called an argument.
- In our example, `"Hello, World!"` is passed as an argument to `println()`.

#### E. Double Quotation Marks " "

- Double quotation marks are used to represent a String literal.
- Everything written inside them is treated as text.

For example:

    System.out.println("Hello Java");

Here, `Hello Java` is a String literal.

#### F. Semicolon ;

- A semicolon marks the end of a Java statement.
- Most Java statements must end with a semicolon.

Example:

    int age = 15;
    System.out.println(age);

**Important:** A class declaration and method declaration do not end with semicolons. Their bodies are defined using curly braces.

---

## 3. Understanding the Complete Program

    public class Main {

        public static void main(String[] args) {

            System.out.println("Hello, World!");

        }

    }

| Component | Meaning |
|---|---|
| public | Access modifier |
| class | Keyword used to define a class |
| Main | Class name |
| { } | Defines a block of code |
| static | Makes the method belong to the class |
| void | Indicates that the method returns no value |
| main | Entry-point method name |
| String | Class used to represent text |
| [] | Represents an array |
| args | Name of the command-line argument array |
| System | Predefined Java class |
| out | Standard output stream |
| println() | Prints output and moves to the next line |
| " " | Defines a String literal |
| ; | Ends a statement |

---

# 4. Difference Between print() and println()

Java provides two commonly used methods for displaying output:

1. `print()`
2. `println()`

Both methods display information on the console, but they behave differently when it comes to moving to the next line.

## 4.1 The print() Method

The `print()` method displays the given information without automatically moving the cursor to the next line.

### Example:

    public class Main {
        public static void main(String[] args) {

            System.out.print("Hello ");
            System.out.print("World");
            System.out.print("!");

        }
    }

### Output:

    Hello World!

### Explanation:

- The first statement prints `Hello `.
- The second statement prints `World` immediately after it.
- The third statement prints `!` immediately after `World`.
- All three outputs appear on the same line.

**Key Point:** The print() method does not automatically insert a new line after displaying the output.

## 4.2 The println() Method

The `println()` method displays the given information and automatically moves the cursor to the next line.

### Example:

    public class Main {
        public static void main(String[] args) {

            System.out.println("Hello");
            System.out.println("World");
            System.out.println("!");

        }
    }

### Output:

    Hello
    World
    !

### Explanation:

- The first statement prints `Hello` and moves to the next line.
- The second statement prints `World` on the next line.
- The third statement prints `!` on another new line.

**Key Point:** The println() method automatically inserts a line break after displaying the output.

## 4.3 Comparison Between print() and println()

| print() | println() |
|---|---|
| Displays the given output. | Displays the given output. |
| Does not automatically move to the next line. | Automatically moves to the next line. |
| Multiple print() statements can display output on one line. | Multiple println() statements display output on separate lines. |
| Useful when output needs to continue on the same line. | Useful when output needs to appear on separate lines. |

## 4.4 Can We Mix print() and println()?

Yes! We can use both methods in the same program.

### Example:

    public class Main {
        public static void main(String[] args) {

            System.out.print("My name is ");
            System.out.println("Aditya");
            System.out.print("I am learning ");
            System.out.print("Java.");

        }
    }

### Output:

    My name is Aditya
    I am learning Java.

### Explanation:

1. `print()` displays "My name is " without moving to the next line.
2. `println()` displays "Aditya" and then moves to the next line.
3. The next `print()` displays "I am learning ".
4. The final `print()` displays "Java." on the same line.

## 4.5 What Happens When We Use println() Without Arguments?

Java also allows us to use `println()` without passing any information.

Example:

    System.out.println("Hello");
    System.out.println();
    System.out.println("World");

Output:

    Hello

    World

The empty `println()` simply moves the cursor to the next line, leaving a blank line.

---

# 5. Escape Sequences in Java

Sometimes we want to display output in a particular format.

For example:
- Display text on multiple lines.
- Add a tab space between words.
- Print quotation marks inside a sentence.
- Display a backslash character.
- Move the cursor to the beginning of a line.

For these situations, Java provides something called **Escape Sequences**.

## 5.1 What Are Escape Sequences?

Escape sequences are special character combinations that begin with a backslash (`\`) and represent characters or formatting instructions that cannot always be written directly inside a String.

They are commonly used to format output.

For example:

    System.out.println("Hello\nWorld");

Output:

    Hello
    World

Here, `\n` is an escape sequence that moves the text to a new line.

**Important:** An escape sequence starts with a backslash (`\`), not a forward slash (`/`).

## 5.2 Common Escape Sequences in Java

Java supports several escape sequences.

### 1. New Line (\n)

- `\n` moves the text to the next line.
- It is commonly used when we want multiple lines within a single String.

Example:

    System.out.println("Hello\nWorld");

Output:

    Hello
    World

Explanation:

The text after `\n` starts on a new line.

### 2. Horizontal Tab (\t)

- `\t` inserts a horizontal tab space.
- It creates a larger gap between two pieces of text.
- It is useful for arranging information in columns.

Example:

    System.out.println("Name\tAge");
    System.out.println("Aditya\t15");

Output:

    Name    Age
    Aditya  15

Explanation:

The tab character moves the next text to a tab position. The exact spacing depends on the console.

### 3. Backspace (\b)

- `\b` represents a backspace character.
- It moves the cursor one position backwards in many console environments.
- Its visible effect depends on the output environment.

Example:

    System.out.println("ABC\bD");

A console may display:

    ABD

Explanation:

The backspace character moves the cursor backwards. In this example, `D` may overwrite the character at that position.

**Note:** Backspace behaviour can vary between terminals and output environments.

### 4. Carriage Return (\r)

- `\r` represents a carriage return.
- It moves the cursor to the beginning of the current line.
- It does not automatically move the cursor to the next line.

Example:

    System.out.println("Hello\rJava");

In some consoles, the output may appear as:

    Java

Explanation:

The cursor returns to the beginning of the line, allowing subsequent characters to overwrite existing characters.

**Note:** The visible result depends on how the console handles carriage returns.

### 5. Form Feed (\f)

- `\f` represents a form feed character.
- Historically, it was used to move a printer to the beginning of a new page.
- In modern console applications, it usually has no clearly visible effect.

Example:

    System.out.println("Hello\fWorld");

Explanation:

It inserts a form feed character between the two words. The way it is displayed depends on the environment.

### 6. Single Quote (\')

- `\'` represents a single quotation mark.
- It can be used to include a single quote in a character or String literal.

Example:

    System.out.println("It\'s Java!");

Output:

    It's Java!

### 7. Double Quote (\")

- `\"` represents a double quotation mark.
- It allows us to display quotation marks inside a String.
- Normally, double quotation marks indicate the beginning and end of a String, so we use an escape sequence when we want them as part of the text.

Example:

    System.out.println("He said, \"Hello!\"");

Output:

    He said, "Hello!"

### 8. Backslash (\\)

- `\\` represents a single backslash character.
- A backslash normally introduces an escape sequence.
- To display an actual backslash, we write two backslashes.

Example:

    System.out.println("C:\\Users\\Java");

Output:

    C:\Users\Java

Explanation:

Each pair of backslashes represents one actual backslash in the output.

### 9. Unicode Escape (\uXXXX)

- Unicode escapes allow us to represent characters using their Unicode code points.
- The escape begins with `\u`, followed by four hexadecimal digits for a basic Unicode code unit.

Example:

    System.out.println("\u0041");

Output:

    A

Explanation:

`0041` is the Unicode value for the uppercase letter A.

---

## 5.3 Summary of Escape Sequences

| Escape Sequence | Meaning | Purpose |
|---|---|---|
| \n | New Line | Moves text to the next line |
| \t | Horizontal Tab | Inserts tab spacing |
| \b | Backspace | Moves the cursor backwards |
| \r | Carriage Return | Moves the cursor to the beginning of the line |
| \f | Form Feed | Represents a page-break control character |
| \' | Single Quote | Displays a single quotation mark |
| \" | Double Quote | Displays a double quotation mark |
| \\ | Backslash | Displays a backslash |
| \uXXXX | Unicode Escape | Represents a Unicode character |

---

# 6. Practical Examples Using Escape Sequences

Let's combine multiple escape sequences to create properly formatted output.

## Example 1: Displaying Multiple Lines

Code:

    public class Main {
        public static void main(String[] args) {

            System.out.println("Welcome to Java\nLet's start coding!");

        }
    }

Output:

    Welcome to Java
    Let's start coding!

## Example 2: Creating a Table Using Tabs

Code:

    public class Main {
        public static void main(String[] args) {

            System.out.println("Name\tAge\tLanguage");
            System.out.println("Aditya\t15\tJava");
            System.out.println("Rahul\t16\tPython");

        }
    }

Output:

    Name    Age    Language
    Aditya  15     Java
    Rahul   16     Python

Note: Tab alignment depends on the console's tab width.

## Example 3: Displaying Quotation Marks

Code:

    public class Main {
        public static void main(String[] args) {

            System.out.println("\"Programming is fun!\"");

        }
    }

Output:

    "Programming is fun!"

## Example 4: Displaying a Windows File Path

Code:

    public class Main {
        public static void main(String[] args) {

            System.out.println("C:\\Program Files\\Java");

        }
    }

Output:

    C:\Program Files\Java

## Example 5: Combining Multiple Escape Sequences

Code:

    public class Main {
        public static void main(String[] args) {

            System.out.println("STUDENT DETAILS");
            System.out.println("----------------------");
            System.out.println("Name:\tAditya");
            System.out.println("Age:\t15");
            System.out.println("Course:\tJava");
            System.out.println("Quote:\t\"Keep Learning!\"");

        }
    }

Output:

    STUDENT DETAILS
    ----------------------
    Name:   Aditya
    Age:    15
    Course: Java
    Quote:  "Keep Learning!"

---

# 7. Important Things to Remember

1. Java is case-sensitive. `System` and `system` are different.
2. Every opening curly brace `{` must have a matching closing brace `}`.
3. A public class should have the same name as its source file.
4. The main method is the traditional entry point of a Java application.
5. `main` is a method name, not a reserved keyword.
6. `String` is a predefined Java class.
7. `System.out.println()` is used to display output.
8. `print()` does not automatically move to the next line.
9. `println()` automatically moves to the next line.
10. An empty `println()` creates a blank line.
11. Escape sequences begin with a backslash (`\`).
12. `\n` creates a new line, while `\t` inserts a horizontal tab.
13. `\"` is used to display double quotation marks inside a String.
14. `\\` is used to display an actual backslash.

---

# 8. Practice Questions

## A. Conceptual Questions

1. What is the Hello World program?
2. Why do we write a main method in a traditional Java application?
3. What is the purpose of the `public` keyword?
4. What is a class in Java?
5. What is an identifier? Is `Main` a keyword or an identifier?
6. Explain the meaning of `static` in the main method.
7. What does `void` indicate?
8. What is the purpose of `String[] args`?
9. What is the difference between a keyword and an identifier?
10. What is the purpose of `System.out.println()`?
11. What is the difference between `print()` and `println()`?
12. Can we use `println()` without passing any arguments?
13. What are escape sequences?
14. Why do we use a backslash in escape sequences?
15. What is the difference between `\n` and `\t`?
16. How can we display double quotation marks inside a String?
17. How can we display a backslash in Java?
18. What is the purpose of the semicolon in Java?

## B. Predict the Output

### Question 1

    System.out.print("Hello");
    System.out.print("Java");

### Question 2

    System.out.println("Hello");
    System.out.println("Java");

### Question 3

    System.out.print("Hello\n");
    System.out.print("World");

### Question 4

    System.out.println("Java\tProgramming");

### Question 5

    System.out.println("\"Hello World!\"");

### Question 6

    System.out.println("A\\B\\C");

### Question 7

    System.out.print("Good ");
    System.out.println("Morning");
    System.out.print("Welcome!");

## C. Programming Tasks

1. Write a Java program to print your name, age, and school on separate lines.
2. Write a program that displays the message "Welcome to Java Programming!".
3. Write a program to display your name and class using tab spacing.
4. Write a program to print the following output:

       Name: Aditya
       Language: Java
       Level: Beginner

5. Write a program to display the following sentence with quotation marks:

       "Programming is the language of technology."

6. Write a program to display a Windows file path using the correct escape sequence.
7. Write a program that uses both `print()` and `println()` to display three sentences.
8. Write a program that uses `\n` and `\t` together to display formatted student information.

---

# 9. Module Summary

In this module, we learned how to write our first Java program and understood the different components that make it work.

We explored:

- The structure of a basic Java program.
- The meaning of `public`, `class`, `static`, and `void`.
- The purpose of the main method.
- The role of `String[] args`.
- The meaning of `System.out.println()`.
- The difference between `print()` and `println()`.
- The concept and purpose of escape sequences.
- Common escape sequences such as `\n`, `\t`, `\b`, `\r`, `\"`, and `\\`.
- Practical ways to format console output.

**The most important takeaway:** Writing a program is not just about knowing what to type. It is about understanding why each instruction is written and how the computer executes it.

END OF MODULE 2