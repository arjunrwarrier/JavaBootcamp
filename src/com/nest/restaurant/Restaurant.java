package com.nest.restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        int total = 0, quantity, choice1, choice2, invoice;
        String customerName;
        Random random = new Random();

        HashMap<String,String> accounts = new HashMap<>();
        ArrayList<String> transaction =  new ArrayList<>();

        ArrayList<String> foodItem = new ArrayList<>(); //storing fooditems

        ArrayList<Integer> price = new ArrayList<>();      //storing price

        ArrayList<Integer> tquantity = new ArrayList<>();    //storing quantity

        Scanner scanner = new Scanner(System.in);

        FoodItems foodItems = new FoodItems(10, 15, 20, 50, 60);//getting the values
        FoodItems takeAwayFood = new FoodItems(12, 18, 25, 55, 65);//getting values






        while (true) {

            System.out.println("Select an option: ");
            System.out.println("1.Dine Inn            ");
            System.out.println("2.Take Away           ");
            System.out.println("3.Account Transaction");
            System.out.println("4. EXIT               ");
           // System.out.println(transaction);
            choice1 = scanner.nextInt();



            switch (choice1) {
                case 1:
                    System.out.println("Select an option Dine INN: ");
                    System.out.println("1.Tea              :10Rs");
                    System.out.println("2.Coffee           :15Rs");
                    System.out.println("3.LimeJuice        :20Rs");
                    System.out.println("4.Sandwich         :50Rs");
                    System.out.println("5.Burger           :60Rs");
                    System.out.println("6.*****GENERATE BILL****");
                    System.out.println("7. EXIT                 ");
                    choice2 = scanner.nextInt();
                    switch (choice2) {
                        case 1:
                            System.out.println("Quantity:  ");
                            quantity = scanner.nextInt();
                            tquantity.add(quantity);
                            price.add(10);
                            foodItem.add("Tea");
                            total += quantity * foodItems.getTea();
                            break;
                        case 2:
                            System.out.println("Quantity : ");
                            quantity = scanner.nextInt();
                            tquantity.add(quantity);
                            foodItem.add("Coffee");
                            price.add(15);
                            total += quantity * foodItems.getCoffee();
                            break;
                        case 3:
                            System.out.println("Quantity : ");
                            quantity = scanner.nextInt();
                            tquantity.add(quantity);
                            foodItem.add("Lime Juice");
                            price.add(20);
                            total += quantity * foodItems.getLimeJuice();
                            break;
                        case 4:
                            System.out.println("Quantity : ");
                            quantity = scanner.nextInt();
                            tquantity.add(quantity);
                            foodItem.add("Sandwich");
                            price.add(50);
                            total += quantity * foodItems.getSandwich();
                            break;
                        case 5:
                            System.out.println("Quantity : ");
                            quantity = scanner.nextInt();
                            tquantity.add(quantity);
                            foodItem.add("Burger");
                            price.add(60);
                            total += quantity * foodItems.getBuger();
                            break;
                        case 6:
                            System.out.println("Enter your name: ");
                            customerName = scanner.next();
                            for(int i=0;i<foodItem.size();i++){
                                System.out.println(foodItem.get(i)+" : "+price.get(i)+"Rs  x "+tquantity.get(i));
                            }
                            System.out.println("Total Bill : " + total);
                            invoice = random.nextInt(1000);
                            System.out.println("Bill InvoiceNumber: "+invoice);
                            foodItem.clear();
                            price.clear();
                            tquantity.clear();
                            accounts.put("Name",customerName);
                            accounts.put("Total", String.valueOf(total));
                            accounts.put("Mode","Take Away");
                            accounts.put("Invoice", String.valueOf(invoice));
                            transaction.add(String.valueOf(accounts));
                          //  accounts.clear();
                            total = 0;
                            break;
                        case 7:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Enter valid option");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Select an option Take Away: ");
                    System.out.println("1.Tea              :12Rs");
                    System.out.println("2.Coffee           :18Rs");
                    System.out.println("3.LimeJuice        :25Rs");
                    System.out.println("4.Sandwich         :55Rs");
                    System.out.println("5.Burger           :65Rs");
                    System.out.println("6.*****GENERATE BILL****");
                    System.out.println("7. EXIT                 ");
                    choice2 = scanner.nextInt();
                    switch (choice2) {
                        case 1:
                            System.out.println("Quantity:  ");
                            quantity = scanner.nextInt();
                            tquantity.add(quantity);
                            foodItem.add("Tea");
                            price.add(takeAwayFood.getTea());
                            total += quantity * takeAwayFood.getTea();
                            break;
                        case 2:
                            System.out.println("Quantity : ");
                            quantity = scanner.nextInt();
                            tquantity.add(quantity);
                            foodItem.add("Coffee");
                            price.add(takeAwayFood.getCoffee());
                            total += quantity * takeAwayFood.getCoffee();
                            break;
                        case 3:
                            System.out.println("Quantity : ");
                            quantity = scanner.nextInt();
                            tquantity.add(quantity);
                            foodItem.add("Lime Juice");
                            price.add(takeAwayFood.getLimeJuice());
                            total += quantity * takeAwayFood.getLimeJuice();
                            break;
                        case 4:
                            System.out.println("Quantity : ");
                            quantity = scanner.nextInt();
                            tquantity.add(quantity);
                            foodItem.add("Sandwich");
                            price.add(takeAwayFood.getSandwich());
                            total += quantity * takeAwayFood.getSandwich();
                            break;
                        case 5:
                            System.out.println("Quantity : ");
                            quantity = scanner.nextInt();
                            tquantity.add(quantity);
                            foodItem.add("Burger");
                            price.add(takeAwayFood.getBuger());
                            total += quantity * takeAwayFood.getBuger();
                            break;
                        case 6:
                            System.out.println("Enter your name: ");
                            customerName = scanner.next();
                            for(int i=0;i<foodItem.size();i++){
                                System.out.println(foodItem.get(i)+" : "+price.get(i)+"Rs  x "+tquantity.get(i));
                            }
                            System.out.println("Total Bill : " + total);
                            invoice = random.nextInt(1000);
                            System.out.println("Bill InvoiceNumber: "+invoice);
                            foodItem.clear();
                            price.clear();
                            tquantity.clear();
                            accounts.put("Name",customerName);
                            accounts.put("Total", String.valueOf(total));
                            accounts.put("Mode","Take Away");
                            accounts.put("Invoice", String.valueOf(invoice));
                            transaction.add(String.valueOf(accounts));
                            //accounts.clear();
                            total = 0;
                            break;
                        case 7:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Enter a valid option");
                            break;

                        }
                        break;
                case 3:
                    System.out.println(transaction);
                    break;

                case 4: System.exit(0);
                        break;
                default:
                    System.out.println("Enter a valid option");
                    break;
            }

        }
    }
}