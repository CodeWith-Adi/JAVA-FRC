# Module 11: Break and Continue Statements in Java

## 1. Introduction

Java provides two important control statements that help us control the execution of loops:

1. Break Statement
2. Continue Statement

These statements are used to change the normal flow of loop execution.

---

## 2. Break Statement

The `break` statement is used to immediately terminate a loop or switch statement, regardless of whether its condition is still true.

Once the break statement is executed, the program exits the loop and continues executing the statements after the loop.

### Syntax

    break;

### Example

    for (int i = 1; i <= 10; i++) {

        if (i == 5) {
            break;
        }

        System.out.println(i);
    }

### Output

    1
    2
    3
    4

### Working

1. The loop starts with `i = 1`.
2. The condition `i <= 10` is checked.
3. The value of `i` is printed.
4. When `i` becomes 5, the condition `i == 5` becomes true.
5. The break statement terminates the loop immediately.

**Important:** The break statement terminates the entire loop, not just the current iteration.

---

## 3. Continue Statement

The `continue` statement is used to skip the current iteration of a loop and move directly to the next iteration.

Unlike break, it does not terminate the entire loop.

### Syntax

    continue;

### Example

    for (int i = 1; i <= 5; i++) {

        if (i == 3) {
            continue;
        }

        System.out.println(i);
    }

### Output

    1
    2
    4
    5

### Working

1. The loop starts with `i = 1`.
2. The condition `i <= 5` is checked.
3. When `i` becomes 3, the condition `i == 3` becomes true.
4. The continue statement skips the remaining statements of that iteration.
5. The loop moves to the next iteration.
6. The remaining values are printed normally.

**Important:** The continue statement skips only the current iteration, not the entire loop.

---

## 4. Difference Between Break and Continue

| Break Statement | Continue Statement |
|---|---|
| Terminates the entire loop. | Skips the current iteration. |
| Control moves outside the loop. | Control moves to the next iteration. |
| Used when we want to stop a loop. | Used when we want to skip specific iterations. |
| Can be used in loops and switch statements. | Can be used in loops. |

---

## 5. Break and Continue in Different Loops

Both break and continue can be used with:

- For Loop
- While Loop
- Do-While Loop

### Example: Break in While Loop

    int i = 1;

    while (i <= 10) {

        if (i == 5) {
            break;
        }

        System.out.println(i);
        i++;
    }

### Example: Continue in While Loop

    int i = 0;

    while (i < 5) {
        i++;

        if (i == 3) {
            continue;
        }

        System.out.println(i);
    }

**Important:** In while and do-while loops, ensure that the loop variable is updated before using continue when necessary. Otherwise, the loop may become infinite.

---

## 6. Nested Loops and Break

A break statement inside a nested loop terminates only the innermost loop in which it is written.

### Example

    for (int i = 1; i <= 3; i++) {

        for (int j = 1; j <= 3; j++) {

            if (j == 2) {
                break;
            }

            System.out.println(i + " " + j);
        }
    }

Here, the inner loop terminates whenever `j` becomes 2, but the outer loop continues.

---

## 7. Important Points to Remember

- Break immediately terminates the nearest enclosing loop or switch.
- Continue skips the current iteration and proceeds to the next one.
- Break and continue can be used with for, while and do-while loops.
- Break can also be used inside switch statements.
- Continue does not terminate a loop.
- In nested loops, an ordinary break or continue affects only the innermost loop.
- Incorrect placement of variable updates with continue can cause infinite loops.

---