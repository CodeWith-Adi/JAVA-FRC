# Module 17: Iterating Through a String and Reversing a String

## 1. Introduction

In Java, a String is a sequence of characters. We can access individual characters of a String using their index positions.

**Iterating through a String** means accessing and processing each character of the String one by one, usually with the help of a loop.

We can use:
- `for` loop
- `while` loop
- `charAt()` method
- `length()` method

---

## 2. Understanding String Indexing

Every character in a String has an index starting from `0`.

### Example

    String name = "JAVA";

| Character | J | A | V | A |
|---|---|---|---|---|
| Index | 0 | 1 | 2 | 3 |

- First character is at index `0`.
- Last character is at index `length() - 1`.
- Total number of characters is returned by `length()`.

For example:

    String name = "JAVA";

    System.out.println(name.length()); // 4
    System.out.println(name.charAt(0)); // J
    System.out.println(name.charAt(3)); // A

---

## 3. Iterating Through a String Using a for Loop

We can use a `for` loop to access every character of a String.

### Syntax

    for (int i = 0; i < str.length(); i++) {

        System.out.println(str.charAt(i));

    }

### Example

    public class main {

        public static void main(String[] args) {

            String str = "JAVA";

            for (int i = 0; i < str.length(); i++) {

                System.out.println(str.charAt(i));

            }

        }

    }

### Output

    J
    A
    V
    A

### Explanation

1. We create a String named `str` containing `"JAVA"`.
2. We initialize `i = 0`.
3. The loop runs while `i` is less than the length of the String.
4. `charAt(i)` accesses the character at the current index.
5. After every iteration, `i` increases by 1.
6. The loop stops when all characters have been accessed.

---

## 4. Iterating Through a String Using a while Loop

We can also use a `while` loop to access every character of a String.

### Example

    public class main {

        public static void main(String[] args) {

            String str = "HELLO";

            int i = 0;

            while (i < str.length()) {

                System.out.println(str.charAt(i));

                i++;

            }

        }

    }

### Output

    H
    E
    L
    L
    O

### Explanation

- We initialize the index variable `i` with `0`.
- The loop checks whether `i` is less than the String length.
- `charAt(i)` prints the character at the current index.
- `i++` moves to the next character.
- The loop ends after the last character is printed.

---

## 5. Iterating Through a String in Reverse Order

We can also access characters from the last index to the first index.

For this, we initialize the loop variable with `str.length() - 1` and decrease it after every iteration.

### Syntax

    for (int i = str.length() - 1; i >= 0; i--) {

        System.out.println(str.charAt(i));

    }

### Example

    public class main {

        public static void main(String[] args) {

            String str = "JAVA";

            for (int i = str.length() - 1; i >= 0; i--) {

                System.out.println(str.charAt(i));

            }

        }

    }

### Output

    A
    V
    A
    J

### Explanation

1. The String `"JAVA"` has a length of 4.
2. Its last index is `4 - 1 = 3`.
3. We start the loop from index `3`.
4. After every iteration, the index decreases by 1.
5. The loop stops when the index becomes less than `0`.

---

# 6. Reversing a String

Reversing a String means arranging its characters in the opposite order.

For example:

- Original String: `"JAVA"`
- Reversed String: `"AVAJ"`

There are different ways to reverse a String in Java.

## Method 1: Using a for Loop

We can reverse a String by accessing its characters from the last index to the first index and joining them into a new String.

### Example

    public class main {

        public static void main(String[] args) {

            String str = "JAVA";
            String reversed = "";

            for (int i = str.length() - 1; i >= 0; i--) {

                reversed = reversed + str.charAt(i);

            }

            System.out.println("Original: " + str);
            System.out.println("Reversed: " + reversed);

        }

    }

### Output

    Original: JAVA
    Reversed: AVAJ

### Explanation

1. We create the original String `"JAVA"`.
2. We create an empty String named `reversed`.
3. The loop starts from the last index.
4. `charAt(i)` accesses each character from right to left.
5. Each character is added to the `reversed` String.
6. Finally, the reversed String is printed.

### Dry Run

For the String `"JAVA"`:

| Iteration | Index | Character | Reversed String |
|---|---|---|---|
| 1 | 3 | A | A |
| 2 | 2 | V | AV |
| 3 | 1 | A | AVA |
| 4 | 0 | J | AVAJ |

Final Result: `AVAJ`

---

## Method 2: Using a while Loop

We can perform the same operation using a `while` loop.

### Example

    public class main {

        public static void main(String[] args) {

            String str = "HELLO";
            String reversed = "";

            int i = str.length() - 1;

            while (i >= 0) {

                reversed = reversed + str.charAt(i);

                i--;

            }

            System.out.println("Reversed String: " + reversed);

        }

    }

### Output

    Reversed String: OLLEH

### Explanation

- We initialize `i` with the last index.
- We access the character at index `i`.
- We append that character to the reversed String.
- We decrease `i` using `i--`.
- The loop continues until all characters are processed.

---

## Method 3: Using StringBuilder

Java provides a class called `StringBuilder` that can be used to modify character sequences.

It provides a built-in `reverse()` method that reverses the character sequence.

### Example

    public class main {

        public static void main(String[] args) {

            String str = "PROGRAMMING";

            StringBuilder sb = new StringBuilder(str);

            sb.reverse();

            System.out.println(sb);

        }

    }

### Output

    GNIMMARGORP

### Explanation

1. We create a String named `str`.
2. We create a `StringBuilder` object using that String.
3. We call the `reverse()` method.
4. The characters are arranged in reverse order.
5. We print the reversed result.

**Note:** `StringBuilder` is different from `String`. Unlike String, StringBuilder is mutable, meaning its contents can be modified.

---

## 7. Difference Between Iterating and Reversing a String

| Iterating Through a String | Reversing a String |
|---|---|
| Accesses characters one by one. | Arranges characters in opposite order. |
| Can move from first to last character. | Usually accesses characters from last to first. |
| Does not necessarily create a new String. | Often creates a reversed String. |
| Uses `charAt()` and loops. | Uses loops or `StringBuilder.reverse()`. |

---

## 8. Important Points to Remember

1. String indexing starts from `0`.
2. `length()` returns the total number of characters.
3. The last index of a String is `length() - 1`.
4. `charAt(index)` returns the character at a particular index.
5. A `for` loop or `while` loop can be used to iterate through a String.
6. To iterate in reverse order, start from `length() - 1` and decrease the index.
7. Strings are immutable, so joining characters creates new String objects.
8. `StringBuilder` is mutable.
9. `StringBuilder` provides a built-in `reverse()` method.

---

## 9. Quick Revision

### Forward Iteration

    for (int i = 0; i < str.length(); i++) {
        System.out.println(str.charAt(i));
    }

### Reverse Iteration

    for (int i = str.length() - 1; i >= 0; i--) {
        System.out.println(str.charAt(i));
    }

### Reversing a String Using a Loop

    String reversed = "";

    for (int i = str.length() - 1; i >= 0; i--) {
        reversed = reversed + str.charAt(i);
    }

### Reversing a String Using StringBuilder

    StringBuilder sb = new StringBuilder(str);

    sb.reverse();

    System.out.println(sb);

**Final Concept:** Iterating through a String means accessing its characters one by one, whereas reversing a String means arranging those characters in the opposite order.