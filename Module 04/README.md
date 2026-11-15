# MODULE 4: COMMENTS AND TYPES OF VARIABLES IN JAVA

## 1. COMMENTS IN JAVA

Comments are statements written inside a program to explain the code. They are ignored by the Java compiler and are not executed.

Comments make code easier to understand, read, and maintain.

### Types of Comments in Java

Java supports three types of comments:

### 1.1 Single-Line Comments

A single-line comment is used to write a comment in one line.

**Syntax:**

    // This is a single-line comment

**Example:**

    public class Main {
        public static void main(String[] args) {
            // Printing a welcome message
            System.out.println("Welcome to Java");
        }
    }

**Output:**

    Welcome to Java

### 1.2 Multi-Line Comments

Multi-line comments are used when we need to write comments across multiple lines.

They begin with `/*` and end with `*/`.

**Syntax:**

    /*
    This is a multi-line comment.
    It can contain multiple lines.
    */

**Example:**

    public class Main {
        public static void main(String[] args) {
            /*
             This program demonstrates
             multi-line comments in Java.
            */
            System.out.println("Learning Java");
        }
    }

**Output:**

    Learning Java

### 1.3 Documentation Comments

Documentation comments are used to generate documentation for Java classes, methods, and other program elements.

They begin with `/**` and end with `*/`.

They are commonly used with the Javadoc tool.

**Syntax:**

    /**
     * Description of the class or method.
     */

**Example:**

    /**
     * This class demonstrates documentation comments.
     */
    public class Main {

        /**
         * This method prints a welcome message.
         */
        public static void main(String[] args) {
            System.out.println("Welcome");
        }
    }

### Quick Comparison

| Type | Syntax | Purpose |
|---|---|---|
| Single-line | `//` | Comment on one line |
| Multi-line | `/* */` | Comment across multiple lines |
| Documentation | `/** */` | Generate program documentation |

---

## 2. TYPES OF VARIABLES IN JAVA

A variable is a named memory location used to store data in a program.

In Java, variables can be classified into different types according to where they are declared and how they are used.

In this module, we will study four types of variables:

1. Local Variables
2. Instance Variables
3. Static Variables
4. Final Variables

---

## 2.1 LOCAL VARIABLES

A local variable is a variable declared inside a method, constructor, or block of code.

It can only be accessed within the method, constructor, or block in which it is declared.

### Example

    public class Main {

        public static void main(String[] args) {

            int age = 15; // Local variable

            System.out.println("Age: " + age);
        }
    }

**Output:**

    Age: 15

### Characteristics of Local Variables

- Declared inside a method, constructor, or block.
- Their scope is limited to the block in which they are declared.
- They cannot be accessed outside that block.
- They must be initialized before they are used.
- They do not receive default values automatically.

### Example: Scope of a Local Variable

    public class Main {

        public static void main(String[] args) {

            int number = 10;

            System.out.println(number);

        }

    }

Here, `number` can only be accessed inside the `main()` method.

---

## 2.2 INSTANCE VARIABLES

An instance variable is a variable declared inside a class but outside all methods, constructors, and blocks.

It belongs to an individual object of the class.

Every object gets its own separate copy of instance variables.

### Example

    public class Student {

        String name;
        int age;

        public static void main(String[] args) {

            Student s1 = new Student();

            s1.name = "Aditya";
            s1.age = 15;

            System.out.println("Name: " + s1.name);
            System.out.println("Age: " + s1.age);
        }
    }

**Output:**

    Name: Aditya
    Age: 15

### Characteristics of Instance Variables

- Declared inside a class but outside methods, constructors, and blocks.
- Each object gets its own separate copy.
- They are accessed using an object of the class.
- They receive default values if not explicitly initialized.
- Their values can be different for different objects.

### Example: Different Objects, Different Values

    public class Student {

        String name;

        public static void main(String[] args) {

            Student s1 = new Student();
            Student s2 = new Student();

            s1.name = "Aditya";
            s2.name = "Rahul";

            System.out.println(s1.name);
            System.out.println(s2.name);
        }
    }

**Output:**

    Aditya
    Rahul

Here, both objects have their own separate copies of the `name` variable.

---

## 2.3 STATIC VARIABLES

A static variable is a variable declared using the `static` keyword inside a class but outside methods, constructors, and blocks.

It belongs to the class rather than individual objects.

Only one shared copy of a static variable exists for the entire class.

### Syntax

    static dataType variableName;

### Example

    public class Student {

        static String school = "CM Shri School";

        String name;

        public static void main(String[] args) {

            Student s1 = new Student();
            Student s2 = new Student();

            s1.name = "Aditya";
            s2.name = "Rahul";

            System.out.println(s1.name + " - " + s1.school);
            System.out.println(s2.name + " - " + s2.school);
        }
    }

**Output:**

    Aditya - CM Shri School
    Rahul - CM Shri School

### Characteristics of Static Variables

- Declared using the `static` keyword.
- Belong to the class rather than individual objects.
- Only one shared copy exists for the class.
- Their values are shared among all objects.
- They can be accessed using the class name.
- They receive default values if not explicitly initialized.

### Accessing Static Variables

A static variable can be accessed using the class name.

**Example:**

    public class Student {

        static String school = "CM Shri School";

        public static void main(String[] args) {

            System.out.println(Student.school);

        }
    }

**Output:**

    CM Shri School

### Instance Variable vs Static Variable

| Instance Variable | Static Variable |
|---|---|
| Belongs to an object | Belongs to a class |
| Each object has its own copy | Only one shared copy exists |
| Declared without the `static` keyword | Declared using the `static` keyword |
| Accessed using an object | Can be accessed using the class name |
| Values can differ between objects | Value is shared among objects |

---

## 2.4 FINAL VARIABLES

A final variable is a variable declared using the `final` keyword.

Once a final variable has been assigned a value, that value cannot be reassigned.

The `final` keyword is used when we want to make a variable constant.

### Syntax

    final dataType variableName = value;

### Example

    public class Main {

        public static void main(String[] args) {

            final int AGE = 15;

            System.out.println(AGE);

        }
    }

**Output:**

    15

### Characteristics of Final Variables

- Declared using the `final` keyword.
- Once initialized, their value cannot be reassigned.
- They are useful for representing constant values.
- A final variable must be initialized before it is used.
- Reassigning a final variable causes a compilation error.

### Example: Reassigning a Final Variable

    public class Main {

        public static void main(String[] args) {

            final int number = 10;

            number = 20; // Compilation error

            System.out.println(number);
        }
    }

**Explanation:**

The variable `number` is declared as final and initialized with the value `10`.

Trying to assign `20` to it again causes a compilation error.

### Final Instance Variables

An instance variable can also be declared as final.

A final instance variable must be initialized either:

- At the time of declaration, or
- Inside the constructor.

**Example:**

    public class Student {

        final int rollNumber;

        Student(int rollNumber) {
            this.rollNumber = rollNumber;
        }

        public static void main(String[] args) {

            Student s1 = new Student(13);

            System.out.println(s1.rollNumber);
        }
    }

**Output:**

    13

Here, the final instance variable `rollNumber` is initialized through the constructor.

After initialization, its value cannot be reassigned.

### Static Final Variables

A variable can be declared using both `static` and `final` keywords.

A static final variable is commonly used to represent a constant shared by the entire class.

**Example:**

    public class Main {

        static final double PI = 3.14159;

        public static void main(String[] args) {

            System.out.println(PI);

        }
    }

**Output:**

    3.14159

### Important Points About Final Variables

- `final` prevents reassignment of a variable.
- `static` makes a variable belong to the class.
- `static final` is commonly used for class-level constants.
- Final variables are often written in uppercase letters when used as constants.
- A final reference variable cannot refer to another object after initialization, but the object's internal data may still be modified if that object is mutable.

---

## 3. COMPARISON OF THE FOUR TYPES OF VARIABLES

| Feature | Local | Instance | Static | Final |
|---|---|---|---|---|
| Declaration | Inside a method, constructor, or block | Inside a class, outside methods and constructors | Inside a class using `static` | Using `final` |
| Belongs to | A particular block or method | An object | A class | Depends on where it is declared |
| Separate copy for each object | No | Yes | No | Depends on its declaration |
| Default value | No | Yes | Yes | Depends on its declaration |
| Reassignment | Allowed | Allowed | Allowed | Not allowed after initialization |
| Access | Within its scope | Through an object | Through the class name or an object | Depends on its scope |

**Important Note:**

The `final` keyword is a modifier, not a separate storage category like local, instance, or static. It can be used with variables of these categories to prevent reassignment.

---

## 4. DEFAULT VALUES OF INSTANCE AND STATIC VARIABLES

Instance and static variables receive default values if they are not explicitly initialized.

| Data Type | Default Value |
|---|---|
| byte | 0 |
| short | 0 |
| int | 0 |
| long | 0L |
| float | 0.0f |
| double | 0.0d |
| char | '\u0000' |
| boolean | false |
| Reference types | null |

**Important:** Local variables do not receive default values. They must be initialized before use.

---

## 5. COMBINED EXAMPLE

The following program demonstrates local, instance, static, and final variables together.

    public class Student {

        // Instance variable
        String name;

        // Static variable
        static String school = "CM Shri School";

        // Final variable
        final int rollNumber;

        Student(String name, int rollNumber) {

            this.name = name;
            this.rollNumber = rollNumber;
        }

        public void display() {

            // Local variable
            int age = 15;

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("School: " + school);

        }

        public static void main(String[] args) {

            Student s1 = new Student("Aditya", 13);

            s1.display();

        }
    }

**Output:**

    Name: Aditya
    Age: 15
    Roll Number: 13
    School: CM Shri School

### Understanding the Program

- `name` is an instance variable because it belongs to an individual student object.
- `school` is a static variable because it is shared by all student objects.
- `rollNumber` is a final instance variable because its value cannot be reassigned after initialization.
- `age` is a local variable because it is declared inside the `display()` method.

---

## 6. IMPORTANT POINTS TO REMEMBER

1. Comments are ignored by the Java compiler.
2. Java supports single-line, multi-line, and documentation comments.
3. Local variables are declared inside methods, constructors, or blocks.
4. Instance variables belong to individual objects.
5. Static variables belong to the class.
6. Final variables cannot be reassigned after initialization.
7. Local variables must be initialized before use.
8. Instance and static variables receive default values.
9. Static variables can be accessed using the class name.
10. The `final` keyword can be used with local, instance, and static variables.