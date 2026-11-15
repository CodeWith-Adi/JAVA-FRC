# Module 16: Strings in Java – Part 1

## 1. What is a String?

A **String** is a sequence of characters used to store and represent text in Java.

For example:
- `"Hello"`
- `"Aditya"`
- `"Java Programming"`
- `"12345"`

In Java, String is a **non-primitive data type** because it is a class.

A String is written inside double quotation marks (`" "`).

### Example

    public class main {

        public static void main(String[] args) {

            String name = "Aditya";
            String subject = "Computer Science";

            System.out.println(name);
            System.out.println(subject);

        }

    }

### Output

    Aditya
    Computer Science

---

## 2. Creating Strings in Java

There are two common ways to create a String in Java.

### 1. Using String Literals

We can create a String by directly assigning text inside double quotation marks.

    String name = "Aditya";

This is the most commonly used way to create Strings.

### 2. Using the `new` Keyword

We can also create a String object using the `new` keyword.

    String name = new String("Aditya");

Here:
- `String` is the class name.
- `name` is the reference variable.
- `new` creates a new String object.
- `"Aditya"` is the String value.

### Difference

    String s1 = "Java";
    String s2 = new String("Java");

Both variables contain the text `"Java"`, but they are created differently.

---

## 3. Important Characteristics of Strings

### 1. Strings are Objects

String is a predefined class in Java.

    String name = "Aditya";

Here, `name` is a reference variable that refers to a String object.

### 2. Strings are Immutable

**Immutable** means something that cannot be changed after it is created.

In Java, Strings are immutable.

Whenever we perform an operation that appears to modify a String, Java creates a new String instead of changing the original String.

#### Example

    public class main {

        public static void main(String[] args) {

            String name = "Aditya";

            name.concat(" Kumar");

            System.out.println(name);

        }

    }

### Output

    Aditya

### Explanation

1. We created a String named `name` with the value `"Aditya"`.
2. We used the `concat()` method to join `" Kumar"` with it.
3. The `concat()` method returned a new String.
4. We did not store the returned String anywhere.
5. Therefore, the original String remained unchanged.

To store the modified result:

    String name = "Aditya";

    name = name.concat(" Kumar");

    System.out.println(name);

### Output

    Aditya Kumar

---

## 4. String Pool

Java maintains a special memory area called the **String Constant Pool** to store String literals.

It helps Java reuse existing String objects and save memory.

### Example

    public class main {

        public static void main(String[] args) {

            String s1 = "Java";
            String s2 = "Java";

            System.out.println(s1 == s2);

        }

    }

### Output

    true

### Explanation

1. `s1` is assigned the String literal `"Java"`.
2. `s2` is assigned the same String literal.
3. Java reuses the existing String object from the String Pool.
4. Both references point to the same object.
5. Therefore, `s1 == s2` returns `true`.

**Note:** The `==` operator compares references when used with objects. It does not compare the actual text stored in Strings.

---

# 5. String Methods in Java

Java provides several built-in methods to perform operations on Strings.

These methods help us:
- Find the length of a String.
- Access individual characters.
- Compare Strings.
- Join Strings.
- Convert uppercase letters into lowercase and vice versa.
- Extract a part of a String.
- Search for characters or words.

Let's understand the most commonly used String methods.

---

## 5.1 `length()`

The `length()` method returns the total number of characters present in a String.

### Syntax

    stringName.length();

### Example

    String name = "Aditya";

    System.out.println(name.length());

### Output

    6

### Explanation

The String `"Aditya"` contains 6 characters.

**Important:** Spaces are also counted as characters.

    String text = "Java Programming";

    System.out.println(text.length());

Output:

    16

---

## 5.2 `charAt()`

The `charAt()` method returns the character present at a particular index in a String.

### Syntax

    stringName.charAt(index);

### Example

    String name = "Aditya";

    System.out.println(name.charAt(0));
    System.out.println(name.charAt(2));
    System.out.println(name.charAt(5));

### Output

    A
    i
    a

### Explanation

Java uses zero-based indexing.

This means the index of the first character is `0`, not `1`.

For `"Aditya"`:

| Character | A | d | i | t | y | a |
|---|---|---|---|---|---|---|
| Index | 0 | 1 | 2 | 3 | 4 | 5 |

**Important:** If we provide an index outside the valid range, Java throws a `StringIndexOutOfBoundsException`.

---

## 5.3 `toUpperCase()`

The `toUpperCase()` method converts all lowercase letters in a String into uppercase letters.

### Syntax

    stringName.toUpperCase();

### Example

    String name = "Aditya";

    System.out.println(name.toUpperCase());

### Output

    ADITYA

---

## 5.4 `toLowerCase()`

The `toLowerCase()` method converts all uppercase letters in a String into lowercase letters.

### Syntax

    stringName.toLowerCase();

### Example

    String name = "JAVA PROGRAMMING";

    System.out.println(name.toLowerCase());

### Output

    java programming

**Note:** Both `toUpperCase()` and `toLowerCase()` return new Strings. They do not modify the original String.

---

## 5.5 `equals()`

The `equals()` method compares two Strings based on their actual content.

It returns:
- `true` if both Strings contain exactly the same characters.
- `false` if their contents are different.

### Syntax

    string1.equals(string2);

### Example

    String s1 = "Java";
    String s2 = "Java";
    String s3 = "java";

    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));

### Output

    true
    false

### Explanation

- `s1` and `s2` contain exactly the same text.
- `s1` and `s3` differ in letter case.
- Therefore, the second comparison returns `false`.

**Important:** `equals()` is case-sensitive.

---

## 5.6 `equalsIgnoreCase()`

The `equalsIgnoreCase()` method compares two Strings without considering uppercase and lowercase differences.

### Syntax

    string1.equalsIgnoreCase(string2);

### Example

    String s1 = "Java";
    String s2 = "JAVA";

    System.out.println(s1.equalsIgnoreCase(s2));

### Output

    true

### Explanation

Both Strings contain the same letters, but their cases are different.

The `equalsIgnoreCase()` method ignores these case differences.

---

## 5.7 `concat()`

The `concat()` method joins two Strings and returns a new String.

### Syntax

    string1.concat(string2);

### Example

    String firstName = "Aditya";
    String lastName = " Kumar";

    String fullName = firstName.concat(lastName);

    System.out.println(fullName);

### Output

    Aditya Kumar

### Explanation

- `firstName` contains `"Aditya"`.
- `lastName` contains `" Kumar"`.
- `concat()` joins both Strings.
- The result is stored in `fullName`.

**Note:** We can also join Strings using the `+` operator.

    String fullName = firstName + lastName;

---

## 5.8 `substring()`

The `substring()` method extracts a part of a String.

There are two commonly used forms.

### 1. `substring(beginIndex)`

Returns the String starting from the given index up to the end.

#### Syntax

    stringName.substring(beginIndex);

#### Example

    String name = "Programming";

    System.out.println(name.substring(3));

#### Output

    gramming

### 2. `substring(beginIndex, endIndex)`

Returns the characters starting from `beginIndex` and ending just before `endIndex`.

#### Syntax

    stringName.substring(beginIndex, endIndex);

#### Example

    String name = "Programming";

    System.out.println(name.substring(0, 7));

#### Output

    Program

### Explanation

- The starting index is included.
- The ending index is excluded.

---

## 5.9 `indexOf()`

The `indexOf()` method returns the index of the first occurrence of a specified character or String.

If the character or String is not found, it returns `-1`.

### Syntax

    stringName.indexOf(character);

### Example

    String name = "Programming";

    System.out.println(name.indexOf('g'));
    System.out.println(name.indexOf('m'));
    System.out.println(name.indexOf('z'));

### Output

    3
    6
    -1

### Explanation

- The first occurrence of `'g'` is at index `3`.
- The first occurrence of `'m'` is at index `6`.
- `'z'` is not present, so the method returns `-1`.

**Note:** `indexOf()` is case-sensitive.

---

## 5.10 `lastIndexOf()`

The `lastIndexOf()` method returns the index of the last occurrence of a specified character or String.

If it is not found, it returns `-1`.

### Syntax

    stringName.lastIndexOf(character);

### Example

    String name = "Programming";

    System.out.println(name.lastIndexOf('g'));
    System.out.println(name.lastIndexOf('m'));

### Output

    10
    7

### Explanation

Unlike `indexOf()`, which returns the first occurrence, `lastIndexOf()` returns the last occurrence.

---

## 5.11 `contains()`

The `contains()` method checks whether a String contains a particular sequence of characters.

It returns a boolean value (`true` or `false`).

### Syntax

    stringName.contains(sequence);

### Example

    String sentence = "I love Java Programming";

    System.out.println(sentence.contains("Java"));
    System.out.println(sentence.contains("Python"));

### Output

    true
    false

---

## 5.12 `startsWith()`

The `startsWith()` method checks whether a String begins with a specified sequence of characters.

### Syntax

    stringName.startsWith(prefix);

### Example

    String name = "Programming";

    System.out.println(name.startsWith("Pro"));
    System.out.println(name.startsWith("gram"));

### Output

    true
    false

---

## 5.13 `endsWith()`

The `endsWith()` method checks whether a String ends with a specified sequence of characters.

### Syntax

    stringName.endsWith(suffix);

### Example

    String fileName = "document.pdf";

    System.out.println(fileName.endsWith(".pdf"));
    System.out.println(fileName.endsWith(".txt"));

### Output

    true
    false

---

## 5.14 `trim()`

The `trim()` method removes leading and trailing spaces from a String.

It does not remove spaces between words.

### Syntax

    stringName.trim();

### Example

    String name = "   Aditya Kumar   ";

    System.out.println(name.trim());

### Output

    Aditya Kumar

### Explanation

- Leading spaces are removed.
- Trailing spaces are removed.
- Spaces between `"Aditya"` and `"Kumar"` remain unchanged.

---

## 5.15 `replace()`

The `replace()` method replaces all occurrences of a specified character or sequence with another character or sequence.

### Syntax

    stringName.replace(oldValue, newValue);

### Example 1: Replacing Characters

    String name = "banana";

    System.out.println(name.replace('a', 'o'));

### Output

    bonono

### Example 2: Replacing Words

    String sentence = "I like Python";

    System.out.println(sentence.replace("Python", "Java"));

### Output

    I like Java

**Note:** The original String remains unchanged unless we store the returned result.

---

## 6. Difference Between `==` and `equals()`

Both `==` and `equals()` can be used when comparing Strings, but they perform different comparisons.

| `==` Operator | `equals()` Method |
|---|---|
| Compares object references. | Compares actual String content. |
| Checks whether references point to the same object. | Checks whether the characters are equal. |
| It is an operator. | It is a method of the String class. |

### Example

    String s1 = new String("Java");
    String s2 = new String("Java");

    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));

### Output

    false
    true

### Explanation

- Both variables refer to different String objects.
- Therefore, `s1 == s2` returns `false`.
- Both objects contain the same text.
- Therefore, `s1.equals(s2)` returns `true`.

---

## 7. Important String Methods – Quick Revision

| Method | Purpose |
|---|---|
| `length()` | Returns the number of characters. |
| `charAt()` | Returns the character at a given index. |
| `toUpperCase()` | Converts letters to uppercase. |
| `toLowerCase()` | Converts letters to lowercase. |
| `equals()` | Compares String contents. |
| `equalsIgnoreCase()` | Compares contents without considering case. |
| `concat()` | Joins two Strings. |
| `substring()` | Extracts a part of a String. |
| `indexOf()` | Finds the first occurrence. |
| `lastIndexOf()` | Finds the last occurrence. |
| `contains()` | Checks whether a sequence exists. |
| `startsWith()` | Checks the beginning of a String. |
| `endsWith()` | Checks the ending of a String. |
| `trim()` | Removes leading and trailing spaces. |
| `replace()` | Replaces characters or sequences. |

---

## 8. Important Points to Remember

1. String is a predefined class in Java.
2. Strings are non-primitive reference types.
3. Strings are written inside double quotation marks.
4. Java Strings are immutable.
5. Java maintains a String Constant Pool to reuse String literals.
6. String indexing starts from `0`.
7. The `length()` method returns the number of characters, not the last index.
8. The `charAt()` method returns a character at a specified index.
9. The `equals()` method compares String contents.
10. The `==` operator compares object references.
11. Most String methods return a new String instead of modifying the original String.
12. String methods are case-sensitive unless their documentation or name indicates otherwise.

**Final Concept:**

A String is an object used to store text, and Java provides several built-in String methods to manipulate, compare, search and extract text efficiently.