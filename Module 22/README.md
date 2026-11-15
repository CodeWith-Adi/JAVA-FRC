# Module 22: ArrayList in Java

## 1. What is an ArrayList?

An **ArrayList** is a resizable array available in Java's `java.util` package.

Unlike normal arrays, which have a fixed size, an ArrayList can dynamically grow or shrink as elements are added or removed.

### Example

    ArrayList<String> names = new ArrayList<String>();

Here:
- `ArrayList` is the class used to create a resizable list.
- `String` specifies the type of elements stored.
- `names` is the name of the ArrayList.
- `new ArrayList<String>()` creates a new ArrayList object.

### Understanding with an Example

    ArrayList<String> fruits = new ArrayList<>();

Initially, the ArrayList is empty.

After adding elements:

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");

The ArrayList now contains:

    [Apple, Banana, Mango]

We can add or remove elements whenever required.

---

## 2. Importing the ArrayList Library

To use ArrayList, we must import it from the `java.util` package.

Syntax:

    import java.util.ArrayList;

Example:

    import java.util.ArrayList;

    public class main {
        public static void main(String[] args) {

            ArrayList<String> fruits = new ArrayList<>();

            fruits.add("Apple");
            fruits.add("Banana");

            System.out.println(fruits);
        }
    }

Output:

    [Apple, Banana]

**Important:** Unlike normal arrays, ArrayList requires an import statement.

---

## 3. Creating an ArrayList

### A. Declaration and Creation

Syntax:

    ArrayList<Datatype> arrayListName = new ArrayList<>();

Example:

    ArrayList<String> names = new ArrayList<>();

This creates an empty ArrayList that can store String values.

### B. Adding Initial Elements

We can create an ArrayList and add elements using the `add()` method.

    ArrayList<Integer> numbers = new ArrayList<>();

    numbers.add(10);
    numbers.add(20);
    numbers.add(30);

Output:

    [10, 20, 30]

### C. Using the Diamond Operator

Java allows us to avoid writing the datatype again on the right side.

    ArrayList<String> names = new ArrayList<>();

This is called the **Diamond Operator (`<>`)**.

---

## 4. Common ArrayList Methods

ArrayList provides several built-in methods to manage its elements.

### A. add()

The `add()` method inserts an element into the ArrayList.

Syntax:

    arrayListName.add(element);

Example:

    ArrayList<String> fruits = new ArrayList<>();

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");

Output:

    [Apple, Banana, Mango]

We can also insert an element at a specific index.

    fruits.add(1, "Orange");

Output:

    [Apple, Orange, Banana, Mango]

### B. remove()

The `remove()` method removes an element from the ArrayList.

Syntax:

    arrayListName.remove(index);

Example:

    ArrayList<String> fruits = new ArrayList<>();

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");

    fruits.remove(1);

Output:

    [Apple, Mango]

Here, the element at index 1 (Banana) is removed.

We can also remove an element by its value:

    fruits.remove("Apple");

**Important:** When using an ArrayList of Integer, `remove(1)` removes the element at index 1. To remove the integer value 1, use `remove(Integer.valueOf(1))`.

### C. get()

The `get()` method retrieves an element from a specific index.

Syntax:

    arrayListName.get(index);

Example:

    ArrayList<String> fruits = new ArrayList<>();

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");

    System.out.println(fruits.get(0));

Output:

    Apple

### D. size()

The `size()` method returns the total number of elements present in an ArrayList.

Syntax:

    arrayListName.size();

Example:

    ArrayList<String> fruits = new ArrayList<>();

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");

    System.out.println(fruits.size());

Output:

    3

**Important:** `size()` is a method, so we must use parentheses.

### E. addAll()

The `addAll()` method adds all elements from another collection into the existing ArrayList.

Syntax:

    arrayListName.addAll(anotherArrayList);

Example:

    ArrayList<String> fruits = new ArrayList<>();
    ArrayList<String> moreFruits = new ArrayList<>();

    fruits.add("Apple");
    fruits.add("Banana");

    moreFruits.add("Mango");
    moreFruits.add("Orange");

    fruits.addAll(moreFruits);

    System.out.println(fruits);

Output:

    [Apple, Banana, Mango, Orange]

---

## 5. Arrays vs ArrayList

Both arrays and ArrayLists are used to store multiple values, but they have some important differences.

| Feature | Array | ArrayList |
|---|---|---|
| Size | Fixed | Dynamic (Resizable) |
| Syntax | `int[] a = new int[5];` | `ArrayList<Integer> a = new ArrayList<>();` |
| Data Types | Primitives and Objects | Objects only |
| Access Element | `a[i]` | `a.get(i)` |
| Modify Element | `a[i] = value` | `a.set(i, value)` |
| Get Size | `a.length` | `a.size()` |
| Add Element | Not directly supported | `add()` |
| Remove Element | Not directly supported | `remove()` |
| Import | Not required | Required |
| Performance | Generally faster | Has additional overhead |

### Important Difference: Primitive and Wrapper Classes

Arrays can directly store primitive data types.

    int[] numbers = {10, 20, 30};

ArrayLists store objects, so we use wrapper classes instead of primitive types.

Examples:

| Primitive Type | Wrapper Class |
|---|---|
| `int` | `Integer` |
| `double` | `Double` |
| `float` | `Float` |
| `char` | `Character` |
| `boolean` | `Boolean` |
| `long` | `Long` |

Example:

    ArrayList<Integer> numbers = new ArrayList<>();

    numbers.add(10);
    numbers.add(20);
    numbers.add(30);

Java automatically converts primitive values into their corresponding wrapper objects when needed. This process is called **Autoboxing**.

---

## 6. When to Use Array and ArrayList?

### When to Use an Array

Use an array when:
- The number of elements is known beforehand.
- You need to work directly with primitive data types.
- You need a fixed-size collection.
- You are working with multidimensional data.

### When to Use an ArrayList

Use an ArrayList when:
- The number of elements is not known beforehand.
- You need to add or remove elements frequently.
- You want built-in methods to manage elements.
- You need a resizable collection.

---

## 7. Important Points to Remember

1. ArrayList is a resizable array in Java.
2. It belongs to the `java.util` package.
3. We must import it using `import java.util.ArrayList;`.
4. ArrayList stores objects, not primitive data types directly.
5. Wrapper classes such as `Integer` and `Double` are used for primitive values.
6. `add()` inserts an element.
7. `remove()` removes an element.
8. `get()` retrieves an element.
9. `size()` returns the total number of elements.
10. `addAll()` adds elements from another collection.
11. ArrayList indexing starts from 0.
12. ArrayList automatically adjusts its size when elements are added or removed.

---

## 8. Quick Revision

| Method / Property | Function | Example |
|---|---|---|
| `add()` | Adds an element | `fruits.add("Apple");` |
| `remove()` | Removes an element | `fruits.remove(0);` |
| `get()` | Retrieves an element | `fruits.get(0);` |
| `set()` | Replaces an element | `fruits.set(0, "Mango");` |
| `size()` | Returns total elements | `fruits.size();` |
| `addAll()` | Adds another collection | `fruits.addAll(moreFruits);` |

---

## Final Concept

An ArrayList is a flexible alternative to a normal array. It allows us to store multiple elements and dynamically add, remove, retrieve, and modify them using built-in methods.