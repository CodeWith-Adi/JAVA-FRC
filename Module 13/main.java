public class main {

    public static void main(String[] args) {

        // Practice Exercise - 1
        // displayInfo();


        // Practice Exercise - 2
        printHeader();
        printBody();
        printFooter();


        // Practice Exercise - 3
        // printNumbers();


        // Practice Exercise - 4
        // calculateSum();

    }

    // Practice Exercise - 1
    public static void displayInfo() {
        System.out.println("Name: Aditya");
        System.out.println("Age: 15");
        System.out.println("Grade: 10th");
        System.out.println("Favourite Subject: Computer Science");
    }


    // Practice Exercise - 2
    public static void printHeader() {
        System.out.println("========== MY WEBSITE ==========");
    }

    public static void printBody() {
        System.out.println("Welcome to my webpage!");
        System.out.println("This is the main content section.");
    }

    public static void printFooter() {
        System.out.println("========== THANK YOU ==========");
    }


    // Practice Exercise - 3
    public static void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }


    // Practice Exercise - 4
    public static void calculateSum() {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }

}