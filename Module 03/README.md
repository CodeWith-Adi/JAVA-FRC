# MODULE 3: VARIABLES, DATA TYPES AND FORMATTED OUTPUT IN JAVA

## 1. Introduction to Variables

Imagine developing a program that stores the name, age, and marks of a student.

We need some place in the computer's memory to store this information so that the program can use it whenever required.

This is where **variables** come into the picture.

### What is a Variable?

A variable is a named memory location used to store data that can be accessed and modified during program execution.

In Java, every variable must have a declared data type.

### Example

    public class Main {
        public static void main(String[] args) {

            int age = 15;
            String name = "Aditya";
            double marks = 92.5;

            System.out.println(name);
            System.out.println(age);
            System.out.println(marks);

        }
    }

### Output

    Aditya
    15
    92.5

### Understanding the Variable Declaration

Consider the following statement:

    int age = 15;

It contains three important components:

1. `int` – Data type of the variable.
2. `age` – Name of the variable.
3. `15` – Value assigned to the variable.

The equal sign (`=`) is called the assignment operator. It assigns the value on its right to the variable on its left.

### Variable Declaration and Initialization

These are two important terms in Java.

**A. Variable Declaration**

Declaring a variable means specifying its data type and name.

Example:

    int age;

Here, we have declared a variable named `age` of type `int`, but we have not assigned it a value.

**B. Variable Initialization**

Initialization means assigning an initial value to a variable.

Example:

    age = 15;

We can also declare and initialize a variable in a single statement:

    int age = 15;

### Can We Change the Value of a Variable?

Yes! A variable's value can be changed during program execution, provided the new value is compatible with its data type.

Example:

    int age = 15;

    age = 16;

    System.out.println(age);

Output:

    16

**Remember:** A variable stores a value, and that value can change as the program executes.

---

## 2. Rules for Naming Variables in Java

While creating variables, we cannot choose just any name. Java follows certain naming rules.

These rules help the compiler identify variables correctly.

### Rules

1. A variable name must begin with a letter, an underscore (`_`), or a dollar sign (`$`).

2. A variable name cannot begin with a number.

3. A variable name cannot contain spaces.

4. A variable name cannot be a reserved Java keyword.

5. Variable names can contain letters, digits, underscores, and dollar signs.

6. Java is case-sensitive. Therefore, `age`, `Age`, and `AGE` are treated as three different identifiers.

7. Special characters such as `@`, `#`, `%`, and `-` are not allowed in variable names.

8. Variable names should be meaningful and descriptive.

### Valid Variable Names

    int age;
    int studentAge;
    int total_marks;
    int marks1;
    int _count;
    int $amount;

### Invalid Variable Names

    int 1age;          // Cannot begin with a number
    int student age;   // Spaces are not allowed
    int total-marks;   // Hyphen is not allowed
    int @price;        // Special character is not allowed
    int class;         // Reserved keyword cannot be used

### Java Naming Convention

Apart from the official naming rules, Java programmers follow certain naming conventions to make code readable.

A naming convention is a recommended way of naming programming elements.

For variables, Java commonly uses **camelCase**.

In camelCase:
- The first word begins with a lowercase letter.
- Every following word begins with an uppercase letter.
- There are no spaces between words.

Examples:

    int studentAge;
    double totalMarks;
    String firstName;
    int numberOfStudents;

**Good Practice:** Always use meaningful variable names instead of confusing names such as `a`, `b`, or `x`, unless they are appropriate for a short calculation.

---

## 4. Introduction to Data Types

Now that we understand variables, let's understand what kind of information they can store.

Consider these examples:

- Age is generally a whole number.
- Temperature can contain decimal values.
- A person's name contains text.
- A condition can have only two logical values: true or false.

We need different types of variables to store different kinds of information.

### What is a Data Type?

A data type specifies the type of value that a variable can store.

It helps Java determine:
- What kind of data is being stored.
- How the data should be interpreted.
- What operations can be performed on it.
- How memory is managed for that value.

### Categories of Data Types

Java data types are broadly divided into two categories:

1. Primitive Data Types
2. Non-Primitive Data Types

---

# 5. Primitive Data Types

Primitive data types are the basic built-in data types provided by Java.

Java has eight primitive data types.

They are:

1. byte
2. short
3. int
4. long
5. float
6. double
7. char
8. boolean

These data types store simple values directly.

## 5.1 Integer Data Types

Integer data types are used to store whole numbers without decimal points.

Java provides four integer data types.

### A. byte

- `byte` is an 8-bit signed integer data type.
- It occupies 1 byte of memory.
- Its range is -128 to 127.

Example:

    byte age = 15;
    byte temperature = -10;

### B. short

- `short` is a 16-bit signed integer data type.
- It occupies 2 bytes of memory.
- Its range is -32,768 to 32,767.

Example:

    short population = 25000;

### C. int

- `int` is a 32-bit signed integer data type.
- It occupies 4 bytes of memory.
- Its range is -2,147,483,648 to 2,147,483,647.
- It is commonly used for storing whole numbers.

Example:

    int marks = 450;
    int year = 2026;

### D. long

- `long` is a 64-bit signed integer data type.
- It occupies 8 bytes of memory.
- It is used for storing very large whole numbers.
- Long literals can be written with an `L` suffix.

Example:

    long population = 8000000000L;

## 5.2 Floating-Point Data Types

Floating-point data types are used to store numbers containing decimal points.

Java provides two floating-point data types.

### A. float

- `float` is a 32-bit floating-point data type.
- It occupies 4 bytes of memory.
- It provides approximately 6–7 decimal digits of precision.
- A float literal normally requires the `f` or `F` suffix.

Example:

    float percentage = 92.5f;

### B. double

- `double` is a 64-bit floating-point data type.
- It occupies 8 bytes of memory.
- It provides approximately 15–16 decimal digits of precision.
- It is commonly used for decimal calculations.
- Decimal literals are treated as double by default.

Example:

    double pi = 3.1415926535;
    double distance = 125.75;

## 5.3 Character Data Type

### char

- `char` is a 16-bit data type.
- It occupies 2 bytes of memory.
- It stores a single UTF-16 code unit.
- It uses single quotation marks.

Example:

    char grade = 'A';
    char symbol = '#';

**Important:** A `char` stores a single character, whereas a String can store multiple characters.

Example:

    char letter = 'A';
    String name = "Aditya";

## 5.4 Boolean Data Type

### boolean

- `boolean` is used to store logical values.
- It can hold only two values: `true` or `false`.
- It is commonly used in decision-making and conditional statements.

Example:

    boolean isStudent = true;
    boolean isRaining = false;

**Important:** Java does not define a fixed memory size for the boolean type in the language specification.

---

## 5.5 Summary of Primitive Data Types

| Data Type | Size | Range / Description |
|---|---|---|
| byte | 1 byte | -128 to 127 |
| short | 2 bytes | -32,768 to 32,767 |
| int | 4 bytes | Approximately -2.14 billion to +2.14 billion |
| long | 8 bytes | Very large whole numbers |
| float | 4 bytes | Approximately 6–7 decimal digits of precision |
| double | 8 bytes | Approximately 15–16 decimal digits of precision |
| char | 2 bytes | One UTF-16 code unit |
| boolean | Not fixed by specification | true or false |

### Example Using All Eight Primitive Data Types

    public class Main {
        public static void main(String[] args) {

            byte age = 15;
            short year = 2026;
            int marks = 450;
            long population = 8000000000L;

            float percentage = 92.5f;
            double pi = 3.1415926535;

            char grade = 'A';
            boolean isStudent = true;

            System.out.println(age);
            System.out.println(year);
            System.out.println(marks);
            System.out.println(population);
            System.out.println(percentage);
            System.out.println(pi);
            System.out.println(grade);
            System.out.println(isStudent);

        }
    }

---

# 6. Non-Primitive Data Types

Non-primitive data types are types that are not among Java's eight primitive types.

They are used to represent more complex data and objects.

Examples include:

1. String
2. Arrays
3. Classes
4. Interfaces
5. Enums

Unlike primitive variables, variables of class types generally store references to objects rather than the objects' contents directly.

## 6.1 String

A String is used to store a sequence of characters.

It is one of the most commonly used non-primitive types in Java.

Example:

    String name = "Aditya";
    String language = "Java Programming";

Here:
- `String` is the data type.
- `name` and `language` are variable names.
- The values are sequences of characters.

Strings are objects and are immutable, which means their contents cannot be changed after the String object is created.

Example:

    String name = "Java";
    name = "Python";

Here, the variable `name` is assigned a reference to a different String. The original String object itself has not been modified.

## 6.2 Arrays

An array is a data structure used to store multiple values of the same declared component type.

Example:

    int[] marks = {85, 90, 95, 88};

Here:
- `int[]` represents an integer array.
- `marks` is the array variable.
- The array contains four integer values.

We can access individual elements using their index.

    System.out.println(marks[0]);

Output:

    85

**Important:** Array indexing starts from 0.

## 6.3 Classes

A class is a blueprint used to create objects.

It can contain variables and methods.

Example:

    class Student {
        String name;
        int age;
    }

Here, `Student` is a class containing two variables.

We can create an object of this class:

    Student s1 = new Student();

## 6.4 Interfaces

An interface is a reference type in Java that defines a contract that implementing classes must follow.

It is commonly used to achieve abstraction and support flexible program design.

Example:

    interface Animal {
        void sound();
    }

A class can implement this interface and provide the method's implementation.

## 6.5 Enums

An enum is a special Java type used to define a fixed set of named constants.

Example:

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY
    }

Here, `Day` is an enum containing three predefined values.

---

## 6.6 Difference Between Primitive and Non-Primitive Data Types

| Primitive Data Types | Non-Primitive Data Types |
|---|---|
| Built-in basic data types | Classes, arrays, interfaces, enums, and other reference types |
| Store simple values directly | Variables generally store references to objects |
| Have predefined types and ranges | Can represent complex structures |
| Cannot be null | Reference variables can be null |
| Examples: int, char, boolean | Examples: String, arrays, classes |

### Example: Primitive vs Non-Primitive

    int age = 15;

    String name = "Aditya";

In the first statement, `age` is a primitive variable that stores an integer value.

In the second statement, `name` is a reference variable that refers to a String object.

---

# 7. The printf() Statement in Java

So far, we have used `print()` and `println()` to display information.

However, sometimes we need more control over how our output appears.

For example:
- Displaying decimal numbers up to two decimal places.
- Aligning information into columns.
- Displaying numbers with a specific width.
- Combining text and different data types in a formatted manner.

Java provides the `printf()` method for this purpose.

## 7.1 What is printf()?

`printf()` stands for **Print Formatted**.

It is a method of Java's `PrintStream` class that allows us to display formatted output using format specifiers.

It is especially useful when we want control over the appearance of numbers, text, and other values.

### Basic Syntax

    System.out.printf("format string", arguments);

Here:

- `System.out` represents the standard output stream.
- `printf()` is the method used to display formatted output.
- The format string contains normal text and format specifiers.
- Arguments are the values inserted into the specified positions.

### Example

    public class Main {
        public static void main(String[] args) {

            String name = "Aditya";
            int age = 15;

            System.out.printf("My name is %s and I am %d years old.", name, age);

        }
    }

Output:

    My name is Aditya and I am 15 years old.

Here:
- `%s` is replaced by the String value stored in `name`.
- `%d` is replaced by the integer value stored in `age`.

---

## 7.2 What Are Format Specifiers?

Format specifiers are special symbols used inside a format string to indicate how a particular value should be displayed.

They generally begin with a percentage sign (`%`).

Some commonly used format specifiers are:

| Format Specifier | Data Type / Purpose | Example |
|---|---|---|
| %d | Integer | 15 |
| %f | Floating-point number | 92.500000 |
| %s | String | Java |
| %c | Character | A |
| %b | Boolean | true |
| %n | Platform-independent line separator | New line |
| %x | Integer in hexadecimal | f |
| %o | Integer in octal | 17 |

### Example Using Different Format Specifiers

    public class Main {
        public static void main(String[] args) {

            int age = 15;
            float percentage = 92.5f;
            String name = "Aditya";
            char grade = 'A';
            boolean isStudent = true;

            System.out.printf("Name: %s%n", name);
            System.out.printf("Age: %d%n", age);
            System.out.printf("Percentage: %f%n", percentage);
            System.out.printf("Grade: %c%n", grade);
            System.out.printf("Student: %b%n", isStudent);

        }
    }

Output:

    Name: Aditya
    Age: 15
    Percentage: 92.500000
    Grade: A
    Student: true

**Important:** `%n` inserts a platform-independent line separator. Unlike `%n`, `%f` displays six digits after the decimal point by default.

---

## 7.3 Controlling Decimal Places

One of the most useful features of `printf()` is controlling the number of decimal places.

The syntax is:

    %.nf

Here, `n` represents the number of digits to display after the decimal point.

### Example 1: Two Decimal Places

    double price = 99.9876;

    System.out.printf("%.2f", price);

Output:

    99.99

### Example 2: Three Decimal Places

    double pi = 3.14159265;

    System.out.printf("%.3f", pi);

Output:

    3.142

### Example 3: No Decimal Places

    double number = 45.89;

    System.out.printf("%.0f", number);

Output:

    46

**Important:** Formatting with precision can round the displayed value. It does not change the original variable.

---

## 7.4 Controlling Width and Alignment

`printf()` also allows us to control the minimum width allocated to a value.

This is useful for creating neatly aligned output.

### Example

    int number = 25;

    System.out.printf("%5d", number);

Output:

        25

Explanation:

- `%5d` means the integer should occupy a minimum width of five character positions.
- The number is right-aligned by default.
- Spaces are added before the number to fill the remaining positions.

### Left Alignment

We can use a minus sign (`-`) to left-align the output.

Example:

    System.out.printf("%-5d", 25);

Output:

    25   

Here, spaces are added after the number instead of before it.

### Combining Width and Decimal Precision

Example:

    double price = 45.6789;

    System.out.printf("%8.2f", price);

Output:

       45.68

Explanation:

- `8` specifies the minimum total width.
- `.2` specifies two digits after the decimal point.
- `f` indicates a floating-point value.

---

## 7.5 Difference Between print(), println(), and printf()

| print() | println() | printf() |
|---|---|---|
| Displays output | Displays output | Displays formatted output |
| Does not automatically move to the next line | Moves to the next line | Does not automatically move to the next line |
| Does not provide format-specifier formatting | Does not provide format-specifier formatting | Supports format specifiers |
| Useful for simple output | Useful for output on separate lines | Useful for controlling output appearance |

### Example Comparing All Three

    public class Main {
        public static void main(String[] args) {

            int age = 15;

            System.out.print("Age: ");
            System.out.println(age);

            System.out.printf("Age: %d years%n", age);

        }
    }

Output:

    Age: 15
    Age: 15 years

**Remember:**
- Use `print()` for simple output on the same line.
- Use `println()` for simple output followed by a new line.
- Use `printf()` when you need formatted output.

---

# 8. Practical Program: Student Information System

Let's combine variables, data types, and formatted output in one program.

### Program

    public class Main {
        public static void main(String[] args) {

            String name = "Aditya";
            int age = 15;
            char grade = 'A';
            double percentage = 92.5678;
            boolean isStudent = true;

            System.out.println("STUDENT INFORMATION");
            System.out.println("----------------------------");

            System.out.printf("Name: %s%n", name);
            System.out.printf("Age: %d%n", age);
            System.out.printf("Grade: %c%n", grade);
            System.out.printf("Percentage: %.2f%%%n", percentage);
            System.out.printf("Student: %b%n", isStudent);

        }
    }

### Output

    STUDENT INFORMATION
    ----------------------------
    Name: Aditya
    Age: 15
    Grade: A
    Percentage: 92.57%
    Student: true

### Understanding the Program

1. We declared five variables using different data types.
2. `String` stores the student's name.
3. `int` stores the student's age.
4. `char` stores the grade.
5. `double` stores the percentage.
6. `boolean` stores whether the person is a student.
7. We used `println()` to display the headings.
8. We used `printf()` to display formatted information.
9. `%.2f` displays the percentage up to two decimal places.
10. `%%` displays an actual percentage symbol because `%` is otherwise used to introduce a format specifier.

---

# 9. Important Points to Remember

1. A variable is a named storage location used to store data.
2. Every Java variable must have a declared data type.
3. Declaration means specifying the variable's name and data type.
4. Initialization means assigning an initial value.
5. Java is case-sensitive.
6. Variable names cannot begin with a number.
7. Reserved keywords cannot be used as variable names.
8. Java commonly uses camelCase for variable names.
9. Java has eight primitive data types.
10. String, arrays, classes, interfaces, and enums are examples of non-primitive types.
11. Primitive variables store simple values.
12. Reference variables generally hold references to objects.
13. `printf()` is used for formatted output.
14. `%d` is used for integers.
15. `%f` is used for floating-point values.
16. `%.2f` displays two digits after the decimal point.
17. `%s` is used for Strings.
18. `%c` is used for characters.
19. `%b` is used for boolean values.
20. `%n` inserts a platform-independent line separator.
21. `%%` displays a percentage symbol.
