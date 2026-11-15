import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // Practice Exercise - 1
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        calculateFactorial(n);


        // Practice Exercise - 2
        // System.out.print("Enter length: ");
        // int length = sc.nextInt();
        // System.out.print("Enter breadth: ");
        // int breadth = sc.nextInt();
        // int area = calculateArea(length, breadth);
        // System.out.println("Area of rectangle: " + area);


        // Practice Exercise - 3
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();
        // System.out.println(isPrime(num));


        // Practice Exercise - 4
        // System.out.print("Enter a number: ");
        // int number = sc.nextInt();
        // checkOddEven(number);


        // Practice Exercise - 5
        // System.out.print("Enter a number: ");
        // int tableNumber = sc.nextInt();
        // printTable(tableNumber);


        sc.close();
    }


    // Practice Exercise - 1
    public static void calculateFactorial(int n) {

        if (n < 0) {
            System.out.println("Invalid input");
        } else {

            int factorial = 1;
            int i = 1;

            while (i <= n) {
                factorial = factorial * i;
                i++;
            }

            System.out.println("Factorial: " + factorial);
        }
    }


    // Practice Exercise - 2
    public static int calculateArea(int length, int breadth) {

        int area = length * breadth;

        return area;
    }


    // Practice Exercise - 3 
    public static boolean isPrime(int N) {

        if (N <= 1) {
            return false;
        }

        for (int i = 2; i <= N / 2; i++) {

            if (N % i == 0) {
                return false;
            }
        }

        return true;
    }


    // Practice Exercise - 4 
    public static void checkOddEven(int number) {

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }


    // Practice Exercise - 5 
    public static void printTable(int number) {

        for (int i = 1; i <= 10; i++) {

            System.out.println(number + " x " + i + " = " + (number * i));

        }
    }

}