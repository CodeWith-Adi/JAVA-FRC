# Module 7: Scanner Class and User Input in Java

## 1. Introduction to Scanner Class

In Java, the `Scanner` class is used to take input from the user during program execution.

It allows a program to accept different types of input, such as:
- Integers
- Decimal numbers
- Characters (using String methods)
- Strings
- Boolean values

The `Scanner` class belongs to the `java.util` package, so we must import it before using it.

### Syntax

    import java.util.Scanner;

### Creating a Scanner Object

To take input, we need to create an object of the Scanner class.

    Scanner sc = new Scanner(System.in);

**Explanation:**
- `Scanner` is the class name.
- `sc` is the object name.
- `new` is used to create an object.
- `System.in` represents the standard input stream (keyboard).

### Complete Example

    import java.util.Scanner;

    class Main {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.println("Hello, " + name);
        }
    }

---

## 2. Scanner Class Methods

The Scanner class provides different methods to accept various types of input.

### A. nextInt()

- Used to accept an integer value.
- It reads the next integer entered by the user.
- It does not accept decimal values as integers.

**Syntax:**

    int num = sc.nextInt();

**Example:**

    System.out.print("Enter your age: ");
    int age = sc.nextInt();

    System.out.println("Your age is: " + age);

### B. nextFloat()

- Used to accept a floating-point number.
- It returns a value of type `float`.

**Syntax:**

    float num = sc.nextFloat();

**Example:**

    System.out.print("Enter your marks: ");
    float marks = sc.nextFloat();

    System.out.println("Your marks are: " + marks);

### C. nextDouble()

- Used to accept a double-precision decimal number.
- It provides greater precision than the float data type.

**Syntax:**

    double num = sc.nextDouble();

**Example:**

    System.out.print("Enter your percentage: ");
    double percentage = sc.nextDouble();

    System.out.println("Percentage: " + percentage);

### D. nextLong()

- Used to accept a long integer value.
- It is useful when the number is larger than the range of the int data type.

**Syntax:**

    long num = sc.nextLong();

**Example:**

    System.out.print("Enter a large number: ");
    long number = sc.nextLong();

    System.out.println("Number: " + number);

### E. nextShort()

- Used to accept a short integer value.
- It returns a value of type `short`.

**Syntax:**

    short num = sc.nextShort();

**Example:**

    System.out.print("Enter a short number: ");
    short number = sc.nextShort();

    System.out.println("Number: " + number);

### F. nextByte()

- Used to accept a byte integer value.
- It returns a value of type `byte`.

**Syntax:**

    byte num = sc.nextByte();

**Example:**

    System.out.print("Enter a byte value: ");
    byte number = sc.nextByte();

    System.out.println("Number: " + number);

### G. nextBoolean()

- Used to accept a Boolean value.
- It accepts only `true` or `false` (case-insensitive).

**Syntax:**

    boolean value = sc.nextBoolean();

**Example:**

    System.out.print("Are you a student? ");
    boolean isStudent = sc.nextBoolean();

    System.out.println("Student: " + isStudent);

### H. next()

- Used to accept a single word as a String.
- It stops reading when it encounters whitespace (space, tab or newline).
- It cannot read a complete sentence containing spaces.

**Syntax:**

    String name = sc.next();

**Example:**

    System.out.print("Enter your first name: ");
    String name = sc.next();

    System.out.println("Name: " + name);

### I. nextLine()

- Used to accept a complete line of text.
- It can read multiple words, including spaces.
- It stops reading when the user presses Enter.

**Syntax:**

    String sentence = sc.nextLine();

**Example:**

    System.out.print("Enter your full name: ");
    String name = sc.nextLine();

    System.out.println("Full Name: " + name);

---

## 3. Difference Between next() and nextLine()

| next() | nextLine() |
|---|---|
| Reads a single word. | Reads an entire line. |
| Stops at whitespace. | Stops when Enter is pressed. |
| Does not accept spaces within the input. | Accepts spaces within the input. |

**Example:**

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your name using next(): ");
    String name1 = sc.next();

    System.out.print("Enter your name using nextLine(): ");
    String name2 = sc.nextLine();

---

## 4. The nextLine() Buffer Problem

One common problem occurs when we use `nextInt()`, `nextFloat()`, or other token-based input methods before `nextLine()`.

These methods leave the newline character in the input buffer. As a result, the next `nextLine()` may consume that leftover newline instead of waiting for new input.

### Incorrect Example

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your age: ");
    int age = sc.nextInt();

    System.out.print("Enter your name: ");
    String name = sc.nextLine();

    System.out.println("Age: " + age);
    System.out.println("Name: " + name);

**Problem:** The program may skip the name input because `nextLine()` consumes the leftover newline.

### Correct Example

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your age: ");
    int age = sc.nextInt();

    sc.nextLine(); // Consumes the leftover newline

    System.out.print("Enter your name: ");
    String name = sc.nextLine();

    System.out.println("Age: " + age);
    System.out.println("Name: " + name);

**Solution:** Use an additional `nextLine()` after the numeric input to consume the leftover newline character.

---

## 5. Closing the Scanner

After completing user input, we can close the Scanner object using the `close()` method.

**Syntax:**

    sc.close();

**Example:**

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    System.out.println("Number: " + num);

    sc.close();

**Important:** Closing a Scanner connected to `System.in` also closes the standard input stream. Avoid closing it if you still need to take input later in the program.

---

## 6. Complete Example Using Multiple Scanner Methods

    import java.util.Scanner;

    class StudentDetails {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            System.out.print("Enter your percentage: ");
            double percentage = sc.nextDouble();

            System.out.print("Are you a student? ");
            boolean isStudent = sc.nextBoolean();

            System.out.println("\n--- Student Details ---");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Percentage: " + percentage);
            System.out.println("Student: " + isStudent);

            sc.close();
        }
    }

---

## 7. Quick Revision

| Method | Return Type | Purpose |
|---|---|---|
| `nextInt()` | int | Reads an integer |
| `nextFloat()` | float | Reads a float |
| `nextDouble()` | double | Reads a double |
| `nextLong()` | long | Reads a long integer |
| `nextShort()` | short | Reads a short integer |
| `nextByte()` | byte | Reads a byte integer |
| `nextBoolean()` | boolean | Reads true or false |
| `next()` | String | Reads a single word |
| `nextLine()` | String | Reads a complete line |
| `close()` | void | Closes the Scanner |

## 8. Important Points to Remember

1. The Scanner class belongs to the `java.util` package.
2. We must import Scanner before using it.
3. `System.in` is used to receive keyboard input.
4. An object of Scanner class is required to call its non-static methods.
5. `next()` reads a single word, whereas `nextLine()` reads a complete line.
6. Numeric input methods return values of their respective primitive data types.
7. The `nextLine()` buffer problem can be solved by consuming the leftover newline.
8. Always remember that closing a Scanner connected to `System.in` closes the underlying input stream.
9. If the user enters an incompatible value, Scanner may throw an `InputMismatchException`.

---