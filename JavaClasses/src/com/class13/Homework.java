package com.class13;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
        String username, password, password1;
        do {
            System.out.println("Please Enter your Username: ");
            username = scan.nextLine();
            if (username.isEmpty()) {
                System.out.println("Username can not be empty !! Try again");
            }
        } while (username.isEmpty());
        do {
            System.out.println("Please enter your Password: ");
            password = scan.nextLine();
            if (password.length() < 8) {
                System.out.println("Password is too short !!");
            } else if (password.contains(username)) {
                System.out.println("Password can not contain username !!");
            }
        } while ((password.length() < 8) || password.contains(username));
        do {
            System.out.println("Please confirm your password");
            password1 = scan.nextLine();
            if (password1.equals(password)) {
                System.out.println("Your username and password have ben created :)");
            } else {
                System.out.println("Your passwords do not match!! Try again.");
            }
        } while (!password1.equals(password));


			
	}

}
