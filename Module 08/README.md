# Module 8: Conditional Statements in Java (Part 1)

## 1. Introduction to Conditional Statements

Conditional statements are used in Java to make decisions based on certain conditions.

They allow a program to execute different blocks of code depending on whether a condition evaluates to `true` or `false`.

For example:
- Checking whether a number is positive or negative.
- Checking whether a person is eligible to vote.
- Checking whether a number is even or odd.
- Assigning grades based on marks.

In this module, we will cover three conditional statements:

1. `if` statement
2. `if-else` statement
3. `if-else-if` ladder

---

## 2. The if Statement

The `if` statement executes a block of code only when the given condition is `true`.

If the condition is `false`, the code inside the `if` block is skipped.

### Syntax

    if (condition) {
        // Code to execute if condition is true
    }

### Example

    class Main {
        public static void main(String[] args) {

            int age = 18;

            if (age >= 18) {
                System.out.println("Eligible to vote");
            }
        }
    }

**Output:**

    Eligible to vote

### Explanation

- The condition `age >= 18` is checked.
- Since age is 18, the condition evaluates to `true`.
- Therefore, the statement inside the `if` block is executed.

---

## 3. The if-else Statement

The `if-else` statement is used when we want to execute one block of code if the condition is `true` and another block if the condition is `false`.

### Syntax

    if (condition) {
        // Executes if condition is true
    }
    else {
        // Executes if condition is false
    }

### Example: Even or Odd Number

    class Main {
        public static void main(String[] args) {

            int number = 7;

            if (number % 2 == 0) {
                System.out.println("Even Number");
            }
            else {
                System.out.println("Odd Number");
            }
        }
    }

**Output:**

    Odd Number

### Explanation

- The modulus operator `%` returns the remainder.
- If a number divided by 2 gives a remainder of 0, it is even.
- Otherwise, it is odd.
- Since 7 is not divisible by 2, the `else` block executes.

---

## 4. The if-else-if Ladder

The `if-else-if` ladder is used when we need to check multiple conditions.

The conditions are evaluated from top to bottom.

As soon as a condition becomes `true`, its corresponding block is executed, and all remaining conditions are skipped.

If none of the conditions is true, the final `else` block is executed.

### Syntax

    if (condition1) {
        // Code for condition1
    }
    else if (condition2) {
        // Code for condition2
    }
    else if (condition3) {
        // Code for condition3
    }
    else {
        // Code if all conditions are false
    }

### Example: Grading System

    class Main {
        public static void main(String[] args) {

            int marks = 85;

            if (marks >= 90) {
                System.out.println("Grade A");
            }
            else if (marks >= 75) {
                System.out.println("Grade B");
            }
            else if (marks >= 50) {
                System.out.println("Grade C");
            }
            else {
                System.out.println("Fail");
            }
        }
    }

**Output:**

    Grade B

### Explanation

- First, `marks >= 90` is checked. It is false.
- Next, `marks >= 75` is checked. It is true.
- Therefore, Grade B is printed.
- The remaining conditions are skipped.

---

## 5. Important Rules to Remember

1. The condition inside an `if` statement must evaluate to a Boolean value (`true` or `false`).
2. Curly braces `{}` define the body of conditional statements.
3. The `else` statement must always be associated with an `if` statement.
4. An `if` statement can exist without an `else` statement.
5. An `if-else` statement provides two possible execution paths.
6. An `if-else-if` ladder can contain multiple `else if` conditions.
7. In an `if-else-if` ladder, only the first matching condition is executed.
8. The final `else` block is optional.
9. Conditions are evaluated from top to bottom.

---

## 6. Quick Revision

| Statement | Purpose |
|---|---|
| `if` | Executes code when a condition is true. |
| `if-else` | Selects between two blocks of code. |
| `if-else-if` | Checks multiple conditions sequentially. |

---