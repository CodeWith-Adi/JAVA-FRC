# Module 19: Arrays in Java – Part 1

## 1. What is an Array?

An **Array** is a data structure in Java that stores a fixed number of elements of the same data type in a single variable.

Instead of creating separate variables for every value, we can use an array to store multiple values together.

**Key Properties:**

- Arrays are objects in Java.
- An array stores multiple values using a single variable.
- All elements of an array must have the same data type.
- Arrays have a fixed size, which is decided when they are created.
- Array indexing starts from `0`.
- Each element can be accessed using its index.
- The last index of an array is always `length - 1`.

**Real-Life Analogy:**

Think of an egg tray containing 12 slots.

- Each slot has a fixed position.
- Every slot can hold one egg.
- We can identify each slot using its position.
- Similarly, an array stores multiple elements at different index positions.

**Example**

    int[] marks = { 95, 80, 75, 90, 85 };

Here, `marks` is an array that stores five integer values.

**---**

## 2. Array Declaration

Array declaration means creating an array variable by specifying its data type and name.

At this stage, we only declare the array variable. Memory for its elements is not allocated yet.

**Syntax**

    datatype[] arrayName;

**Example**

    int[] marks;
    String[] names;
    double[] prices;
    boolean[] isPresent;

**Explanation**

- `int` specifies the data type of the array elements.
- `[]` indicates that the variable is an array.
- `marks` is the name of the array.

**Another Valid Declaration Syntax**

    int marks[];

Both `int[] marks;` and `int marks[];` are valid in Java.

**Note:** The preferred convention in Java is `datatype[] arrayName;`.

**---**

## 3. Array Creation

Array creation means allocating memory for the elements of an array.

We use the `new` keyword to create an array and specify its size.

**Syntax**

    arrayName = new datatype[length];

**Example**

    int[] marks;

    marks = new int[7];

**Explanation**

1. We declare an integer array named `marks`.
2. We use the `new` keyword to create the array.
3. `int[7]` creates an array that can store seven integer values.
4. Memory is allocated for seven elements.
5. Each element receives a default value of `0`.

**Combined Declaration and Creation**

We can declare and create an array in a single statement.

    int[] marks = new int[7];

**Example**

    public class main {

        public static void main(String[] args) {

            int[] marks = new int[5];

            System.out.println(marks[0]);
            System.out.println(marks[1]);
            System.out.println(marks[2]);
            System.out.println(marks[3]);
            System.out.println(marks[4]);

        }

    }

**Output**

    0
    0
    0
    0
    0

**Explanation**

Since this is an integer array, all elements are automatically initialized with the default value `0`.

**---**

## 4. Array Initialization

Array initialization means assigning values to the elements of an array.

There are different ways to initialize an array in Java.

### Method 1: Index-by-Index Initialization

We can assign values to individual array elements using their index positions.

**Syntax**

    arrayName[index] = value;

**Example**

    public class main {

        public static void main(String[] args) {

            int[] marks = new int[5];

            marks[0] = 95;
            marks[1] = 70;
            marks[2] = 80;
            marks[3] = 66;
            marks[4] = 90;

        }

    }

**Explanation**

- `marks[0] = 95` assigns `95` to the first element.
- `marks[1] = 70` assigns `70` to the second element.
- We continue assigning values using their respective indexes.

### Method 2: Inline Array Initialization

We can initialize an array directly while declaring it by using curly braces `{}`.

**Syntax**

    datatype[] arrayName = { value1, value2, value3 };

**Example**

    public class main {

        public static void main(String[] args) {

            int[] marks = { 50, 70, 80, 66, 90, 83, 35 };

            System.out.println(marks[0]);
            System.out.println(marks[1]);
            System.out.println(marks[2]);

        }

    }

**Output**

    50
    70
    80

**Explanation**

- We declare an integer array named `marks`.
- The values are assigned directly inside curly braces.
- Java automatically determines the size of the array.
- The array contains seven elements.

**Note:** When using inline initialization, we do not need to use the `new` keyword explicitly.

**---**

## 5. Understanding Array Indexing

Every element in an array has an index that represents its position.

Array indexing in Java starts from `0`, not `1`.

**Example**

    int[] marks = { 95, 70, 80, 66, 90 };

**Array Representation**

| Element | 95 | 70 | 80 | 66 | 90 |
|---|---|---|---|---|---|
| Index | 0 | 1 | 2 | 3 | 4 |

**Important Points**

- The first element is stored at index `0`.
- The second element is stored at index `1`.
- The third element is stored at index `2`.
- The last element is stored at index `length - 1`.
- The total number of elements is given by the array's `length` property.

For example:

    int[] marks = { 95, 70, 80, 66, 90 };

    System.out.println(marks.length); // 5

    System.out.println(marks[0]); // 95
    System.out.println(marks[2]); // 80
    System.out.println(marks[4]); // 90

**Important:** Trying to access an index outside the valid range causes an `ArrayIndexOutOfBoundsException`.

For example:

    System.out.println(marks[5]);

This produces an error because the valid indexes are only `0` to `4`.

**---**

## 6. Accessing and Modifying Array Elements

We can access and modify individual array elements using their index positions.

### 6.1 Accessing Array Elements

To access an element, write the array name followed by the index inside square brackets `[]`.

**Syntax**

    arrayName[index];

**Example**

    public class main {

        public static void main(String[] args) {

            int[] marks = { 50, 70, 80, 66, 90 };

            System.out.println(marks[0]);
            System.out.println(marks[2]);
            System.out.println(marks[4]);

        }

    }

**Output**

    50
    80
    90

### 6.2 Modifying Array Elements

We can change an existing element by assigning a new value to its index.

**Syntax**

    arrayName[index] = newValue;

**Example**

    public class main {

        public static void main(String[] args) {

            int[] marks = { 50, 70, 80, 66, 90 };

            marks[4] = 99;

            System.out.println(marks[4]);

        }

    }

**Output**

    99

**Explanation**

- Initially, the element at index `4` contains `90`.
- We assign `99` to `marks[4]`.
- The previous value is replaced with the new value.
- The array size remains unchanged.

**---**

## 7. Arrays of Different Data Types

Java allows us to create arrays using different data types.

However, all elements within a particular array must belong to the same data type.

### 7.1 Integer Array

An integer array stores multiple integer values.

**Example**

    int[] numbers = { 10, 20, 30, 40, 50 };

    System.out.println(numbers[2]);

**Output**

    30

### 7.2 Double Array

A double array stores decimal values.

**Example**

    double[] prices = { 10.5, 20.75, 30.25 };

    System.out.println(prices[1]);

**Output**

    20.75

### 7.3 String Array

A String array stores multiple String values.

**Example**

    String[] names = { "Riya", "Aryan", "Mira" };

    System.out.println(names[1]);

**Output**

    Aryan

### 7.4 Character Array

A character array stores individual characters.

**Example**

    char[] letters = { 'A', 'B', 'C', 'D' };

    System.out.println(letters[2]);

**Output**

    C

### 7.5 Boolean Array

A boolean array stores only `true` or `false` values.

**Example**

    boolean[] isPresent = { true, false, true };

    System.out.println(isPresent[1]);

**Output**

    false

**---**

## 8. Default Values of Arrays

When we create an array using the `new` keyword without assigning values, Java automatically initializes its elements with default values.

| Data Type | Default Value |
|---|---|
| `byte` | `0` |
| `short` | `0` |
| `int` | `0` |
| `long` | `0L` |
| `float` | `0.0f` |
| `double` | `0.0` |
| `char` | `'\u0000'` |
| `boolean` | `false` |
| Reference types (including String) | `null` |

**Example**

    public class main {

        public static void main(String[] args) {

            int[] numbers = new int[3];

            String[] names = new String[3];

            boolean[] values = new boolean[3];

            System.out.println(numbers[0]);
            System.out.println(names[0]);
            System.out.println(values[0]);

        }

    }

**Output**

    0
    null
    false

**Explanation**

- Integer arrays receive `0` as their default value.
- String arrays receive `null` because String is a reference type.
- Boolean arrays receive `false` as their default value.

**---**

## 9. Important Points to Remember

1. An array is a data structure that stores multiple values of the same data type.
2. Arrays are objects in Java.
3. Array declaration specifies the data type and name of the array.
4. Array creation allocates memory using the `new` keyword.
5. Array initialization assigns values to its elements.
6. Array indexing starts from `0`.
7. The last index is always `length - 1`.
8. The `length` property returns the total number of elements in an array.
9. Array elements can be accessed using square brackets `[]`.
10. Array elements can be modified by assigning new values to their indexes.
11. Arrays have a fixed size after creation.
12. All elements in an array must have the same data type.
13. Java automatically assigns default values to array elements.
14. Accessing an invalid index causes an `ArrayIndexOutOfBoundsException`.
15. Java supports arrays of primitive data types as well as reference types such as String.

**---**

## 10. Quick Revision

### Array Declaration

    int[] marks;

### Array Creation

    marks = new int[5];

### Combined Declaration and Creation

    int[] marks = new int[5];

### Array Initialization

    marks[0] = 95;
    marks[1] = 80;

### Inline Initialization

    int[] marks = { 95, 80, 75, 90, 85 };

### Accessing an Element

    System.out.println(marks[0]);

### Modifying an Element

    marks[2] = 99;

### Finding Array Length

    System.out.println(marks.length);

### String Array

    String[] names = { "Riya", "Aryan", "Mira" };

### Boolean Array

    boolean[] isPresent = { true, false, true };

**Final Concept:** An array allows us to store multiple values of the same data type under a single variable name. Each element is identified using an index, starting from `0`, and the array has a fixed size once created.