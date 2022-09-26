package com.nest.restaurant;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        int total =0, quantity, choice;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Select an option: ");
            System.out.println("1.Tea              :10Rs");
            System.out.println("2.Coffee           :15Rs");
            System.out.println("3.LimeJuice        :20Rs");
            System.out.println("4.Sandwich         :50Rs");
            System.out.println("5.Burger           :60Rs");
            System.out.println("6.*****GENERATE BILL****");
            System.out.println("7. EXIT                 ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Quantity : ");
                    quantity = scanner.nextInt();
                    total += quantity * 10;
                    break;
                case 2:
                    System.out.println("Quantity : ");
                    quantity = scanner.nextInt();
                    total += quantity * 15;
                    break;
                case 3:
                    System.out.println("Quantity : ");
                    quantity = scanner.nextInt();
                    total += quantity * 20;
                    break;
                case 4:
                    System.out.println("Quantity : ");
                    quantity = scanner.nextInt();
                    total += quantity * 50;
                    break;
                case 5:
                    System.out.println("Quantity : ");
                    quantity = scanner.nextInt();
                    total += quantity * 60;
                    break;
                case 6:
                    System.out.println("The Total Bill is : "+total);
                    break;
                case 7:
                    System.exit(0);




            }

        }

    }
}
