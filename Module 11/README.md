# Module 10: Loops in Java

## 1. Introduction to Loops

A loop is a programming structure that allows us to execute a block of code repeatedly as long as a specified condition is satisfied.

Loops help us avoid writing the same statements multiple times.

For example, instead of writing `System.out.println("Hello");` ten times, we can use a loop to print it ten times.

### Why do we use loops?
- To reduce repetitive code.
- To make programs shorter and more efficient.
- To perform repetitive tasks automatically.
- To execute statements multiple times based on a condition.

Java provides three main types of loops:
1. For Loop
2. While Loop
3. Do-While Loop

---

## 2. For Loop

A `for` loop is used when we generally know how many times a block of code needs to execute.

### Syntax

    for (initialization; condition; update) {
        // Statements to execute
    }

### Components of a For Loop

1. **Initialization:** Initializes the loop variable. It executes only once.
2. **Condition:** Checks whether the loop should continue executing.
3. **Update:** Updates the loop variable after every iteration.

### Example

    for (int i = 1; i <= 5; i++) {
        System.out.println(i);
    }

### Output

    1
    2
    3
    4
    5

### Working of For Loop

1. The variable `i` is initialized with 1.
2. The condition `i <= 5` is checked.
3. If the condition is true, the statements inside the loop execute.
4. The update expression `i++` increases the value of `i`.
5. The process continues until the condition becomes false.

---

## 3. While Loop

A `while` loop executes a block of code repeatedly as long as the given condition remains true.

It is generally used when the number of iterations is not known beforehand.

### Syntax

    initialization;

    while (condition) {
        // Statements to execute
        update;
    }

### Example

    int i = 1;

    while (i <= 5) {
        System.out.println(i);
        i++;
    }

### Output

    1
    2
    3
    4
    5

### Working of While Loop

1. Initialize the loop variable.
2. Check the condition.
3. If the condition is true, execute the loop body.
4. Update the loop variable.
5. Repeat until the condition becomes false.

**Important:** If the condition is false initially, the while loop will not execute even once.

---

## 4. Do-While Loop

A `do-while` loop is similar to a while loop, but the condition is checked after executing the loop body.

Therefore, a do-while loop always executes at least once, regardless of whether the condition is true or false.

### Syntax

    initialization;

    do {
        // Statements to execute
        update;
    } while (condition);

### Example

    int i = 1;

    do {
        System.out.println(i);
        i++;
    } while (i <= 5);

### Output

    1
    2
    3
    4
    5

### Working of Do-While Loop

1. Initialize the loop variable.
2. Execute the statements inside the do block.
3. Update the loop variable.
4. Check the condition.
5. If the condition is true, repeat the process.
6. If the condition is false, terminate the loop.

**Important:** A do-while loop executes at least once because its condition is checked after the loop body.

---

## 5. Difference Between For, While and Do-While Loops

| Feature | For Loop | While Loop | Do-While Loop |
|---|---|---|---|
| Condition checking | Before execution | Before execution | After execution |
| Minimum execution | Zero times | Zero times | At least once |
| Initialization | Inside loop statement | Outside loop | Outside loop |
| Update | Inside loop statement | Inside loop body | Inside loop body |
| Best used when | Iterations are known | Iterations are uncertain | At least one execution is required |

---

## 6. Finite Loop vs Infinite Loop

### Finite Loop

A finite loop is a loop that executes a limited number of times and eventually terminates when its condition becomes false.

Example:

    for (int i = 1; i <= 5; i++) {
        System.out.println("Hello");
    }

Output:

    Hello
    Hello
    Hello
    Hello
    Hello

Here, the loop executes exactly five times and then terminates.

### Infinite Loop

An infinite loop is a loop that continues executing indefinitely because its termination condition never becomes false.

Example:

    int i = 1;

    while (i <= 5) {
        System.out.println(i);
    }

Here, the value of `i` is never updated. Therefore, the condition `i <= 5` always remains true.

The loop continues indefinitely.

### Creating an Infinite Loop Intentionally

Java also allows us to create infinite loops intentionally.

Example using For Loop:

    for (;;) {
        System.out.println("Running...");
    }

Example using While Loop:

    while (true) {
        System.out.println("Running...");
    }

### Difference Between Finite and Infinite Loops

| Finite Loop | Infinite Loop |
|---|---|
| Executes a limited number of times. | Continues executing indefinitely. |
| Eventually terminates. | Does not terminate on its own. |
| Has a condition that eventually becomes false. | Its condition never becomes false. |
| Used for repetitive tasks with an endpoint. | Used when continuous execution is required. |

---

## 7. Important Points to Remember

- A loop is used to execute statements repeatedly.
- Java provides three main loops: for, while and do-while.
- A for loop is generally preferred when the number of iterations is known.
- A while loop checks its condition before executing the loop body.
- A do-while loop checks its condition after executing the loop body.
- A do-while loop always executes at least once.
- A finite loop eventually terminates.
- An infinite loop continues indefinitely.
- Always ensure that the loop condition can eventually become false when creating a finite loop.

---