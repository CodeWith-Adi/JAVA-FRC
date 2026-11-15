# Module 21: 2D Arrays in Java

## 1. What is a 2D Array?

A **2D Array (Two-Dimensional Array)** is an array that stores data in the form of rows and columns, just like a table, grid, or matrix.

Each element is identified using two indices:
- Row index
- Column index

### Real-Life Analogy

Think of a chessboard. It contains multiple rows and columns, and every square has a specific position.

Similarly, a 2D array stores elements in rows and columns.

### Example

    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

Representation:

    Row 0:  1   2   3
    Row 1:  4   5   6
    Row 2:  7   8   9

Here:
- Total rows = 3
- Total columns = 3
- Total elements = 9

---

## 2. Declaration and Creation Syntax

Just like 1D arrays, we first declare a 2D array and allocate memory for it.

### A. Declaration

Syntax:

    datatype[][] arrayName;

Example:

    int[][] matrix;

Here, we have declared a 2D integer array named `matrix`.

### B. Creation (Allocating Memory)

Syntax:

    arrayName = new datatype[rows][columns];

Example:

    matrix = new int[2][3];

This creates:
- 2 rows
- 3 columns
- Total 6 elements

### C. Declaration and Creation Together

We can also declare and create an array in a single statement.

    int[][] matrix = new int[2][3];

### D. Initialization

We can directly initialize a 2D array with values.

    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6}
    };

This creates a 2D array with 2 rows and 3 columns.

---

## 3. Multi-Dimensional Array Hierarchy

Java supports arrays with multiple dimensions.

### A. 1D Array (One-Dimensional Array)

A 1D array stores a single collection of values.

Example: Marks of one student in different subjects.

    int[] marks = {80, 85, 90, 95};

Representation:

    80   85   90   95

### B. 2D Array (Two-Dimensional Array)

A 2D array stores multiple 1D arrays in the form of rows and columns.

Example: Marks of multiple students in different subjects.

    int[][] marks = {
        {80, 85, 90},
        {75, 88, 92},
        {90, 95, 89}
    };

Representation:

    Student 1:  80   85   90
    Student 2:  75   88   92
    Student 3:  90   95   89

### C. 3D Array (Three-Dimensional Array)

A 3D array stores multiple 2D arrays.

Example: Marks of students across multiple classes.

    int[][][] threeDArray = {
        {
            {1, 2},
            {3, 4}
        },
        {
            {5, 6},
            {7, 8}
        }
    };

Here:
- 2 separate 2D arrays
- Each 2D array contains 2 rows
- Each row contains 2 elements

### Understanding the Hierarchy

- 1D Array: A collection of elements.
- 2D Array: A collection of 1D arrays.
- 3D Array: A collection of 2D arrays.

---

## 4. Accessing and Modifying 2D Array Elements

To access an element in a 2D array, we use two indices:
1. Row index
2. Column index

Syntax:

    arrayName[rowIndex][columnIndex];

**Important:** Array indexing starts from 0 in Java.

### A. Accessing Elements

Example:

    int[][] marks = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    System.out.println(marks[2][1]);
    System.out.println(marks[1][2]);

Output:

    8
    6

Explanation:

- `marks[2][1]` accesses the element at row 2 and column 1, which is 8.
- `marks[1][2]` accesses the element at row 1 and column 2, which is 6.

### B. Modifying Elements

We can change an existing element by assigning a new value to its position.

Example:

    int[][] marks = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    marks[1][2] = 99;

    System.out.println(marks[1][2]);

Output:

    99

Explanation:

The original value at row 1 and column 2 was 6. It has now been replaced with 99.

---

## 5. Important Points to Remember

1. A 2D array stores elements in rows and columns.
2. A 2D array uses two indices to access an element.
3. Array indexing starts from 0.
4. `arrayName[row][column]` is the syntax for accessing an element.
5. `new int[2][3]` creates an array with 2 rows and 3 columns.
6. A 2D array can be initialized directly using nested curly braces.
7. Java supports 1D, 2D, 3D, and higher-dimensional arrays.
8. Accessing an invalid row or column index results in an `ArrayIndexOutOfBoundsException`.

---

## 6. Quick Revision

| Concept | Syntax / Example |
|---|---|
| 2D Array Declaration | `int[][] matrix;` |
| 2D Array Creation | `new int[2][3];` |
| Declaration + Creation | `int[][] matrix = new int[2][3];` |
| Initialization | `int[][] matrix = {{1, 2}, {3, 4}};` |
| Accessing Element | `matrix[0][1]` |
| Modifying Element | `matrix[0][1] = 50;` |
| Number of Rows | `matrix.length` |
| Number of Columns in First Row | `matrix[0].length` |

---

## Final Concept

A 2D array is essentially an array of arrays. It allows us to organize and manage data in a tabular structure using row and column indices.