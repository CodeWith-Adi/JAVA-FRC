import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // Practice Exercise - 1
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("Index: " + findIndex(str, ch));


        // Practice Exercise - 2
        // System.out.print("Enter your full name: ");
        // String fullName = sc.nextLine();
        //
        // System.out.println("Uppercase: " + fullName.toUpperCase());
        //
        // int firstSpace = fullName.indexOf(' ');
        // int lastSpace = fullName.lastIndexOf(' ');
        //
        // System.out.println("First name initial: " + fullName.charAt(0));
        // System.out.println("Last name initial: " + fullName.charAt(lastSpace + 1));


        // Practice Exercise - 3
        // System.out.print("Enter a sentence: ");
        // String sentence = sc.nextLine();
        // System.out.print("Enter a word to search: ");
        // String word = sc.nextLine();
        //
        // if (sentence.indexOf(word) != -1) {
        //     System.out.println("Found");
        // } else {
        //     System.out.println("Not Found");
        // }


        // Practice Exercise - 4
        // System.out.print("Enter a string: ");
        // String text = sc.nextLine();
        // System.out.println(convertString(text));


        // Practice Exercise - 5
        // System.out.print("Enter a string: ");
        // String input = sc.nextLine();
        //
        // System.out.println("Last index of e: " + input.lastIndexOf('e'));
        // System.out.println("Starts with The: " + input.startsWith("The"));
        // System.out.println("Ends with end.: " + input.endsWith("end."));


        sc.close();
    }


    // Practice Exercise - 1
    public static int findIndex(String str, char ch) {

        return str.indexOf(ch);

    }


    // Practice Exercise - 4
    public static String convertString(String str) {

        int mid = str.length() / 2;

        String firstHalf = str.substring(0, mid).toUpperCase();
        String secondHalf = str.substring(mid).toLowerCase();

        return firstHalf + secondHalf;

    }

}