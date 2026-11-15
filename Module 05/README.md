# MODULE 5: TYPE CASTING AND OPERATORS IN JAVA

## 1. TYPE CASTING IN JAVA

Type casting is the process of converting a value from one data type into another data type.

Java supports two main types of type casting:

1. Implicit Type Casting (Widening Casting)
2. Explicit Type Casting (Narrowing Casting)

### 1.1 IMPLICIT TYPE CASTING (WIDENING CASTING)

Implicit type casting happens automatically when a smaller data type is converted into a larger data type.

Java performs this conversion automatically because the target data type can generally accommodate the value of the original data type.

**Example:**

    public class Main {
        public static void main(String[] args) {

            int number = 100;

            double result = number;

            System.out.println("Integer value: " + number);
            System.out.println("Double value: " + result);
        }
    }

**Output:**

    Integer value: 100
    Double value: 100.0

**Explanation:**

- Initially, `number` is an integer containing `100`.
- We assign it to a `double` variable named `result`.
- Java automatically converts `100` into `100.0`.
- No casting operator is required.

### Widening Conversion Order

The commonly used widening conversions are:

    byte → short → int → long → float → double
                         ↑
                        char

**Important Points:**

- `char` can be converted into `int`, `long`, `float`, and `double`.
- `boolean` cannot be converted into any numeric data type.
- Widening conversions are generally performed automatically.
- Converting a large integer into `float` or `double` can still result in loss of precision.

### Another Example

    public class Main {
        public static void main(String[] args) {

            int marks = 95;

            double percentage = marks;

            System.out.println(percentage);
        }
    }

**Output:**

    95.0

---

### 1.2 EXPLICIT TYPE CASTING (NARROWING CASTING)

Explicit type casting happens when we manually convert a larger data type into a smaller data type.

Java requires us to specify the target data type using the casting operator.

**Syntax:**

    targetDataType variableName = (targetDataType) value;

**Example:**

    public class Main {
        public static void main(String[] args) {

            double number = 25.75;

            int result = (int) number;

            System.out.println("Original value: " + number);
            System.out.println("Converted value: " + result);
        }
    }

**Output:**

    Original value: 25.75
    Converted value: 25

**Explanation:**

- Initially, `number` contains `25.75`.
- We manually convert it into an integer using `(int)`.
- The decimal portion is discarded.
- The resulting integer value is `25`.

**Important:** Explicit casting does not round a decimal number. It removes the fractional part when converting a floating-point value to an integer.

### Another Example

    public class Main {
        public static void main(String[] args) {

            double price = 99.99;

            int convertedPrice = (int) price;

            System.out.println(convertedPrice);
        }
    }

**Output:**

    99

### Difference Between Implicit and Explicit Casting

| Implicit Casting | Explicit Casting |
|---|---|
| Also called widening casting | Also called narrowing casting |
| Performed automatically | Performed manually |
| Generally converts smaller types into larger types | Generally converts larger types into smaller types |
| No casting operator is required | Casting operator is required |
| Usually preserves the value, though precision can still be lost | May lose information or precision |

---

### 1.3 TYPE PROMOTION IN EXPRESSIONS

Java automatically promotes smaller numeric data types such as `byte`, `short`, and `char` to `int` when they are used in most arithmetic expressions.

This process is called numeric promotion.

**Example:**

    public class Main {
        public static void main(String[] args) {

            byte a = 10;
            byte b = 20;

            int result = a + b;

            System.out.println(result);
        }
    }

**Output:**

    30

**Explanation:**

- Both `a` and `b` are declared as `byte`.
- During addition, Java promotes them to `int`.
- Therefore, the result of `a + b` is an `int`.

---

## 2. OPERATORS IN JAVA

An operator is a special symbol that performs an operation on one or more values or variables.

The values on which an operator works are called operands.

**Example:**

    int result = 10 + 20;

Here:

- `+` is the operator.
- `10` and `20` are operands.
- `30` is the result.

Java provides different types of operators to perform mathematical calculations, comparisons, logical operations, and other tasks.

In this module, we will study:

1. Arithmetic Operators
2. Unary Operators
3. Increment and Decrement Operators

---

## 3. ARITHMETIC OPERATORS

Arithmetic operators are used to perform basic mathematical operations on numeric values.

Java provides five main arithmetic operators:

| Operator | Name | Purpose |
|---|---|---|
| `+` | Addition | Adds two values |
| `-` | Subtraction | Subtracts one value from another |
| `*` | Multiplication | Multiplies two values |
| `/` | Division | Divides one value by another |
| `%` | Modulus | Returns the remainder after division |

### 3.1 ADDITION (+)

The addition operator adds two values.

**Example:**

    public class Main {
        public static void main(String[] args) {

            int a = 10;
            int b = 20;

            int result = a + b;

            System.out.println("Sum: " + result);
        }
    }

**Output:**

    Sum: 30

### 3.2 SUBTRACTION (-)

The subtraction operator subtracts the second value from the first value.

**Example:**

    public class Main {
        public static void main(String[] args) {

            int a = 50;
            int b = 20;

            int result = a - b;

            System.out.println("Difference: " + result);
        }
    }

**Output:**

    Difference: 30

### 3.3 MULTIPLICATION (*)

The multiplication operator multiplies two values.

**Example:**

    public class Main {
        public static void main(String[] args) {

            int a = 5;
            int b = 4;

            int result = a * b;

            System.out.println("Product: " + result);
        }
    }

**Output:**

    Product: 20

### 3.4 DIVISION (/)

The division operator divides one value by another.

**Example:**

    public class Main {
        public static void main(String[] args) {

            int a = 20;
            int b = 4;

            int result = a / b;

            System.out.println("Quotient: " + result);
        }
    }

**Output:**

    Quotient: 5

#### Important: Integer Division

When both operands are integers, Java performs integer division.

This means the fractional part of the result is discarded.

**Example:**

    public class Main {
        public static void main(String[] args) {

            int a = 10;
            int b = 3;

            System.out.println(a / b);
        }
    }

**Output:**

    3

The mathematical result is approximately `3.333`, but Java returns `3` because both operands are integers.

#### Getting a Decimal Result

If at least one operand is a floating-point value, Java performs floating-point division.

**Example:**

    public class Main {
        public static void main(String[] args) {

            double a = 10;
            double b = 3;

            System.out.println(a / b);
        }
    }

**Output:**

    3.3333333333333335

### 3.5 MODULUS (%)

The modulus operator returns the remainder after division.

It is represented by the `%` symbol.

**Example:**

    public class Main {
        public static void main(String[] args) {

            int a = 10;
            int b = 3;

            int result = a % b;

            System.out.println("Remainder: " + result);
        }
    }

**Output:**

    Remainder: 1

**Explanation:**

    10 ÷ 3 = 3 remainder 1

Therefore:

    10 % 3 = 1

#### Practical Uses of Modulus

**Example 1: Checking Whether a Number Is Even or Odd**

    public class Main {
        public static void main(String[] args) {

            int number = 15;

            if (number % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
        }
    }

**Output:**

    Odd Number

**Explanation:**

- An even number gives remainder `0` when divided by `2`.
- An odd number gives remainder `1` when divided by `2`.

**Example 2: Extracting the Last Digit**

    public class Main {
        public static void main(String[] args) {

            int number = 12345;

            int lastDigit = number % 10;

            System.out.println(lastDigit);
        }
    }

**Output:**

    5

### 3.6 IMPORTANT POINTS ABOUT ARITHMETIC OPERATORS

1. Arithmetic operators are used for mathematical calculations.
2. The `+` operator performs addition.
3. The `-` operator performs subtraction.
4. The `*` operator performs multiplication.
5. The `/` operator performs division.
6. The `%` operator returns the remainder.
7. Integer division discards the fractional part.
8. Division or modulus by zero with integer operands causes an `ArithmeticException` at runtime.

---

## 4. OPERATOR PRECEDENCE AND ASSOCIATIVITY

When an expression contains multiple operators, Java follows a specific order to evaluate them.

This order is called operator precedence.

**Example:**

    int result = 10 + 5 * 2;

Java performs multiplication before addition.

Step 1:

    5 * 2 = 10

Step 2:

    10 + 10 = 20

**Final Result:**

    20

### Parentheses

Parentheses can be used to control the order of evaluation.

**Example:**

    int result = (10 + 5) * 2;

Step 1:

    10 + 5 = 15

Step 2:

    15 * 2 = 30

**Final Result:**

    30

### Precedence of Arithmetic Operators

From higher precedence to lower precedence:

| Priority | Operators | Operation |
|---|---|---|
| 1 | `*`, `/`, `%` | Multiplication, Division, Modulus |
| 2 | `+`, `-` | Addition, Subtraction |

Operators with the same precedence are generally evaluated from left to right.

**Example:**

    int result = 20 / 5 * 2;

Step 1:

    20 / 5 = 4

Step 2:

    4 * 2 = 8

**Output:**

    8

---

## 5. UNARY OPERATORS

A unary operator is an operator that works on only one operand.

Unlike binary operators, which work on two operands, unary operators require only one value or variable.

**Example:**

    int a = 10;

    int result = -a;

Here, the unary minus operator works on only one variable, `a`.

### Types of Unary Operators

| Operator | Name | Purpose |
|---|---|---|
| `+` | Unary Plus | Indicates a positive value |
| `-` | Unary Minus | Changes the sign of a value |
| `++` | Increment | Increases a variable's value by 1 |
| `--` | Decrement | Decreases a variable's value by 1 |
| `!` | Logical NOT | Reverses a boolean value |
| `~` | Bitwise Complement | Reverses the bits of an integer |

### 5.1 UNARY PLUS (+)

The unary plus operator indicates a positive numeric value.

**Example:**

    public class Main {
        public static void main(String[] args) {

            int number = 10;

            int result = +number;

            System.out.println(result);
        }
    }

**Output:**

    10

The unary plus operator does not change the value.

### 5.2 UNARY MINUS (-)

The unary minus operator changes the sign of a numeric value.

**Example:**

    public class Main {
        public static void main(String[] args) {

            int number = 10;

            int result = -number;

            System.out.println(result);
        }
    }

**Output:**

    -10

### 5.3 LOGICAL NOT (!)

The logical NOT operator reverses a boolean value.

- `true` becomes `false`.
- `false` becomes `true`.

**Example:**

    public class Main {
        public static void main(String[] args) {

            boolean isJavaEasy = true;

            System.out.println(!isJavaEasy);
        }
    }

**Output:**

    false

### 5.4 BITWISE COMPLEMENT (~)

The bitwise complement operator reverses all the bits of an integer value.

In Java, integer values are represented using two's complement.

**Example:**

    public class Main {
        public static void main(String[] args) {

            int number = 5;

            System.out.println(~number);
        }
    }

**Output:**

    -6

A useful identity for Java integer values is:

    ~n = -(n + 1)

Therefore:

    ~5 = -(5 + 1) = -6

---

## 6. INCREMENT AND DECREMENT OPERATORS

Increment and decrement operators are used to increase or decrease the value of a variable by exactly one.

Java provides two operators:

| Operator | Name | Operation |
|---|---|---|
| `++` | Increment | Increases value by 1 |
| `--` | Decrement | Decreases value by 1 |

### 6.1 INCREMENT OPERATOR (++)

The increment operator increases the value of a variable by one.

**Example:**

    public class Main {
        public static void main(String[] args) {

            int number = 10;

            number++;

            System.out.println(number);
        }
    }

**Output:**

    11

Here:

    number = 10
    number++ means number = number + 1
    number = 11

### 6.2 DECREMENT OPERATOR (--)

The decrement operator decreases the value of a variable by one.

**Example:**

    public class Main {
        public static void main(String[] args) {

            int number = 10;

            number--;

            System.out.println(number);
        }
    }

**Output:**

    9

Here:

    number = 10
    number-- means number = number - 1
    number = 9

---

## 7. PRE-INCREMENT AND POST-INCREMENT

The increment operator can be used in two different ways:

1. Pre-Increment (`++a`)
2. Post-Increment (`a++`)

The main difference is when the increment happens in relation to the value being used in an expression.

### 7.1 PRE-INCREMENT (++a)

In pre-increment, the variable is increased by one first, and then its updated value is used in the expression.

**Syntax:**

    ++variableName;

**Example:**

    public class Main {
        public static void main(String[] args) {

            int a = 5;

            int b = ++a;

            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }

**Output:**

    a = 6
    b = 6

### Step-by-Step Explanation

Initially:

    a = 5

Statement:

    int b = ++a;

Step 1: Increment `a`.

    a = 6

Step 2: Assign the updated value of `a` to `b`.

    b = 6

Final values:

    a = 6
    b = 6

### 7.2 POST-INCREMENT (a++)

In post-increment, the current value of the variable is used in the expression first, and then the variable is increased by one.

**Syntax:**

    variableName++;

**Example:**

    public class Main {
        public static void main(String[] args) {

            int a = 5;

            int b = a++;

            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }

**Output:**

    a = 6
    b = 5

### Step-by-Step Explanation

Initially:

    a = 5

Statement:

    int b = a++;

Step 1: Use the current value of `a` in the assignment.

    b = 5

Step 2: Increment `a`.

    a = 6

Final values:

    a = 6
    b = 5

---

## 8. PRE-DECREMENT AND POST-DECREMENT

The decrement operator also has two forms:

1. Pre-Decrement (`--a`)
2. Post-Decrement (`a--`)

### 8.1 PRE-DECREMENT (--a)

In pre-decrement, the variable is decreased by one first, and then its updated value is used in the expression.

**Example:**

    public class Main {
        public static void main(String[] args) {

            int a = 5;

            int b = --a;

            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }

**Output:**

    a = 4
    b = 4

### Step-by-Step Explanation

Initially:

    a = 5

Statement:

    int b = --a;

Step 1: Decrease `a` by one.

    a = 4

Step 2: Assign the updated value to `b`.

    b = 4

Final values:

    a = 4
    b = 4

### 8.2 POST-DECREMENT (a--)

In post-decrement, the current value of the variable is used in the expression first, and then the variable is decreased by one.

**Example:**

    public class Main {
        public static void main(String[] args) {

            int a = 5;

            int b = a--;

            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }

**Output:**

    a = 4
    b = 5

### Step-by-Step Explanation

Initially:

    a = 5

Statement:

    int b = a--;

Step 1: Use the current value of `a`.

    b = 5

Step 2: Decrease `a` by one.

    a = 4

Final values:

    a = 4
    b = 5

---

## 9. COMPARISON OF PRE-INCREMENT AND POST-INCREMENT

| Pre-Increment (`++a`) | Post-Increment (`a++`) |
|---|---|
| Increments the variable first | Uses the current value first |
| Updated value is used in the expression | Original value is used in the expression |
| Then the expression continues | The variable is incremented after its value is used |

### Comparison Example

    public class Main {
        public static void main(String[] args) {

            int a = 5;
            int b = 5;

            int x = ++a;
            int y = b++;

            System.out.println("a = " + a);
            System.out.println("x = " + x);

            System.out.println("b = " + b);
            System.out.println("y = " + y);
        }
    }

**Output:**

    a = 6
    x = 6
    b = 6
    y = 5

### Comparison of Pre-Decrement and Post-Decrement

| Pre-Decrement (`--a`) | Post-Decrement (`a--`) |
|---|---|
| Decrements the variable first | Uses the current value first |
| Updated value is used in the expression | Original value is used in the expression |
| Then the expression continues | The variable is decremented after its value is used |

---

## 10. UNDERSTANDING EXPRESSIONS WITH INCREMENT OPERATORS

Let's understand how increment operators work when used inside larger expressions.

### Example 1

    int a = 5;
    int result = a++ + 10;

Step 1: `a++` uses the current value of `a`.

    5 + 10

Step 2: Calculate the expression.

    result = 15

Step 3: Increment `a`.

    a = 6

**Final Values:**

    a = 6
    result = 15

### Example 2

    int a = 5;
    int result = ++a + 10;

Step 1: Increment `a` first.

    a = 6

Step 2: Use the updated value.

    6 + 10

Step 3: Calculate the expression.

    result = 16

**Final Values:**

    a = 6
    result = 16

### Example 3

    int a = 4;
    int b = 3;

    int result = a++ + ++b;

Initially:

    a = 4
    b = 3

Step 1: Evaluate `a++`.

- Its current value, `4`, is used.
- Then `a` becomes `5`.

Step 2: Evaluate `++b`.

- First, `b` becomes `4`.
- Its updated value, `4`, is used.

Step 3: Add the values.

    result = 4 + 4
    result = 8

**Final Values:**

    a = 5
    b = 4
    result = 8

**Important:** Avoid writing complicated expressions that increment or decrement the same variable multiple times. Simple expressions are easier to understand and debug.

---

## 11. QUICK REVISION TABLE

| Concept | Meaning |
|---|---|
| Type Casting | Converting one data type into another |
| Implicit Casting | Automatic conversion |
| Explicit Casting | Manual conversion |
| Arithmetic Operators | Operators used for mathematical calculations |
| Unary Operators | Operators that work on one operand |
| Increment (`++`) | Increases value by 1 |
| Decrement (`--`) | Decreases value by 1 |
| Pre-Increment (`++a`) | Increment first, then use the updated value |
| Post-Increment (`a++`) | Use the current value, then increment |
| Pre-Decrement (`--a`) | Decrement first, then use the updated value |
| Post-Decrement (`a--`) | Use the current value, then decrement |

---

## 12. IMPORTANT POINTS TO REMEMBER

1. Type casting is used to convert one data type into another.
2. Implicit casting is performed automatically by Java.
3. Explicit casting requires the casting operator.
4. Narrowing conversions may cause loss of information.
5. Java promotes `byte`, `short`, and `char` to `int` in most arithmetic expressions.
6. Arithmetic operators include addition, subtraction, multiplication, division, and modulus.
7. Integer division discards the fractional part.
8. The modulus operator returns the remainder.
9. Unary operators work on only one operand.
10. Increment increases a variable's value by one.
11. Decrement decreases a variable's value by one.
12. Pre-increment changes the value before it is used in an expression.
13. Post-increment uses the current value before changing it.
14. Pre-decrement changes the value before it is used in an expression.
15. Post-decrement uses the current value before changing it.

---