public class main {

    public static void main(String[] args) {

        // Practice Exercise - 1
        /*
        String[] names = {"Riya", "Aryan", "Mira"};

        names[1] = "Aditya";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        */


        // Practice Exercise - 2
        /*
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum: " + sum);
        */


        // Practice Exercise - 3
        /*
        int[] numbers = {16, 25, 36, 49, 64};

        double squareRoot = Math.sqrt(numbers[1]);

        System.out.println("Square Root: " + squareRoot);
        */


        // Practice Exercise - 4
        /*
        String[] names = {"Aditya", "Kumar", "Sharma"};

        String result = names[0].concat(names[names.length - 1]);

        System.out.println("Concatenated String: " + result);
        */


        // Practice Exercise - 5
        /*
        int[] numbers = {10, 25, 15, 40, 30};

        int result = findMaximum(numbers, 1, 3);

        System.out.println("Maximum Value: " + result);
        */

    }

    // Practice Exercise - 5
    public static int findMaximum(int[] numbers, int index1, int index2) {

        return Math.max(numbers[index1], numbers[index2]);

    }

}