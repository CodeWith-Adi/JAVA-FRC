import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // Practice Exercise - 1
        /*
        int[] numbers = {10, 20, 30, 40, 50};

        int i = 0;

        while (i < numbers.length) {

            numbers[i] = numbers[i] * 2;

            i++;

        }

        i = 0;

        while (i < numbers.length) {

            System.out.println(numbers[i]);

            i++;

        }
        */


        // Practice Exercise - 2
        /*
        int[] numbers = {45, 12, 78, 5, 90, 23};

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }

            if (numbers[i] > largest) {
                largest = numbers[i];
            }

        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
        */


        // Practice Exercise - 3
        /*
        int[] numbers = new int[10];

        int even = 0;
        int odd = 0;

        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }

        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);
        */


        // Practice Exercise - 4
        /*
        int[] numbers = {10, 20, 30, 40, 50, 60};

        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {

            System.out.println(numbers[i] + numbers[j]);

            i++;
            j--;

        }

        if (i == j) {
            System.out.println(numbers[i] * 2);
        }
        */


        // Practice Exercise - 5
        /*
        int[] numbers = new int[10];

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = (int)(Math.random() * 100) + 1;

            System.out.println(numbers[i]);

            sum = sum + numbers[i];

        }

        System.out.println("Sum: " + sum);
        */

        sc.close();

    }

}