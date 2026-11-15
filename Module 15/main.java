import java.util.Scanner;

// Main Class
public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // Practice Exercise - 1
        System.out.print("Enter count: ");
        int count = sc.nextInt();
        main obj1 = new main();
        obj1.printFibonacci(count);


        // Practice Exercise - 2
        // System.out.println("Addition: " + MathHelper.add(10, 5));
        // System.out.println("Subtraction: " + MathHelper.subtract(10, 5));
        // System.out.println("Multiplication: " + MathHelper.multiply(10, 5));
        // System.out.println("Division: " + MathHelper.divide(10, 5));


        // Practice Exercise - 3
        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();
        // main obj3 = new main();
        // System.out.println("Sum of digits: " + obj3.sumOfDigits(n));


        // Practice Exercise - 4
        // int choice;
        //
        // do {
        //     System.out.println("\n===== MENU =====");
        //     System.out.println("1. Print Table");
        //     System.out.println("2. Check Prime");
        //     System.out.println("3. Exit");
        //     System.out.print("Enter your choice: ");
        //     choice = sc.nextInt();
        //
        //     switch (choice) {
        //
        //         case 1:
        //             System.out.print("Enter number: ");
        //             int number = sc.nextInt();
        //             printTable(number);
        //             break;
        //
        //         case 2:
        //             System.out.print("Enter number: ");
        //             int num = sc.nextInt();
        //             main obj4 = new main();
        //
        //             if (obj4.isPrime(num)) {
        //                 System.out.println("Prime number");
        //             } else {
        //                 System.out.println("Not a prime number");
        //             }
        //             break;
        //
        //         case 3:
        //             System.out.println("Exiting program...");
        //             break;
        //
        //         default:
        //             System.out.println("Invalid choice!");
        //     }
        //
        // } while (choice != 3);


        // Practice Exercise - 5
        // System.out.print("Enter base: ");
        // int a = sc.nextInt();
        // System.out.print("Enter exponent: ");
        // int n = sc.nextInt();
        // main obj5 = new main();
        // System.out.println("Result: " + obj5.power(a, n));


        sc.close();
    }


    // Practice Exercise - 1
    public void printFibonacci(int count) {

        int first = 0;
        int second = 1;

        for (int i = 1; i <= count; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;

        }

        System.out.println();
    }


    // Practice Exercise - 3
    public int sumOfDigits(int n) {

        n = Math.abs(n);
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;

        }

        return sum;
    }


    // Practice Exercise - 4
    public static void printTable(int number) {

        for (int i = 1; i <= 10; i++) {

            System.out.println(number + " x " + i + " = " + (number * i));

        }
    }


    // Practice Exercise - 4
    public boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) {
                return false;
            }

        }

        return true;
    }


    // Practice Exercise - 5
    public int power(int a, int n) {

        int result = 1;

        for (int i = 1; i <= n; i++) {

            result = result * a;

        }

        return result;
    }

}


// Practice Exercise - 2
class MathHelper {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {

        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }

        return (double) a / b;
    }

}