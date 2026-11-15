# Module 13: User-Defined Methods (Functions) - Part 1

## 1. Introduction to Methods

A method in Java is a block of code that performs a specific task and can be executed whenever it is called.

Methods help us divide a large program into smaller, manageable parts, making the code easier to understand, reuse, debug and maintain.

Instead of writing the same code repeatedly, we can create a method once and call it whenever required.

### Why Do We Use Methods?

1. **Code Reusability:** Write code once and use it multiple times.
2. **Code Organisation:** Divide a large program into smaller sections.
3. **Easy Debugging:** Identify and fix errors more easily.
4. **Readability:** Make programs easier to understand.
5. **Avoid Repetition:** Prevent writing the same code multiple times.

### Example Without Using Methods

    class Main {
        public static void main(String[] args) {

            System.out.println("Welcome to Java!");
            System.out.println("Welcome to Java!");
            System.out.println("Welcome to Java!");

        }
    }

Here, we have written the same statement three times.

### Example Using Methods

    class Main {

        static void greet() {
            System.out.println("Welcome to Java!");
        }

        public static void main(String[] args) {

            greet();
            greet();
            greet();

        }
    }

Here, we created the method `greet()` once and called it three times.

This makes our program shorter and more organised.

---

## 2. Inbuilt Methods vs User-Defined Methods

Java methods can broadly be classified into two categories:

1. Inbuilt Methods
2. User-Defined Methods

### A. Inbuilt Methods

Inbuilt methods are predefined methods provided by Java through its standard libraries and classes.

We can directly use these methods by calling them according to their requirements.

Examples:

**1. println()**

Used to display output on the screen.

    System.out.println("Hello Java");

**2. nextInt()**

Used to accept an integer input from the user.

    int num = sc.nextInt();

**3. nextLine()**

Used to accept a complete line of text.

    String name = sc.nextLine();

**4. sqrt()**

Used to calculate the square root of a number.

    double result = Math.sqrt(25);

**Output:**

    5.0

**5. pow()**

Used to calculate the power of a number.

    double result = Math.pow(2, 3);

**Output:**

    8.0

### B. User-Defined Methods

User-defined methods are methods created by the programmer to perform specific tasks according to the requirements of a program.

Unlike inbuilt methods, these methods are written by us.

### Example

    class Main {

        static void display() {
            System.out.println("Hello! This is my own method.");
        }

        public static void main(String[] args) {

            display();

        }
    }

**Output:**

    Hello! This is my own method.

### Difference Between Inbuilt and User-Defined Methods

| Inbuilt Methods | User-Defined Methods |
|---|---|
| Predefined by Java. | Created by the programmer. |
| Available through Java libraries and classes. | Written according to program requirements. |
| Used directly by calling them. | Must be declared before they can be called. |
| Examples: `println()`, `nextInt()`, `sqrt()`. | Examples: `display()`, `calculateSum()`, `greet()`. |

---

## 3. Structure of a User-Defined Method

Before discussing different types of methods, let's understand the basic structure of a method.

### General Syntax

    accessModifier static returnType methodName(parameters) {

        // Method body

        // Statements to execute

        return value;
    }

### Explanation of Components

1. **Access Modifier:** Defines the accessibility of a method. Examples include `public`, `private` and `protected`.

2. **static:** Allows a method to be called using the class name without creating an object. We commonly use `static` methods in our beginner programs.

3. **Return Type:** Specifies the type of value a method returns. It can be `int`, `float`, `double`, `String`, etc. If the method does not return anything, we use `void`.

4. **Method Name:** The name used to identify and call the method.

5. **Parameters:** Variables declared inside the method declaration to receive values from the caller. They are optional.

6. **Method Body:** Contains the statements that perform the required task.

7. **Return Statement:** Sends a value back to the calling method when the return type is not `void`.

### Example

    class Main {

        static int add(int a, int b) {

            int sum = a + b;

            return sum;
        }

        public static void main(String[] args) {

            int result = add(10, 20);

            System.out.println("Sum: " + result);

        }
    }

**Output:**

    Sum: 30

---

# 4. Types of User-Defined Methods

Based on the presence or absence of parameters and return values, user-defined methods can be divided into four types:

1. Methods without parameters and without return value.
2. Methods with parameters and without return value.
3. Methods without parameters and with return value.
4. Methods with parameters and with return value.

---

## Type 1: Methods Without Parameters and Without Return Value

These methods neither accept any values from the calling method nor return any value.

They simply execute the statements written inside their method body.

- No parameters are passed.
- Return type is `void`.
- No value is returned.
- They are called directly using their method name.

### Syntax

    static void methodName() {

        // Statements

    }

### Example: Display a Message

    class Main {

        static void greet() {

            System.out.println("Welcome to Java Programming!");
            System.out.println("Let's learn methods.");

        }

        public static void main(String[] args) {

            greet();

        }
    }

**Output:**

    Welcome to Java Programming!
    Let's learn methods.

### Explanation

1. We created a method named `greet()`.
2. Its return type is `void`, meaning it does not return any value.
3. It does not contain any parameters inside its parentheses.
4. In the `main()` method, we called `greet()`.
5. The statements inside the method were executed.

### Another Example: Addition Without Parameters

    class Main {

        static void add() {

            int a = 10;
            int b = 20;

            int sum = a + b;

            System.out.println("Sum: " + sum);

        }

        public static void main(String[] args) {

            add();

        }
    }

**Output:**

    Sum: 30

---

## Type 2: Methods With Parameters and Without Return Value

These methods accept values from the calling method through parameters but do not return any value.

- Parameters are passed during the method call.
- Return type is `void`.
- The method performs its task using the received values.
- No result is returned to the calling method.

### Syntax

    static void methodName(dataType parameter1, dataType parameter2) {

        // Statements

    }

### Example: Addition Using Parameters

    class Main {

        static void add(int a, int b) {

            int sum = a + b;

            System.out.println("Sum: " + sum);

        }

        public static void main(String[] args) {

            add(10, 20);
            add(50, 30);

        }
    }

**Output:**

    Sum: 30
    Sum: 80

### Explanation

1. We created a method named `add()`.
2. It accepts two integer parameters: `a` and `b`.
3. When we call `add(10, 20)`, the values 10 and 20 are passed to the method.
4. These values are received by `a` and `b`.
5. The method calculates their sum and displays it.
6. Since the return type is `void`, no value is returned.

### Parameters vs Arguments

These two terms are closely related but have different meanings.

**Parameters:** Variables declared in the method definition to receive values.

**Arguments:** Actual values passed when calling a method.

Example:

    static void greet(String name) {  // name is a parameter

        System.out.println("Hello " + name);

    }

    public static void main(String[] args) {

        greet("Aditya");  // "Aditya" is an argument

    }

**Output:**

    Hello Aditya

---

## Type 3: Methods Without Parameters and With Return Value

These methods do not accept any values from the calling method but return a value after performing their task.

- No parameters are passed.
- A return type other than `void` is specified.
- The method calculates or generates a value.
- The `return` statement sends the result back to the calling method.

### Syntax

    static returnType methodName() {

        // Statements

        return value;
    }

### Example: Returning a Number

    class Main {

        static int getNumber() {

            int num = 100;

            return num;

        }

        public static void main(String[] args) {

            int result = getNumber();

            System.out.println("Number: " + result);

        }
    }

**Output:**

    Number: 100

### Explanation

1. We created a method named `getNumber()`.
2. It does not accept any parameters.
3. Its return type is `int`, meaning it must return an integer value.
4. The variable `num` stores 100.
5. The `return` statement sends the value of `num` back.
6. The returned value is stored in the `result` variable.

### Another Example: Calculating Square

    class Main {

        static int square() {

            int num = 5;

            return num * num;

        }

        public static void main(String[] args) {

            int result = square();

            System.out.println("Square: " + result);

        }
    }

**Output:**

    Square: 25

---

## Type 4: Methods With Parameters and With Return Value

These methods accept values from the calling method, perform the required operation and return the calculated result.

This type is particularly useful when we want to perform calculations and use the returned result somewhere else in our program.

- Parameters are passed during the method call.
- A specific return type is declared.
- The method performs operations using the received values.
- The result is returned using the `return` statement.

### Syntax

    static returnType methodName(dataType parameter1, dataType parameter2) {

        // Statements

        return value;
    }

### Example: Addition Using Parameters and Return Value

    class Main {

        static int add(int a, int b) {

            int sum = a + b;

            return sum;

        }

        public static void main(String[] args) {

            int result = add(10, 20);

            System.out.println("Sum: " + result);

        }
    }

**Output:**

    Sum: 30

### Explanation

1. We created a method named `add()`.
2. It accepts two integer parameters: `a` and `b`.
3. The values 10 and 20 are passed during the method call.
4. The method calculates their sum.
5. The `return` statement sends the calculated sum back to `main()`.
6. The returned value is stored in the variable `result`.
7. Finally, the result is displayed.

### Another Example: Finding the Greatest Number

    class Main {

        static int greatest(int a, int b) {

            return (a > b) ? a : b;

        }

        public static void main(String[] args) {

            int result = greatest(25, 40);

            System.out.println("Greatest Number: " + result);

        }
    }

**Output:**

    Greatest Number: 40

---

# 5. Comparison of All Four Types of Methods

| Type | Parameters | Return Value | Return Type |
|---|---|---|---|
| Type 1 | No | No | void |
| Type 2 | Yes | No | void |
| Type 3 | No | Yes | Based on returned value |
| Type 4 | Yes | Yes | Based on returned value |

### Quick Reference

**Type 1:**

    static void display() {
        System.out.println("Hello");
    }

**Type 2:**

    static void display(String name) {
        System.out.println("Hello " + name);
    }

**Type 3:**

    static int getNumber() {
        return 10;
    }

**Type 4:**

    static int add(int a, int b) {
        return a + b;
    }

---

# 6. Important Points to Remember

1. A method is a block of code designed to perform a specific task.
2. Methods help improve code reusability and organisation.
3. Inbuilt methods are predefined by Java, whereas user-defined methods are created by programmers.
4. The `void` keyword indicates that a method does not return any value.
5. Parameters are variables declared in the method definition.
6. Arguments are actual values passed during the method call.
7. The return type specifies the type of value a method sends back.
8. The `return` statement is used to return a value from a method.
9. A method can accept multiple parameters.
10. The data types of arguments must be compatible with the corresponding parameters.
11. A method must be called to execute its body.
12. In our examples, `static` allows us to call methods directly from `main()` without creating an object.

---
