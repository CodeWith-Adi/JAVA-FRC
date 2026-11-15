# MODULE 6: JAVA OPERATORS – PART 2
## Assignment, Relational, Logical and Ternary Operators

---

# 1. INTRODUCTION TO OPERATORS

Operators are special symbols in Java that perform operations on variables and values.

In the previous module, we studied arithmetic operators such as `+`, `-`, `*`, `/` and `%`.

In this module, we will study four more categories of operators:

1. Assignment Operators
2. Relational Operators
3. Logical Operators
4. Ternary Operators

These operators help us assign values, compare data, combine conditions and make decisions in Java.

---

# 2. ASSIGNMENT OPERATORS

## 2.1 What are Assignment Operators?

Assignment operators are used to assign values to variables.

The most basic assignment operator in Java is `=`.

It assigns the value on the right-hand side to the variable on the left-hand side.

### Example:

    int age = 16;

Here:
- `int` is the data type.
- `age` is the variable name.
- `=` is the assignment operator.
- `16` is the value being assigned.

Remember: The `=` operator does not mean equal to in mathematics. It means assignment in Java.

## 2.2 Types of Assignment Operators

Java provides several assignment operators:

| Operator | Example | Meaning |
|---|---|---|
| `=` | `a = 10` | Assigns 10 to a |
| `+=` | `a += 5` | Adds 5 to a |
| `-=` | `a -= 5` | Subtracts 5 from a |
| `*=` | `a *= 5` | Multiplies a by 5 |
| `/=` | `a /= 5` | Divides a by 5 |
| `%=` | `a %= 5` | Stores the remainder |

Let's understand each one.

## 2.3 Simple Assignment (=)

The simple assignment operator assigns a value to a variable.

    int number = 20;

We can also assign the value of one variable to another variable.

    int a = 10;
    int b = a;

Now:
- `a = 10`
- `b = 10`

Both variables contain the value 10.

## 2.4 Addition Assignment (+=)

The `+=` operator adds a value to the existing value of a variable and stores the result in the same variable.

    int number = 10;
    number += 5;

This is equivalent to:

    number = number + 5;

Calculation:

    number = 10 + 5
    number = 15

Final value: 15

## 2.5 Subtraction Assignment (-=)

The `-=` operator subtracts a value from the existing value of a variable.

    int number = 20;
    number -= 5;

This is equivalent to:

    number = number - 5;

Calculation:

    number = 20 - 5
    number = 15

Final value: 15

## 2.6 Multiplication Assignment (*=)

The `*=` operator multiplies the existing value of a variable by another value.

    int number = 10;
    number *= 3;

This is equivalent to:

    number = number * 3;

Calculation:

    number = 10 * 3
    number = 30

Final value: 30

## 2.7 Division Assignment (/=)

The `/=` operator divides the existing value of a variable by another value.

    int number = 20;
    number /= 4;

This is equivalent to:

    number = number / 4;

Calculation:

    number = 20 / 4
    number = 5

Final value: 5

Remember: When both operands are integers, Java performs integer division.

For example:

    int number = 10;
    number /= 3;

The result will be 3, not 3.3333, because the decimal part is discarded.

## 2.8 Modulus Assignment (%=)

The `%=` operator calculates the remainder and stores it in the same variable.

    int number = 17;
    number %= 5;

This is equivalent to:

    number = number % 5;

Calculation:

    number = 17 % 5
    number = 2

Final value: 2

## 2.9 Combined Example of Assignment Operators

    public class AssignmentDemo {
        public static void main(String[] args) {

            int number = 20;

            number += 10;
            System.out.println("After += : " + number);

            number -= 5;
            System.out.println("After -= : " + number);

            number *= 2;
            System.out.println("After *= : " + number);

            number /= 5;
            System.out.println("After /= : " + number);

            number %= 3;
            System.out.println("After %= : " + number);
        }
    }

Output:

    After += : 30
    After -= : 25
    After *= : 50
    After /= : 10
    After %= : 1

Explanation:

| Operation | Calculation | Result |
|---|---|---|
| Initial value | 20 | 20 |
| `number += 10` | 20 + 10 | 30 |
| `number -= 5` | 30 - 5 | 25 |
| `number *= 2` | 25 × 2 | 50 |
| `number /= 5` | 50 ÷ 5 | 10 |
| `number %= 3` | 10 % 3 | 1 |

Important: Every operation updates the same variable. Therefore, the next operation uses the updated value.

---

# 3. RELATIONAL OPERATORS

## 3.1 What are Relational Operators?

Relational operators are used to compare two values.

They check the relationship between two operands and return a boolean result.

A boolean value can only be:

- `true`
- `false`

For example:

    int a = 10;
    int b = 20;

    System.out.println(a < b);

Output:

    true

Why?

Because 10 is less than 20.

## 3.2 Types of Relational Operators

Java provides six commonly used relational operators.

| Operator | Name | Meaning |
|---|---|---|
| `==` | Equal to | Checks whether two values are equal |
| `!=` | Not equal to | Checks whether two values are different |
| `>` | Greater than | Checks whether the left value is greater |
| `<` | Less than | Checks whether the left value is smaller |
| `>=` | Greater than or equal to | Checks whether the left value is greater than or equal to the right |
| `<=` | Less than or equal to | Checks whether the left value is smaller than or equal to the right |

## 3.3 Equal to (==)

The `==` operator checks whether two values are equal.

    int a = 10;
    int b = 10;

    System.out.println(a == b);

Output:

    true

Because both values are equal.

Another example:

    int a = 10;
    int b = 20;

    System.out.println(a == b);

Output:

    false

Remember:
- `=` is used for assignment.
- `==` is used for comparison.

These two operators are different.

## 3.4 Not Equal to (!=)

The `!=` operator checks whether two values are different.

    int a = 10;
    int b = 20;

    System.out.println(a != b);

Output:

    true

Because 10 and 20 are not equal.

## 3.5 Greater Than (>)

The `>` operator checks whether the left value is greater than the right value.

    int a = 20;
    int b = 10;

    System.out.println(a > b);

Output:

    true

## 3.6 Less Than (<)

The `<` operator checks whether the left value is smaller than the right value.

    int a = 10;
    int b = 20;

    System.out.println(a < b);

Output:

    true

## 3.7 Greater Than or Equal to (>=)

The `>=` operator checks two possibilities:

1. Whether the left value is greater than the right value.
2. Whether both values are equal.

If either condition is true, the result is true.

    int a = 20;
    int b = 20;

    System.out.println(a >= b);

Output:

    true

Because both values are equal.

Another example:

    int a = 30;
    int b = 20;

    System.out.println(a >= b);

Output:

    true

## 3.8 Less Than or Equal to (<=)

The `<=` operator checks whether the left value is smaller than or equal to the right value.

    int a = 10;
    int b = 20;

    System.out.println(a <= b);

Output:

    true

Another example:

    int a = 20;
    int b = 20;

    System.out.println(a <= b);

Output:

    true

## 3.9 Combined Example of Relational Operators

    public class RelationalDemo {
        public static void main(String[] args) {

            int a = 15;
            int b = 10;

            System.out.println("a == b: " + (a == b));
            System.out.println("a != b: " + (a != b));
            System.out.println("a > b: " + (a > b));
            System.out.println("a < b: " + (a < b));
            System.out.println("a >= b: " + (a >= b));
            System.out.println("a <= b: " + (a <= b));
        }
    }

Output:

    a == b: false
    a != b: true
    a > b: true
    a < b: false
    a >= b: true
    a <= b: false

Important points:

- Relational operators return boolean values.
- They are commonly used in decision-making statements.
- They can compare compatible primitive values.
- For objects such as Strings, use `.equals()` to compare their contents rather than using `==`.

---

# 4. LOGICAL OPERATORS

## 4.1 What are Logical Operators?

Logical operators are used to combine or reverse boolean expressions.

They work with boolean values and return another boolean result.

Java provides three main logical operators:

| Operator | Name | Meaning |
|---|---|---|
| `&&` | Logical AND | True when both conditions are true |
| `||` | Logical OR | True when at least one condition is true |
| `!` | Logical NOT | Reverses the boolean value |

Let's understand each one.

## 4.2 Logical AND (&&)

The `&&` operator returns true only when both conditions are true.

If even one condition is false, the final result is false.

### Truth Table

| Condition 1 | Condition 2 | Result |
|---|---|---|
| true | true | true |
| true | false | false |
| false | true | false |
| false | false | false |

### Example:

    int age = 16;
    boolean hasPermission = true;

    System.out.println(age >= 15 && hasPermission);

Output:

    true

Explanation:

- `age >= 15` gives true.
- `hasPermission` is true.
- Both conditions are true.
- Therefore, the final result is true.

Another example:

    int age = 14;
    boolean hasPermission = true;

    System.out.println(age >= 15 && hasPermission);

Output:

    false

Because the first condition is false.

## 4.3 Logical OR (||)

The `||` operator returns true when at least one condition is true.

It returns false only when both conditions are false.

### Truth Table

| Condition 1 | Condition 2 | Result |
|---|---|---|
| true | true | true |
| true | false | true |
| false | true | true |
| false | false | false |

### Example:

    boolean isWeekend = false;
    boolean isHoliday = true;

    System.out.println(isWeekend || isHoliday);

Output:

    true

Explanation:

- `isWeekend` is false.
- `isHoliday` is true.
- At least one condition is true.
- Therefore, the final result is true.

## 4.4 Logical NOT (!)

The `!` operator reverses a boolean value.

- If the value is true, it becomes false.
- If the value is false, it becomes true.

### Truth Table

| Condition | Result |
|---|---|
| true | false |
| false | true |

### Example:

    boolean isRaining = true;

    System.out.println(!isRaining);

Output:

    false

Explanation:

The original value of `isRaining` is true.

The NOT operator reverses it, so the result becomes false.

## 4.5 Understanding Short-Circuit Evaluation

Java's `&&` and `||` operators use a concept called short-circuit evaluation.

It means Java may skip evaluating the second condition if the first condition already determines the final result.

### Short-Circuit AND (&&)

If the first condition is false, Java does not need to check the second condition.

Example:

    int a = 10;
    int b = 20;

    System.out.println(a > 20 && b > 10);

Output:

    false

Explanation:

- `a > 20` is false.
- Since AND requires both conditions to be true, the final result is already false.
- Java skips evaluating the second condition.

### Short-Circuit OR (||)

If the first condition is true, Java does not need to check the second condition.

Example:

    int a = 10;
    int b = 20;

    System.out.println(a < 20 || b < 10);

Output:

    true

Explanation:

- `a < 20` is true.
- OR requires at least one condition to be true.
- The final result is already true.
- Java skips evaluating the second condition.

## 4.6 Difference Between && and &

Both `&&` and `&` can perform logical AND operations on boolean values, but they behave differently.

| `&&` | `&` |
|---|---|
| Short-circuit AND | Non-short-circuit AND |
| May skip the second condition | Evaluates both conditions |
| Used commonly with boolean expressions | Can also be used as a bitwise operator with integers |

Similarly:

- `||` is short-circuit OR.
- `|` is non-short-circuit OR for boolean values and is also a bitwise operator.

For this module, focus mainly on `&&`, `||` and `!`.

## 4.7 Combined Example of Logical Operators

    public class LogicalDemo {
        public static void main(String[] args) {

            int age = 17;
            boolean hasID = true;

            System.out.println("AND: " + (age >= 18 && hasID));
            System.out.println("OR: " + (age >= 18 || hasID));
            System.out.println("NOT: " + (!hasID));
        }
    }

Output:

    AND: false
    OR: true
    NOT: false

Explanation:

- AND: One condition is false, so the result is false.
- OR: One condition is true, so the result is true.
- NOT: The original value is true, so the result becomes false.

---

# 5. TERNARY OPERATOR

## 5.1 What is a Ternary Operator?

The ternary operator is a conditional operator in Java.

It is used to make a decision between two expressions based on a condition.

It is called a ternary operator because it uses three operands:

1. A condition.
2. An expression to execute if the condition is true.
3. An expression to execute if the condition is false.

The ternary operator is represented by:

    ? :

It can be used as a shorter alternative to a simple if-else statement.

## 5.2 Syntax of the Ternary Operator

    variable = condition ? valueIfTrue : valueIfFalse;

Let's understand the syntax:

- `condition`: A boolean expression that evaluates to true or false.
- `?`: Separates the condition from the first expression.
- `valueIfTrue`: The expression selected if the condition is true.
- `:`: Separates the two possible expressions.
- `valueIfFalse`: The expression selected if the condition is false.

## 5.3 Simple Example

Suppose we want to check whether a number is greater than 10.

    public class TernaryDemo {
        public static void main(String[] args) {

            int number = 15;

            String result = number > 10 ? "Greater than 10" : "Not greater than 10";

            System.out.println(result);
        }
    }

Output:

    Greater than 10

Explanation:

1. The condition `number > 10` is checked.
2. Since 15 is greater than 10, the condition is true.
3. Therefore, the expression before `:` is selected.
4. The value "Greater than 10" is assigned to `result`.

## 5.4 Example: Find the Greater Number

We can use the ternary operator to find the greater of two numbers.

    public class GreaterNumber {
        public static void main(String[] args) {

            int a = 25;
            int b = 40;

            int greater = (a > b) ? a : b;

            System.out.println("Greater Number = " + greater);
        }
    }

Output:

    Greater Number = 40

Explanation:

- Condition: `a > b`
- Since 25 is not greater than 40, the condition is false.
- Therefore, the expression after `:` is selected.
- The value of `b`, which is 40, is assigned to `greater`.

## 5.5 Example: Check Even or Odd

The modulus operator can be combined with the ternary operator.

    public class EvenOdd {
        public static void main(String[] args) {

            int number = 24;

            String result = (number % 2 == 0) ? "Even" : "Odd";

            System.out.println(result);
        }
    }

Output:

    Even

Explanation:

- `number % 2` calculates the remainder.
- If the remainder is 0, the number is even.
- Otherwise, it is odd.
- The ternary operator selects the appropriate expression.

## 5.6 Example: Positive or Negative

    public class PositiveNegative {
        public static void main(String[] args) {

            int number = -5;

            String result = (number >= 0) ? "Positive" : "Negative";

            System.out.println(result);
        }
    }

Output:

    Negative

Note: This example groups zero with the non-negative result. Zero is neither positive nor negative mathematically. We can handle zero separately using nested ternary operators, which we will study next.

## 5.7 Nested Ternary Operator

A ternary operator can be placed inside another ternary operator.

This is called a nested ternary operator.

It is useful when we need to select between more than two possible results.

### Example: Find the Greatest of Three Numbers

    public class GreatestNumber {
        public static void main(String[] args) {

            int a = 30;
            int b = 50;
            int c = 40;

            int greatest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

            System.out.println("Greatest Number = " + greatest);
        }
    }

Output:

    Greatest Number = 50

Explanation:

First, Java checks:

    a > b

Since 30 is not greater than 50, it selects the expression after the first colon:

    (b > c) ? b : c

Now Java checks:

    b > c

Since 50 is greater than 40, it selects `b`.

Therefore:

    greatest = 50

Important: Nested ternary operators can become difficult to read if too many conditions are used. Use them carefully.

---

# 6. DIFFERENCE BETWEEN ALL FOUR OPERATORS

| Operator Category | Purpose | Example | Result |
|---|---|---|---|
| Assignment | Assigns or updates values | `a += 5` | Updates a |
| Relational | Compares two values | `a > b` | true/false |
| Logical | Combines or reverses conditions | `a > b && b > c` | true/false |
| Ternary | Selects one of two expressions | `a > b ? a : b` | Selected value |

---

# 7. OPERATOR PRECEDENCE

When multiple operators are used in a single expression, Java follows operator precedence rules.

Operator precedence determines which operation is performed first.

For example:

    int result = 10 + 5 * 2;

The multiplication operation is performed before addition.

Therefore:

    result = 10 + 10
    result = 20

Some important precedence levels for the operators covered in this module are:

| Priority | Operators | Category |
|---|---|---|
| Higher | `!` | Logical NOT |
|  | `*`, `/`, `%` | Arithmetic |
|  | `+`, `-` | Arithmetic |
|  | `<`, `>`, `<=`, `>=` | Relational |
|  | `==`, `!=` | Equality |
|  | `&&` | Logical AND |
|  | `||` | Logical OR |
|  | `?:` | Ternary |
| Lower | `=`, `+=`, `-=`, etc. | Assignment |

Note: Operators at the same precedence level may follow associativity rules. Parentheses can be used to make the intended order clear.

### Example:

    int a = 10;
    int b = 20;
    int c = 30;

    boolean result = a < b && b < c;

Output:

    true

Explanation:

1. `a < b` gives true.
2. `b < c` gives true.
3. `true && true` gives true.
4. The final result is true.

---

# 8. COMPLETE PRACTICAL EXAMPLE

Let's combine assignment, relational, logical and ternary operators in one program.

### Problem:

A student has two subject marks. We need to:
- Store the marks.
- Calculate their total.
- Check whether the student scored at least 80 in both subjects.
- Check whether the total is at least 150.
- Display "Excellent" if the total is at least 150, otherwise display "Keep Practising".

### Java Program:

    public class StudentResult {
        public static void main(String[] args) {

            int maths = 85;
            int science = 90;

            int total = 0;

            total += maths;
            total += science;

            boolean bothAbove80 = maths >= 80 && science >= 80;

            boolean passedTarget = total >= 150;

            String result = passedTarget ? "Excellent" : "Keep Practising";

            System.out.println("Maths Marks = " + maths);
            System.out.println("Science Marks = " + science);
            System.out.println("Total Marks = " + total);
            System.out.println("Both Above 80 = " + bothAbove80);
            System.out.println("Target Achieved = " + passedTarget);
            System.out.println("Result = " + result);
        }
    }

Output:

    Maths Marks = 85
    Science Marks = 90
    Total Marks = 175
    Both Above 80 = true
    Target Achieved = true
    Result = Excellent

### Concepts Used:

- Assignment operator: `+=`
- Relational operator: `>=`
- Logical operator: `&&`
- Ternary operator: `? :`

This example demonstrates how different operators can work together in a single Java program.

---

# 9. COMMON MISTAKES TO AVOID

1. Confusing `=` with `==`.
   - `=` assigns a value.
   - `==` compares two values.

2. Using `&&` when only one condition needs to be true.
   - Use `&&` when both conditions must be true.
   - Use `||` when at least one condition must be true.

3. Forgetting that relational and logical expressions return boolean values.

4. Writing a ternary operator without the colon `:`.

5. Forgetting that `+=` updates the original variable.

6. Assuming `&&` and `&` behave identically. They differ in short-circuit evaluation.

7. Writing complicated nested ternary expressions that are difficult to understand.
