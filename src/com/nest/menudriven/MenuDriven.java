package com.nest.menudriven;

import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        int choice;

        while (true)
        {
            System.out.println("Select an option: ");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Delete Student");
            System.out.println("4. View all Student");
            System.out.println("5.Exit");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            switch (choice){

                case 1:
                    System.out.println("Add student selected");
                    break;
                case 2:
                    System.out.println("Search student selected");
                    break;
                case 3:
                    System.out.println("Delete student selected");
                    break;
                case 4:
                    System.out.println("View all students selected");
                    break;
                case 5:
                    System.exit(0);



            }

        }


    }
}
