# Module 15: Methods in Different Classes, Static and Non-Static Methods

## 1. Creating a Method in Another Class

In Java, we can create methods inside different classes and access them from another class.

This helps us organize our code into separate classes and makes programs easier to manage and reuse.

### Example

    class Calculator {

        public void add() {
            int a = 10;
            int b = 20;

            System.out.println("Sum = " + (a + b));
        }

    }

    public class main {

        public static void main(String[] args) {

            Calculator obj = new Calculator();

            obj.add();

        }

    }

### Output

    Sum = 30

### Explanation

1. We created a class named `Calculator`.
2. Inside it, we created a method named `add()`.
3. In the `main` class, we created an object of the `Calculator` class.
4. We accessed the `add()` method using the object.
5. The method executed and printed the sum.

### Syntax

    ClassName objectName = new ClassName();

    objectName.methodName();

---

## 2. Accessing a Method from Another Class

To access a method from another class, we generally follow these steps:

1. Create the class containing the method.
2. Create an object of that class (if the method is non-static).
3. Use the object name followed by the dot (`.`) operator.
4. Call the method using its name and parentheses.

### Example with Parameters and Return Value

    class Maths {

        public int square(int number) {

            return number * number;

        }

    }

    public class main {

        public static void main(String[] args) {

            Maths obj = new Maths();

            int result = obj.square(5);

            System.out.println("Square = " + result);

        }

    }

### Output

    Square = 25

### Explanation

- `Maths` is the class containing the method.
- `square()` accepts an integer parameter.
- It calculates the square and returns the result.
- We store the returned value in the `result` variable.

---

## 3. Static Methods

A **static method** is a method that belongs to the class rather than an individual object.

We use the `static` keyword to declare a static method.

### Syntax

    static returnType methodName(parameters) {

        // Method body

    }

### Example

    class Greeting {

        public static void sayHello() {

            System.out.println("Hello, Welcome to Java!");

        }

    }

    public class main {

        public static void main(String[] args) {

            Greeting.sayHello();

        }

    }

### Output

    Hello, Welcome to Java!

### Explanation

1. We created a class named `Greeting`.
2. Inside it, we created a static method `sayHello()`.
3. We accessed the method using the class name `Greeting`.
4. We did not need to create an object.

### Important Points

- Static methods belong to the class.
- They can be called directly using the class name.
- An object is not required to access them.
- The `main()` method is also static.
- Static methods cannot directly access non-static instance variables or methods.

---

## 4. Non-Static Methods

A **non-static method** is a method that belongs to an object of a class.

It does not use the `static` keyword.

To access a non-static method from another class, we generally need to create an object of that class.

### Syntax

    returnType methodName(parameters) {

        // Method body

    }

### Example

    class Student {

        public void displayName() {

            System.out.println("My name is Aditya");

        }

    }

    public class main {

        public static void main(String[] args) {

            Student obj = new Student();

            obj.displayName();

        }

    }

### Output

    My name is Aditya

### Explanation

1. We created a class named `Student`.
2. We declared a non-static method `displayName()`.
3. In the `main()` method, we created an object of the `Student` class.
4. We called the method using the object name.

### Important Points

- Non-static methods belong to objects.
- We generally need an object to call them from another class.
- Different objects can have their own instance data.
- Non-static methods can directly access both static and non-static members of their class.

---

## 5. Difference Between Static and Non-Static Methods

| Static Method | Non-Static Method |
|---|---|
| Belongs to the class. | Belongs to an object. |
| Declared using the `static` keyword. | Declared without the `static` keyword. |
| Can be called using the class name. | Generally called using an object. |
| Object creation is not required for access. | An object is generally required for access. |
| Cannot directly access non-static members. | Can directly access static and non-static members. |
| Example: `Math.sqrt()` | Example: `obj.displayName()` |

---

## 6. Calling Static and Non-Static Methods from the Same Class

A static method can directly call another static method of the same class.

However, to call a non-static method from a static method, we need an object.

### Example

    public class main {

        public static void displayStatic() {

            System.out.println("This is a static method");

        }

        public void displayNonStatic() {

            System.out.println("This is a non-static method");

        }

        public static void main(String[] args) {

            // Calling static method directly
            displayStatic();

            // Creating object to call non-static method
            main obj = new main();

            obj.displayNonStatic();

        }

    }

### Output

    This is a static method
    This is a non-static method

### Explanation

- `displayStatic()` can be called directly because it is static.
- `displayNonStatic()` requires an object because it is non-static.
- Since `main()` is static, we create an object to call the non-static method.

---

## 7. The Difference Between Class and Object

### Class

A class is a blueprint or template used to create objects.

Example:

    class Car {

        String color;

        void start() {
            System.out.println("Car started");
        }

    }

### Object

An object is an instance of a class.

Example:

    Car myCar = new Car();

Here:
- `Car` is the class name.
- `myCar` is the object reference variable.
- `new` is used to create an object.
- `Car()` is the constructor being called.

---

## 8. Quick Revision

### Static Method

    class Demo {

        public static void show() {
            System.out.println("Static Method");
        }

    }

    // Accessing it
    Demo.show();

### Non-Static Method

    class Demo {

        public void show() {
            System.out.println("Non-Static Method");
        }

    }

    // Accessing it
    Demo obj = new Demo();
    obj.show();

### Important Points to Remember

1. Methods can be created inside different classes.
2. We can access methods of another class using the dot (`.`) operator.
3. Static methods belong to the class.
4. Non-static methods belong to objects.
5. Static methods can be accessed using the class name.
6. Non-static methods generally require an object for access.
7. The `main()` method is static because Java must be able to start program execution without creating an object of the main class.
8. A static method cannot directly access non-static members.
9. A non-static method can directly access both static and non-static members of its class.

**Final Concept:**

- Static method → Class name → Method call
- Non-static method → Object creation → Method call