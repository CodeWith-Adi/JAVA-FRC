# Module 14: User-Defined Methods (Functions) – Part 2

## 1. Introduction

In Java, methods can receive values when they are called. These values are passed through arguments to the method's parameters.

Java uses **pass by value** to pass arguments to methods.

There are two commonly discussed concepts:

1. Pass by Value
2. Pass by Reference

Understanding the difference helps us understand how Java handles variables and objects when they are passed to methods.

---

## 2. Pass by Value

**Pass by Value** means that a copy of the original variable's value is passed to the method.

- The method receives a separate copy of the value.
- Changes made to the parameter inside the method do not affect the original variable.
- The original variable remains unchanged.

### Example 1: Passing an Integer

    public class main {

        public static void main(String[] args) {

            int number = 10;

            changeNumber(number);

            System.out.println("Original number: " + number);
        }

        public static void changeNumber(int num) {

            num = 50;

            System.out.println("Modified number: " + num);
        }
    }

### Output

    Modified number: 50
    Original number: 10

### Explanation

1. A variable `number` is created with the value `10`.
2. `changeNumber(number)` is called.
3. A copy of the value `10` is passed to the parameter `num`.
4. Inside the method, `num` is changed to `50`.
5. However, the original variable `number` remains `10`.

This happens because the method modifies only its local copy, not the original variable.

---

## 3. Pass by Reference

**Pass by Reference** is a concept in which a method receives a reference to the original variable rather than a separate copy of its value.

In languages that support true pass by reference, changes made through that reference can directly affect the original variable.

### General Example (Conceptual)

    // Conceptual example, not valid Java syntax

    int number = 10;

    changeNumber(number);

    // If the language supports true pass by reference,
    // the original number could become 50.

### Important Note About Java

Java does **not** support true pass by reference.

Java always uses pass by value.

However, when objects are passed to methods, Java passes a copy of the object's reference.

This allows a method to modify the object's contents, but it cannot replace the original reference held by the calling method.

---

## 4. Passing Objects to Methods in Java

When an object is passed to a method:

- A copy of the reference is passed.
- Both the original reference and the copied reference point to the same object.
- Changes made to the object's fields through the method are visible outside the method.
- Reassigning the copied reference does not change the original reference.

### Example 2: Modifying an Object

    class Student {

        String name;

    }

    public class main {

        public static void main(String[] args) {

            Student s1 = new Student();

            s1.name = "Aditya";

            changeName(s1);

            System.out.println("Name: " + s1.name);
        }

        public static void changeName(Student s) {

            s.name = "Rahul";

        }
    }

### Output

    Name: Rahul

### Explanation

1. An object of the `Student` class is created.
2. Its reference is stored in the variable `s1`.
3. The reference is passed to the `changeName()` method.
4. Java creates a copy of the reference and stores it in `s`.
5. Both `s1` and `s` refer to the same object.
6. When `s.name` is changed to `"Rahul"`, the object's actual field is modified.
7. Therefore, `s1.name` also displays `"Rahul"`.

**Remember:** Java passes the reference by value, not the object itself by reference.

---

## 5. Reassigning an Object Reference

Let's understand what happens when we assign a completely new object to the parameter inside a method.

### Example 3: Reassigning an Object

    class Student {

        String name;

    }

    public class main {

        public static void main(String[] args) {

            Student s1 = new Student();

            s1.name = "Aditya";

            changeStudent(s1);

            System.out.println("Name: " + s1.name);
        }

        public static void changeStudent(Student s) {

            s = new Student();

            s.name = "Rahul";

        }
    }

### Output

    Name: Aditya

### Explanation

1. An object is created and its reference is stored in `s1`.
2. The reference is passed to `changeStudent()`.
3. A copy of the reference is stored in `s`.
4. Inside the method, `s` is assigned a new object.
5. Now, `s` points to the new object, while `s1` still points to the original object.
6. Changing `s.name` affects only the new object.
7. Therefore, the original object's name remains `"Aditya"`.

This proves that Java passes a copy of the reference by value.

---

## 6. Difference Between Pass by Value and Pass by Reference

| Pass by Value | Pass by Reference |
|---|---|
| A copy of the value is passed. | A reference to the original variable is passed. |
| Changes to the copied primitive value do not affect the original variable. | Changes through the reference can affect the original variable. |
| The original variable remains unchanged when its copy is modified. | The original variable can be modified through the reference. |
| Used by Java for all method arguments. | True pass by reference is not supported in Java. |

---

## 7. Important Points to Remember

1. Java always uses **Pass by Value**.
2. For primitive data types, a copy of the actual value is passed.
3. For objects, a copy of the reference is passed.
4. Both the original reference and copied reference can point to the same object.
5. Changes to an object's fields through the copied reference are visible outside the method.
6. Reassigning the copied reference does not change the original reference.
7. Java does not support true pass by reference.

---

## 8. Quick Revision

### Primitive Variables

    int a = 10;
    changeValue(a);

    // The original value of a remains 10
    // if the method changes only its parameter.

### Objects

    Student s1 = new Student();
    changeObject(s1);

    // Changes to the object's fields
    // can be visible through s1.

### Final Concept

**Java is always Pass by Value.**

- Primitive argument → Copy of the primitive value.
- Object argument → Copy of the object's reference.

Do not confuse passing a copy of an object reference with true pass by reference.