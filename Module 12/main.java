import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // Practice Exercise - 1
        // Scanner sc = new Scanner(System.in);

        // String correctPassword = "java123";
        // int attempts = 0;

        // while (attempts < 3) {
        //     System.out.print("Enter password: ");
        //     String password = sc.nextLine();

        //     if (password.equals(correctPassword)) {
        //         System.out.println("Login Successful!");
        //         break;
        //     } else {
        //         attempts++;
        //         System.out.println("Incorrect Password!");

        //         if (attempts == 3) {
        //             System.out.println("Account Locked!");
        //         }
        //     }
        // }

        // sc.close();


        // Practice Exercise - 2

        // for (int i = 1; i <= 50; i++) {

        //     if (i % 5 == 0) {
        //         continue;
        //     }

        //     if (i % 2 != 0) {
        //         System.out.println(i);
        //     }
        // }


        // Practice Exercise - 3

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i);
        }

    }
}