import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // Practice Exercise - 1
        // Add 3 user-entered names, remove one by index, and print the final list

        /*
        addAndRemoveNames();
        */


        // Practice Exercise - 2
        // Remove the element at index 2 and print the list and its size

        /*
        removeNumber();
        */


        // Practice Exercise - 3
        // Convert an Array into an ArrayList

        /*
        convertArrayToArrayList();
        */

    }


    // Method for Practice Exercise - 1
    public static void addAndRemoveNames() {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter name " + i + ": ");
            names.add(sc.nextLine());
        }

        System.out.println("Original List: " + names);

        System.out.print("Enter index to remove: ");
        int index = sc.nextInt();

        if (index >= 0 && index < names.size()) {
            names.remove(index);
            System.out.println("Final List: " + names);
        } else {
            System.out.println("Invalid index!");
        }
    }


    // Method for Practice Exercise - 2
    public static void removeNumber() {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        numbers.remove(2);

        System.out.println("Updated List: " + numbers);
        System.out.println("Size: " + numbers.size());
    }


    // Method for Practice Exercise - 3
    public static void convertArrayToArrayList() {

        String[] names = {"A", "B", "C"};

        ArrayList<String> nameList = new ArrayList<>();

        for (String name : names) {
            nameList.add(name);
        }

        System.out.println("ArrayList: " + nameList);
    }
}