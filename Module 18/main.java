import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // Practice Exercise - 1

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();

        double maximum = Math.max(num1, Math.max(num2, num3));
        double minimum = Math.min(num1, Math.min(num2, num3));

        System.out.println("Maximum Number: " + maximum);
        System.out.println("Minimum Number: " + minimum);


        // Practice Exercise - 2

        // System.out.println("\nArea Calculator");
        // System.out.println("1. Circle");
        // System.out.println("2. Square");
        // System.out.println("3. Rectangle");
        //
        // System.out.print("Enter your choice: ");
        // int choice = sc.nextInt();
        //
        // switch (choice) {
        //
        //     case 1:
        //         System.out.print("Enter radius: ");
        //         double radius = sc.nextDouble();
        //
        //         double circleArea = Math.PI * Math.pow(radius, 2);
        //
        //         System.out.println("Area of Circle: " + circleArea);
        //         break;
        //
        //     case 2:
        //         System.out.print("Enter side: ");
        //         double side = sc.nextDouble();
        //
        //         double squareArea = Math.pow(side, 2);
        //
        //         System.out.println("Area of Square: " + squareArea);
        //         break;
        //
        //     case 3:
        //         System.out.print("Enter length: ");
        //         double length = sc.nextDouble();
        //
        //         System.out.print("Enter breadth: ");
        //         double breadth = sc.nextDouble();
        //
        //         double rectangleArea = length * breadth;
        //
        //         System.out.println("Area of Rectangle: " + rectangleArea);
        //         break;
        //
        //     default:
        //         System.out.println("Invalid choice!");
        // }


        // Practice Exercise - 3

        // int dice = (int) (Math.random() * 6) + 1;
        //
        // System.out.println("Dice Rolled: " + dice);


        // Practice Exercise - 4

        // System.out.print("Enter base: ");
        // double base = sc.nextDouble();
        
        // System.out.print("Enter height: ");
        // double height = sc.nextDouble();
        
        // double hypotenuse = calculateHypotenuse(base, height);
        
        // System.out.println("Hypotenuse: " + hypotenuse);


        // Practice Exercise - 5

        // System.out.print("Enter a decimal number: ");
        // double number = sc.nextDouble();
        //
        // System.out.println("Rounded Value: " + Math.round(number));
        //
        // System.out.println("Square Root: " + Math.sqrt(number));
        //
        // System.out.println("Absolute Value: " + Math.abs(number));


        sc.close();
    }


    // Practice Exercise - 4
    public static double calculateHypotenuse(double base, double height) {

        double result = Math.sqrt(
                Math.pow(base, 2) + Math.pow(height, 2)
        );

        return result;

    }

}