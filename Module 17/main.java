import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // Practice Exercise - 1

        // System.out.print("Enter first name: ");
        // String firstName = sc.nextLine();
        // System.out.print("Enter last name: ");
        // String lastName = sc.nextLine();
        //
        // String fullName = firstName.concat(" ").concat(lastName);
        // System.out.println("Full Name: " + fullName);
        //
        // System.out.print("Enter a string: ");
        // String str = sc.nextLine();
        //
        // System.out.println("After replacement: " + str.replace('a', 'x'));
        //
        // System.out.print("Enter a string with unwanted spaces: ");
        // String text = sc.nextLine();
        //
        // System.out.println("Cleaned String: " + text.trim());


        // Practice Exercise - 2

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        printCharacters(input);


        // Practice Exercise - 3

        // System.out.print("Enter a string: ");
        // String word = sc.nextLine();
        //
        // if (isPalindrome(word)) {
        //     System.out.println("Palindrome");
        // } else {
        //     System.out.println("Not a palindrome");
        // }


        // Practice Exercise - 4

        // String savedUsername = "Student123";
        // String savedPassword = "ABcdef";
        //
        // System.out.print("Enter username: ");
        // String username = sc.nextLine();
        //
        // System.out.print("Enter password: ");
        // String password = sc.nextLine();
        //
        // if (username.equalsIgnoreCase(savedUsername)
        //         && password.equals(savedPassword)) {
        //     System.out.println("Login successful!");
        // } else {
        //     System.out.println("Invalid username or password!");
        // }


        // Practice Exercise - 5

        // System.out.print("Enter first student name: ");
        // String name1 = sc.nextLine();
        //
        // System.out.print("Enter second student name: ");
        // String name2 = sc.nextLine();
        //
        // System.out.print("Enter third student name: ");
        // String name3 = sc.nextLine();
        //
        // String temp;
        //
        // if (name1.compareToIgnoreCase(name2) > 0) {
        //     temp = name1;
        //     name1 = name2;
        //     name2 = temp;
        // }
        //
        // if (name2.compareToIgnoreCase(name3) > 0) {
        //     temp = name2;
        //     name2 = name3;
        //     name3 = temp;
        // }
        //
        // if (name1.compareToIgnoreCase(name2) > 0) {
        //     temp = name1;
        //     name1 = name2;
        //     name2 = temp;
        // }
        //
        // System.out.println("\nAlphabetical Order:");
        // System.out.println(name1);
        // System.out.println(name2);
        // System.out.println(name3);
        //
        // // Example of compareTo() and compareToIgnoreCase()
        // System.out.println("\nCase-sensitive comparison: "
        //         + name1.compareTo(name2));
        //
        // System.out.println("Case-insensitive comparison: "
        //         + name1.compareToIgnoreCase(name2));


        sc.close();
    }


    // Practice Exercise - 2
    public static void printCharacters(String str) {

        for (int i = 0; i < str.length(); i++) {

            System.out.println(str.charAt(i));

        }

    }


    // Practice Exercise - 3
    public static boolean isPalindrome(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reversed = reversed + str.charAt(i);

        }

        return str.equalsIgnoreCase(reversed);

    }

}
