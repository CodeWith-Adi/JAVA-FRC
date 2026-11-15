import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // Practice Exercise - 1
        // Accept 10 integer values from the user and find the sum, median, mean, and mode
        /*
        calculateStats();
        */


        // Practice Exercise - 2
        // Accept 10 integer values from the user and reverse the ArrayList
        /*
        reverseArrayList();
        */


        // Practice Exercise - 3
        // Search for a string in an ArrayList and replace it with another string if present
        /*
        searchAndReplaceString();
        */


        // Practice Exercise - 4
        // Capitalise all items in an ArrayList of strings
        /*
        capitaliseStrings();
        */


        // Practice Exercise - 5
        // Create two lists of integers (same length) and print out the products of corresponding list items
        /*
        multiplyCorrespondingElements();
        */

    }


    // Method for Practice Exercise - 1
    public static void calculateStats() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers.add(sc.nextInt());
        }

        // Sum and Mean
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double mean = sum / numbers.size();

        // Median (requires sorting)
        Collections.sort(numbers);
        double median;
        int mid = numbers.size() / 2;
        if (numbers.size() % 2 == 0) {
            median = (numbers.get(mid - 1) + numbers.get(mid)) / 2.0;
        } else {
            median = numbers.get(mid);
        }

        // Mode
        int mode = numbers.get(0);
        int maxCount = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int count = 0;
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(j).equals(numbers.get(i))) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = numbers.get(i);
            }
        }

        System.out.println("Sorted List: " + numbers);
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
    }


    // Method for Practice Exercise - 2
    public static void reverseArrayList() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.println("Original List: " + numbers);

        // Reversing using two pointers / swapping
        int left = 0;
        int right = numbers.size() - 1;
        while (left < right) {
            int temp = numbers.get(left);
            numbers.set(left, numbers.get(right));
            numbers.set(right, temp);
            left++;
            right--;
        }

        System.out.println("Reversed List: " + numbers);
    }


    // Method for Practice Exercise - 3
    public static void searchAndReplaceString() {
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Mango");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to search: ");
        String target = sc.nextLine();

        if (words.contains(target)) {
            System.out.print("Enter replacement string: ");
            String replacement = sc.nextLine();
            int index = words.indexOf(target);
            words.set(index, replacement);
            System.out.println("Updated List: " + words);
        } else {
            System.out.println("String not found in the ArrayList.");
        }
    }


    // Method for Practice Exercise - 4
    public static void capitaliseStrings() {
        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("world");
        words.add("java");

        System.out.println("Original List: " + words);

        for (int i = 0; i < words.size(); i++) {
            String current = words.get(i);
            if (!current.isEmpty()) {
                String capitalised = current.substring(0, 1).toUpperCase() + current.substring(1);
                words.set(i, capitalised);
            }
        }

        System.out.println("Capitalised List: " + words);
    }


    // Method for Practice Exercise - 5
    public static void multiplyCorrespondingElements() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(10);
        list2.add(20);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.print("Products: ");

        for (int i = 0; i < list1.size(); i++) {
            int product = list1.get(i) * list2.get(i);
            System.out.print(product + " ");
        }
        System.out.println();
    }
}