# Module 23: Lists & Dynamic Structures (ArrayList) - Part 2

## 1. Advanced ArrayList Operations

In the previous module, we learned the basic methods of ArrayList, such as `add()`, `remove()`, `get()`, `size()`, and `addAll()`.

In this module, we will explore advanced ArrayList operations that allow us to insert, update, search, and manage elements more efficiently.

### A. Adding an Element at a Specific Index

The `add(index, element)` method inserts an element at a particular position in the ArrayList.

Syntax:

    arrayListName.add(index, element);

Example:

    ArrayList<String> fruits = new ArrayList<>();

    fruits.add("Apple");
    fruits.add("Mango");

    fruits.add(1, "Banana");

    System.out.println(fruits);

Output:

    [Apple, Banana, Mango]

Explanation:

- Initially, the list contains Apple and Mango.
- `add(1, "Banana")` inserts Banana at index 1.
- Existing elements from that position onwards shift one position to the right.

### B. Updating an Element

The `set()` method replaces an existing element at a particular index.

Syntax:

    arrayListName.set(index, newElement);

Example:

    ArrayList<String> fruits = new ArrayList<>();

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");

    fruits.set(1, "Orange");

    System.out.println(fruits);

Output:

    [Apple, Orange, Mango]

Explanation:

The element at index 1 (Banana) is replaced with Orange.

**Difference between `add()` and `set()`:**
- `add(index, element)` inserts a new element and shifts existing elements.
- `set(index, element)` replaces an existing element without changing the list size.

### C. Removing an Element by Value

The `remove(object)` method removes the first occurrence of a specified object from the ArrayList.

Syntax:

    arrayListName.remove(object);

Example:

    ArrayList<String> fruits = new ArrayList<>();

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");

    fruits.remove("Banana");

    System.out.println(fruits);

Output:

    [Apple, Mango]

Explanation:

The element Banana is removed by specifying its value instead of its index.

**Important:** For an ArrayList of Integer, `remove(2)` removes the element at index 2, not the integer value 2. To remove the value 2, use:

    numbers.remove(Integer.valueOf(2));

### D. Searching Using contains()

The `contains()` method checks whether a particular element exists in the ArrayList.

It returns:
- `true` if the element is present.
- `false` if the element is not present.

Syntax:

    arrayListName.contains(element);

Example:

    ArrayList<String> fruits = new ArrayList<>();

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");

    System.out.println(fruits.contains("Banana"));
    System.out.println(fruits.contains("Orange"));

Output:

    true
    false

### E. Searching Using indexOf()

The `indexOf()` method returns the index of the first occurrence of a specified element.

If the element is not found, it returns `-1`.

Syntax:

    arrayListName.indexOf(element);

Example:

    ArrayList<String> fruits = new ArrayList<>();

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");
    fruits.add("Banana");

    System.out.println(fruits.indexOf("Banana"));
    System.out.println(fruits.indexOf("Orange"));

Output:

    1
    -1

Explanation:

- Banana first appears at index 1.
- Orange does not exist in the list, so the result is -1.

### F. Clearing an ArrayList

The `clear()` method removes all elements from an ArrayList.

Syntax:

    arrayListName.clear();

Example:

    ArrayList<String> fruits = new ArrayList<>();

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");

    fruits.clear();

    System.out.println(fruits);

Output:

    []

Explanation:

The ArrayList becomes empty, but the ArrayList object still exists.

### G. Checking Whether an ArrayList Is Empty

The `isEmpty()` method checks whether an ArrayList contains any elements.

It returns:
- `true` if the list is empty.
- `false` if the list contains one or more elements.

Syntax:

    arrayListName.isEmpty();

Example:

    ArrayList<String> fruits = new ArrayList<>();

    System.out.println(fruits.isEmpty());

    fruits.add("Apple");

    System.out.println(fruits.isEmpty());

Output:

    true
    false

### H. Removing Multiple Elements Using removeAll()

The `removeAll()` method removes all elements from the current ArrayList that are also present in another specified collection.

Syntax:

    arrayListName.removeAll(anotherCollection);

Example:

    ArrayList<Integer> numbers = new ArrayList<>();
    ArrayList<Integer> removeNumbers = new ArrayList<>();

    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);

    removeNumbers.add(20);
    removeNumbers.add(40);

    numbers.removeAll(removeNumbers);

    System.out.println(numbers);

Output:

    [10, 30]

Explanation:

- The second ArrayList contains 20 and 40.
- `removeAll()` removes those matching values from the first ArrayList.
- The remaining elements are 10 and 30.

---

## 2. Iterating Through an ArrayList

**Iteration** means visiting or accessing each element of a collection one by one.

We can iterate through an ArrayList using different types of loops.

### A. Using a For Loop

A traditional `for` loop uses:
- An index variable.
- The `size()` method to determine the number of elements.
- The `get()` method to access each element.

Example:

    ArrayList<String> fruits = new ArrayList<>();

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");

    for (int i = 0; i < fruits.size(); i++) {
        System.out.println(fruits.get(i));
    }

Output:

    Apple
    Banana
    Mango

Explanation:

1. The loop starts with `i = 0`.
2. `fruits.size()` returns the total number of elements.
3. `fruits.get(i)` retrieves the element at the current index.
4. The loop continues until every element has been accessed.

### B. Using a For-Each Loop (Enhanced For Loop)

A for-each loop allows us to access every element directly without managing an index.

Syntax:

    for (datatype variableName : arrayListName) {
        // Statements
    }

Example:

    ArrayList<String> fruits = new ArrayList<>();

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");

    for (String fruit : fruits) {
        System.out.println(fruit);
    }

Output:

    Apple
    Banana
    Mango

Explanation:

- `String` is the datatype of the elements.
- `fruit` is a temporary variable that holds the current element.
- `fruits` is the ArrayList being traversed.
- The loop automatically visits every element.

### C. Difference Between For Loop and For-Each Loop

| Feature | For Loop | For-Each Loop |
|---|---|---|
| Index Access | Available | Not directly available |
| Element Access | Using `get(i)` | Directly through variable |
| Syntax | Comparatively longer | Simpler |
| Modification by Index | Possible using `set()` | Not directly possible |
| Best Use | When index is required | When only reading elements |

**Important:** Changing the temporary variable in a for-each loop does not replace the original element in the ArrayList. Use `set()` when you need to update elements.

---

## 3. Important Points to Remember

1. `add(index, element)` inserts an element at a specific position.
2. `set(index, element)` replaces an existing element.
3. `remove(object)` removes an element by its value.
4. `contains()` checks whether an element exists.
5. `indexOf()` returns the first matching element's index.
6. `indexOf()` returns `-1` if an element is not found.
7. `clear()` removes all elements from the ArrayList.
8. `isEmpty()` checks whether the ArrayList is empty.
9. `removeAll()` removes matching elements from another collection.
10. `size()` returns the total number of elements.
11. `get()` retrieves an element using its index.
12. A for-each loop is useful when we only need to access elements one by one.

---

## 4. Quick Revision

| Method | Function |
|---|---|
| `add(index, element)` | Inserts an element at a specific index |
| `set(index, element)` | Updates an existing element |
| `remove(object)` | Removes an element by value |
| `contains(element)` | Checks whether an element exists |
| `indexOf(element)` | Returns the first occurrence's index |
| `clear()` | Removes all elements |
| `isEmpty()` | Checks whether the list is empty |
| `removeAll(collection)` | Removes matching elements |
| `size()` | Returns the total number of elements |
| `get(index)` | Retrieves an element |

---

## Final Concept

ArrayList provides several built-in methods for inserting, updating, searching, and deleting elements. We can also iterate through an ArrayList using traditional for loops or enhanced for-each loops.