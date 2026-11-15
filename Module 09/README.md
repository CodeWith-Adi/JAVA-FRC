# Module 9: Advanced Conditional Statements in Java

## 1. Nested if Statements

A nested `if` statement means placing one `if` statement inside another `if` statement.

It is used when we need to check multiple conditions in a sequence, where the inner condition is checked only when the outer condition is `true`.

### Syntax

    if (condition1) {

        if (condition2) {
            // Executes if both conditions are true
        }
        else {
            // Executes if condition2 is false
        }

    }
    else {
        // Executes if condition1 is false
    }

### Example: Student Eligibility

    class Main {
        public static void main(String[] args) {

            int age = 20;
            boolean hasID = true;

            if (age >= 18) {

                if (hasID) {
                    System.out.println("Entry Allowed");
                }
                else {
                    System.out.println("ID Required");
                }

            }
            else {
                System.out.println("Underage - Entry Denied");
            }
        }
    }

**Output:**

    Entry Allowed

### Explanation

- First, the outer `if` checks whether the age is at least 18.
- If the condition is true, the inner `if` is executed.
- The inner `if` checks whether the student has an ID.
- If both conditions are true, entry is allowed.
- Otherwise, the corresponding `else` block is executed.

### Important Points

1. An `if` statement can contain another `if` statement.
2. The inner condition is checked only when the outer condition is true.
3. Nested conditions can have their own `else` blocks.
4. Multiple levels of nesting are possible.

---

## 2. Switch Case Statement

The `switch` statement is a conditional control statement used to execute one block of code from multiple available choices.

It compares the value of an expression with different `case` values.

When a matching case is found, its corresponding statements are executed.

### Syntax

    switch (expression) {

        case value1:
            // Code
            break;

        case value2:
            // Code
            break;

        case value3:
            // Code
            break;

        default:
            // Code if no case matches
    }

### Important Keywords

**1. switch**
- Defines the switch statement.
- The expression inside it is evaluated once.

**2. case**
- Represents a possible matching value.
- Each case contains statements to execute when it matches.

**3. break**
- Terminates the switch statement.
- Prevents execution from continuing into subsequent cases.

**4. default**
- Executes when none of the case values matches.
- It is optional.

### Example: Simple Calculator

    class Main {
        public static void main(String[] args) {

            int a = 20;
            int b = 10;
            char operator = '+';

            switch (operator) {

                case '+':
                    System.out.println("Addition: " + (a + b));
                    break;

                case '-':
                    System.out.println("Subtraction: " + (a - b));
                    break;

                case '*':
                    System.out.println("Multiplication: " + (a * b));
                    break;

                case '/':
                    System.out.println("Division: " + (a / b));
                    break;

                default:
                    System.out.println("Invalid Operator");
            }
        }
    }

**Output:**

    Addition: 30

### Explanation

- The value of `operator` is `+`.
- Java searches for the matching case.
- `case '+'` matches the expression.
- The addition operation is performed.
- The `break` statement terminates the switch block.

### Supported Data Types

Traditional Java switch statements support the following types:

- byte
- short
- char
- int
- String
- enum

They do not directly support `float`, `double`, `long`, or `boolean` as switch expressions.

---

## 3. Switch Case Fall-Through

Fall-through is a behaviour of the switch statement in which execution continues into the following cases when a `break` statement is not encountered.

In simple words, if we do not use `break`, Java executes the matching case and continues executing the statements of subsequent cases.

### Example

    class Main {
        public static void main(String[] args) {

            int number = 2;

            switch (number) {

                case 1:
                    System.out.println("One");

                case 2:
                    System.out.println("Two");

                case 3:
                    System.out.println("Three");

                case 4:
                    System.out.println("Four");
                    break;

                default:
                    System.out.println("Invalid Number");
            }
        }
    }

**Output:**

    Two
    Three
    Four

### Explanation

- The value of `number` is 2.
- Java starts execution from `case 2`.
- Since there is no `break` after `case 2`, execution continues.
- `case 3` and `case 4` are also executed.
- The `break` statement after `case 4` terminates the switch block.

### Fall-Through vs Normal Switch Execution

| Normal Switch | Fall-Through Switch |
|---|---|
| Uses `break` after cases. | Does not use `break` between selected cases. |
| Executes the matching case only. | Continues executing subsequent cases. |
| Stops when `break` is encountered. | Stops when a `break` or the end of switch is reached. |

### Example: Multiple Cases with Same Output

Fall-through can also be used intentionally when multiple cases should execute the same code.

    class Main {
        public static void main(String[] args) {

            int day = 6;

            switch (day) {

                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Weekday");
                    break;

                case 6:
                case 7:
                    System.out.println("Weekend");
                    break;

                default:
                    System.out.println("Invalid Day");
            }
        }
    }

**Output:**

    Weekend

**Explanation:**

- Both `case 6` and `case 7` lead to the same statement.
- Since there are no statements or breaks between these cases, they share the same execution block.
- This technique avoids writing the same code multiple times.

---

## 4. Important Points to Remember

1. Nested `if` statements allow us to place conditional statements inside other conditional statements.
2. An inner `if` executes only when its outer condition is true.
3. A `switch` statement is useful when comparing one expression against multiple fixed values.
4. The `case` keyword defines matching values.
5. The `break` keyword terminates a switch case.
6. The `default` case executes when no case matches.
7. Fall-through occurs when a matching case continues into subsequent cases without encountering `break`.
8. Fall-through can be used intentionally to group multiple cases.
9. The order of cases matters when fall-through is used.

---

## 5. Quick Revision

| Concept | Purpose |
|---|---|
| Nested if | Places one conditional statement inside another. |
| switch | Selects a block based on matching values. |
| case | Defines a possible matching value. |
| break | Terminates switch execution. |
| default | Provides a fallback when no case matches. |
| Fall-through | Allows execution to continue into subsequent cases. |

---
