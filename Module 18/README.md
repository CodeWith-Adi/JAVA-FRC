# Module 18: Math Class and Math Methods in Java

## 1. Introduction

Java provides a built-in class called `Math` that contains various methods and constants for performing mathematical operations.

The `Math` class belongs to the `java.lang` package, which is automatically imported in every Java program. Therefore, we do not need to write an import statement to use it.

We can use the Math class to perform operations such as:
- Finding the absolute value of a number.
- Finding the maximum and minimum of two numbers.
- Calculating square roots and cube roots.
- Calculating powers of numbers.
- Rounding decimal values.
- Generating random numbers.
- Performing trigonometric calculations.

**Syntax**

    Math.methodName(arguments);

**Example**

    System.out.println(Math.sqrt(25));

**Output**

    5.0

**Explanation**

- `Math` is the name of the built-in class.
- `sqrt()` is the method used to calculate the square root.
- `25` is the argument passed to the method.
- The method returns the result, which is printed.

**Note:** Most methods of the Math class are static, so we can call them directly using the class name without creating an object.

---

## 2. Basic Mathematical Methods

### 2.1 Math.abs()

The `abs()` method returns the absolute value of a number.

The absolute value of a number is its non-negative value, without considering its sign.

**Syntax**

    Math.abs(number);

**Example**

    public class main {

        public static void main(String[] args) {

            System.out.println(Math.abs(-25));
            System.out.println(Math.abs(15));
            System.out.println(Math.abs(-8.5));

        }

    }

**Output**

    25
    15
    8.5

**Explanation**

- `Math.abs(-25)` returns `25`.
- `Math.abs(15)` returns `15`.
- `Math.abs(-8.5)` returns `8.5`.

### 2.2 Math.max()

The `max()` method returns the greater of two numbers.

**Syntax**

    Math.max(number1, number2);

**Example**

    public class main {

        public static void main(String[] args) {

            System.out.println(Math.max(10, 20));
            System.out.println(Math.max(45, 30));
            System.out.println(Math.max(5.5, 8.5));

        }

    }

**Output**

    20
    45
    8.5

**Explanation**

- `Math.max(10, 20)` returns `20`.
- `Math.max(45, 30)` returns `45`.
- `Math.max(5.5, 8.5)` returns `8.5`.

### 2.3 Math.min()

The `min()` method returns the smaller of two numbers.

**Syntax**

    Math.min(number1, number2);

**Example**

    public class main {

        public static void main(String[] args) {

            System.out.println(Math.min(10, 20));
            System.out.println(Math.min(45, 30));
            System.out.println(Math.min(5.5, 8.5));

        }

    }

**Output**

    10
    30
    5.5

**Explanation**

- `Math.min(10, 20)` returns `10`.
- `Math.min(45, 30)` returns `30`.
- `Math.min(5.5, 8.5)` returns `5.5`.

**Note:** Both `max()` and `min()` can be used with different numeric data types.

---

## 3. Square Root and Cube Root Methods

### 3.1 Math.sqrt()

The `sqrt()` method calculates the square root of a number.

A square root of a number is a value that, when multiplied by itself, gives the original number.

**Syntax**

    Math.sqrt(number);

**Example**

    public class main {

        public static void main(String[] args) {

            System.out.println(Math.sqrt(25));
            System.out.println(Math.sqrt(64));
            System.out.println(Math.sqrt(100));

        }

    }

**Output**

    5.0
    8.0
    10.0

**Explanation**

- `Math.sqrt(25)` returns `5.0` because 5 × 5 = 25.
- `Math.sqrt(64)` returns `8.0` because 8 × 8 = 64.
- `Math.sqrt(100)` returns `10.0` because 10 × 10 = 100.

**Note:** The `sqrt()` method returns a `double` value.

### 3.2 Math.cbrt()

The `cbrt()` method calculates the cube root of a number.

A cube root of a number is a value that, when multiplied by itself three times, gives the original number.

**Syntax**

    Math.cbrt(number);

**Example**

    public class main {

        public static void main(String[] args) {

            System.out.println(Math.cbrt(27));
            System.out.println(Math.cbrt(64));
            System.out.println(Math.cbrt(125));

        }

    }

**Output**

    3.0
    4.0
    5.0

**Explanation**

- `Math.cbrt(27)` returns `3.0` because 3 × 3 × 3 = 27.
- `Math.cbrt(64)` returns `4.0` because 4 × 4 × 4 = 64.
- `Math.cbrt(125)` returns `5.0` because 5 × 5 × 5 = 125.

**Note:** Unlike `sqrt()`, the `cbrt()` method can also calculate cube roots of negative numbers.

---

## 4. Power Method

### 4.1 Math.pow()

The `pow()` method calculates the power of a number.

It takes two arguments:
- Base: The number that is being multiplied.
- Exponent: The number of times the base is used as a factor.

**Syntax**

    Math.pow(base, exponent);

**Example**

    public class main {

        public static void main(String[] args) {

            System.out.println(Math.pow(2, 3));
            System.out.println(Math.pow(5, 2));
            System.out.println(Math.pow(10, 3));

        }

    }

**Output**

    8.0
    25.0
    1000.0

**Explanation**

- `Math.pow(2, 3)` calculates 2³ = 2 × 2 × 2 = 8.
- `Math.pow(5, 2)` calculates 5² = 5 × 5 = 25.
- `Math.pow(10, 3)` calculates 10³ = 1000.

**Important Points**

1. The first argument represents the base.
2. The second argument represents the exponent.
3. The `pow()` method returns a `double` value.

---

## 5. Rounding Methods

Java provides different methods to round decimal values.

### 5.1 Math.round()

The `round()` method rounds a decimal number to the nearest whole number.

**Syntax**

    Math.round(number);

**Example**

    public class main {

        public static void main(String[] args) {

            System.out.println(Math.round(4.3));
            System.out.println(Math.round(4.7));
            System.out.println(Math.round(8.5));

        }

    }

**Output**

    4
    5
    9

**Explanation**

- `Math.round(4.3)` returns `4`.
- `Math.round(4.7)` returns `5`.
- `Math.round(8.5)` returns `9`.

**Note:** For positive decimal values, `round()` rounds to the nearest whole number. When the decimal part is exactly `.5`, it rounds upward.

### 5.2 Math.ceil()

The `ceil()` method returns the smallest whole-number value that is greater than or equal to the given number.

**Syntax**

    Math.ceil(number);

**Example**

    public class main {

        public static void main(String[] args) {

            System.out.println(Math.ceil(4.2));
            System.out.println(Math.ceil(4.8));
            System.out.println(Math.ceil(7.0));

        }

    }

**Output**

    5.0
    5.0
    7.0

**Explanation**

- `Math.ceil(4.2)` returns `5.0`.
- `Math.ceil(4.8)` returns `5.0`.
- `Math.ceil(7.0)` returns `7.0`.

### 5.3 Math.floor()

The `floor()` method returns the greatest whole-number value that is less than or equal to the given number.

**Syntax**

    Math.floor(number);

**Example**

    public class main {

        public static void main(String[] args) {

            System.out.println(Math.floor(4.2));
            System.out.println(Math.floor(4.8));
            System.out.println(Math.floor(7.0));

        }

    }

**Output**

    4.0
    4.0
    7.0

**Explanation**

- `Math.floor(4.2)` returns `4.0`.
- `Math.floor(4.8)` returns `4.0`.
- `Math.floor(7.0)` returns `7.0`.

### 5.4 Difference Between Rounding Methods

| Method | Purpose | Example | Result |
|---|---|---|---|
| `round()` | Rounds to nearest whole number | `Math.round(4.7)` | `5` |
| `ceil()` | Rounds upward | `Math.ceil(4.2)` | `5.0` |
| `floor()` | Rounds downward | `Math.floor(4.8)` | `4.0` |

---

## 6. Random Number Generation

### 6.1 Math.random()

The `random()` method generates a random decimal number greater than or equal to `0.0` and less than `1.0`.

**Syntax**

    Math.random();

**Example**

    public class main {

        public static void main(String[] args) {

            System.out.println(Math.random());
            System.out.println(Math.random());
            System.out.println(Math.random());

        }

    }

**Possible Output**

    0.45821
    0.82734
    0.10256

**Explanation**

- `Math.random()` generates a random decimal number.
- The generated number is always greater than or equal to `0.0`.
- The generated number is always less than `1.0`.
- Every execution can produce different values.

### Generating Random Integers Within a Range

We can use type casting and mathematical operations to generate random integers within a particular range.

**Syntax**

    (int)(Math.random() * range) + startingValue;

**Example: Generating a Random Number Between 1 and 10**

    public class main {

        public static void main(String[] args) {

            int randomNumber = (int)(Math.random() * 10) + 1;

            System.out.println(randomNumber);

        }

    }

**Possible Output**

    7

**Explanation**

1. `Math.random()` generates a decimal value between 0.0 and 1.0.
2. Multiplying it by `10` gives a value between 0.0 and 10.0.
3. `(int)` converts the decimal value into an integer by removing the decimal part.
4. Adding `1` shifts the range from 0–9 to 1–10.

**Note:** The output can be any integer from `1` to `10`, including both 1 and 10.

---

## 7. Mathematical Constants

The Math class also provides some predefined mathematical constants.

### 7.1 Math.PI

`Math.PI` represents the mathematical constant π (Pi).

Its approximate value is 3.141592653589793.

**Example**

    public class main {

        public static void main(String[] args) {

            System.out.println(Math.PI);

        }

    }

**Output**

    3.141592653589793

**Example: Calculating the Area of a Circle**

    public class main {

        public static void main(String[] args) {

            double radius = 5;

            double area = Math.PI * Math.pow(radius, 2);

            System.out.println("Area of Circle: " + area);

        }

    }

**Output**

    Area of Circle: 78.53981633974483

**Explanation**

The formula for the area of a circle is:

    Area = π × radius²

We use:
- `Math.PI` to get the value of π.
- `Math.pow(radius, 2)` to calculate the square of the radius.

### 7.2 Math.E

`Math.E` represents Euler's number, another important mathematical constant.

Its approximate value is 2.718281828459045.

**Example**

    public class main {

        public static void main(String[] args) {

            System.out.println(Math.E);

        }

    }

**Output**

    2.718281828459045

**Note:** `PI` and `E` are constants, not methods. Therefore, we do not use parentheses with them.

---

## 8. Important Points to Remember

1. `Math` is a built-in class in Java.
2. The Math class belongs to the `java.lang` package.
3. We do not need to import the Math class separately.
4. Most Math methods are static and can be called using `Math.methodName()`.
5. `Math.abs()` returns the absolute value of a number.
6. `Math.max()` returns the greater of two numbers.
7. `Math.min()` returns the smaller of two numbers.
8. `Math.sqrt()` calculates the square root.
9. `Math.cbrt()` calculates the cube root.
10. `Math.pow()` calculates the power of a number.
11. `Math.round()` rounds a number to the nearest whole number.
12. `Math.ceil()` rounds a number upward.
13. `Math.floor()` rounds a number downward.
14. `Math.random()` generates a random decimal number from 0.0 (inclusive) to 1.0 (exclusive).
15. `Math.PI` and `Math.E` are predefined mathematical constants.
16. Methods such as `sqrt()`, `cbrt()`, `pow()`, `ceil()` and `floor()` return `double` values.

---

## 9. Quick Revision

### Basic Math Methods

    Math.abs(-10);       // 10
    Math.max(10, 20);    // 20
    Math.min(10, 20);    // 10

### Square Root and Cube Root

    Math.sqrt(25);       // 5.0
    Math.cbrt(27);       // 3.0

### Power

    Math.pow(2, 3);      // 8.0

### Rounding Methods

    Math.round(4.7);     // 5
    Math.ceil(4.2);      // 5.0
    Math.floor(4.8);     // 4.0

### Random Number

    Math.random();       // Random decimal between 0.0 and 1.0

### Mathematical Constants

    Math.PI;             // 3.141592653589793
    Math.E;              // 2.718281828459045

**Final Concept:** The Java Math class provides predefined methods and constants that make mathematical calculations easier. Instead of writing mathematical logic from scratch, we can directly use methods such as `sqrt()`, `pow()`, `max()`, `min()` and `round()` to perform common mathematical operations.