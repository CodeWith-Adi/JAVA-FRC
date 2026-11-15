# Module 20: Array Length and Iterating Through an Array in Java

## 1. Finding the Length of an Array

In Java, we can use the `length` property to find the total number of elements present in an array.

**Syntax**

    arrayName.length;

**Example**

    public class main {

        public static void main(String[] args) {

            int[] numbers = {10, 20, 30, 40};

            System.out.println(numbers.length);

        }

    }

**Output**

    4

**Explanation**

- We create an integer array named `numbers`.
- The array contains four elements.
- `numbers.length` returns the total number of elements.
- Therefore, the output is `4`.

**Important Points**

1. `length` is a property, not a method.
2. We do not use parentheses after `length`.
3. The length of an array is fixed after its creation.
4. The last valid index of an array is always `length - 1`.

**Example**

    int[] numbers = {10, 20, 30, 40};

    System.out.println(numbers.length);     // 4
    System.out.println(numbers.length - 1); // 3

**Note:** Do not confuse `array.length` with `String.length()`. For arrays, `length` is a property, whereas for Strings, `length()` is a method.

**---**

## 2. Iterating Through an Array

Iterating through an array means accessing its elements one by one.

In Java, we can use different types of loops to traverse an array.

The three commonly used loops are:

1. `for` loop
2. `for-each` loop (Enhanced for loop)
3. `while` loop

**---**

## 3. Iterating Through an Array Using a for Loop

A `for` loop is used to access array elements using their index positions.

It is useful when:
- We need to access the index of an element.
- We want to modify array elements.
- We need to control the iteration process.

**Syntax**

    for (int i = 0; i < arrayName.length; i++) {

        System.out.println(arrayName[i]);

    }

**Example**

    public class main {

        public static void main(String[] args) {

            int[] marks = {50, 70, 80, 66, 90, 83, 35};

            for (int i = 0; i < marks.length; i++) {

                System.out.println(marks[i]);

            }

        }

    }

**Output**

    50
    70
    80
    66
    90
    83
    35

**Explanation**

1. We create an integer array named `marks`.
2. We initialize the loop variable `i` with `0`.
3. The loop runs while `i` is less than `marks.length`.
4. `marks[i]` accesses the element at the current index.
5. After every iteration, `i` increases by `1`.
6. The loop stops when all elements have been accessed.

**Dry Run**

For the array:

    int[] marks = {50, 70, 80, 66};

| Iteration | Index (i) | Element (marks[i]) |
|---|---|---|
| 1 | 0 | 50 |
| 2 | 1 | 70 |
| 3 | 2 | 80 |
| 4 | 3 | 66 |

**Important:** We use `i < marks.length`, not `i <= marks.length`, because the last valid index is `marks.length - 1`.

**---**

## 4. Iterating Through an Array Using a for-each Loop

Java provides a special type of loop called the `for-each` loop, also known as the Enhanced for loop.

It is used to access every element of an array without manually managing the index.

It is useful when:
- We only need to read array elements.
- We do not need the index of each element.
- We want simpler and cleaner code.

**Syntax**

    for (datatype variable : arrayName) {

        // Statements

    }

**Example**

    public class main {

        public static void main(String[] args) {

            int[] marks = {50, 70, 80, 66, 90, 83, 35};

            for (int mark : marks) {

                System.out.println(mark);

            }

        }

    }

**Output**

    50
    70
    80
    66
    90
    83
    35

**Explanation**

1. We create an integer array named `marks`.
2. We use a `for-each` loop to access its elements.
3. `int mark` creates a variable that temporarily holds the current element.
4. The colon `:` separates the variable from the array.
5. In every iteration, the next array element is assigned to `mark`.
6. The loop automatically stops after accessing all elements.

**Understanding the Syntax**

    for (int mark : marks)

- `int` is the data type of the elements.
- `mark` is the temporary variable.
- `:` means "in".
- `marks` is the array being traversed.

This can be understood as:

"For every integer mark in the marks array, execute the following statements."

**Important Points**

1. The `for-each` loop automatically accesses every element.
2. We do not need to initialize or increment an index.
3. It does not directly provide the index of an element.
4. It is mainly used when we only need to read elements.
5. Assigning a new value to the loop variable does not modify the original array element.

**---**

## 5. Iterating Through an Array Using a while Loop

We can also use a `while` loop to access array elements one by one.

In this method, we manually initialize, check, and increment the index variable.

**Syntax**

    int i = 0;

    while (i < arrayName.length) {

        System.out.println(arrayName[i]);

        i++;

    }

**Example**

    public class main {

        public static void main(String[] args) {

            int[] marks = {50, 70, 80, 66, 90, 83, 35};

            int i = 0;

            while (i < marks.length) {

                System.out.println(marks[i]);

                i++;

            }

        }

    }

**Output**

    50
    70
    80
    66
    90
    83
    35

**Explanation**

1. We create an integer array named `marks`.
2. We initialize the index variable `i` with `0`.
3. The `while` loop checks whether `i` is less than the array length.
4. `marks[i]` accesses the element at the current index.
5. `i++` increases the index by `1`.
6. The loop continues until all elements have been accessed.

**Important:** If we forget to increment `i`, the loop may become an infinite loop because the index will never change.

**---**

## 6. Difference Between for, for-each and while Loops

| Feature | for Loop | for-each Loop | while Loop |
|---|---|---|---|
| Index access | Yes | No direct index access | Yes |
| Initialization | Inside loop statement | Not required | Before loop |
| Increment | Inside loop statement | Automatic traversal | Manually |
| Modifying elements | Convenient | Not directly through loop variable | Convenient |
| Syntax | More control | Simplest | Manual control |
| Best use | Index-based operations | Reading all elements | Conditional iteration |

**---**

## 7. Important Points to Remember

1. The `length` property returns the total number of elements in an array.
2. `length` is a property, not a method.
3. Array indexing starts from `0`.
4. The last valid index is `length - 1`.
5. A `for` loop can access elements using their indexes.
6. A `for-each` loop automatically accesses every element.
7. A `while` loop requires manual index initialization and increment.
8. The `for` and `while` loops provide direct index-based access.
9. The `for-each` loop is useful when we only need to read elements.
10. We should use `i < arrayName.length` to avoid accessing an invalid index.

**---**

## 8. Quick Revision

### Finding Array Length

    int[] numbers = {10, 20, 30, 40};

    System.out.println(numbers.length); // 4

### Using a for Loop

    for (int i = 0; i < numbers.length; i++) {

        System.out.println(numbers[i]);

    }

### Using a for-each Loop

    for (int number : numbers) {

        System.out.println(number);

    }

### Using a while Loop

    int i = 0;

    while (i < numbers.length) {

        System.out.println(numbers[i]);

        i++;

    }

**Final Concept:** Iterating through an array means accessing its elements one by one. Java provides `for`, `for-each`, and `while` loops for this purpose. We can use `array.length` to determine how many elements need to be accessed.