

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class MainApp {
        public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
    Login login = new Login();

        System.out.println("=== Welcome to Chat App ===");

        // register
        System.out.println("\n--- Registration ---");

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        System.out.print("Enter phone number: ");
        String phone = input.nextLine();

        String registerMessage = login.registerUser(username, password, phone);
        System.out.println(registerMessage);

        // regestration fail = stop
        if (!registerMessage.equals("User registered successfully.")) {
            System.out.println("Please restart and try again.");
            return;
        }

        //login
        System.out.println("\n--- Login ---");

        System.out.print("Enter username: ");
        String loginUser = input.nextLine();

        System.out.print("Enter password: ");
        String loginPass = input.nextLine();

        boolean loginSuccess = login.loginUser(loginUser, loginPass);

        System.out.println(login.returnLoginStatus(loginSuccess));

        //done
        System.out.println("\nThank you for using Chat App!");
        input.close();
    }

}
