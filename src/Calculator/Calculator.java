package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int choice,num1,num2,answer;
        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("Select an option:");
            System.out.println("1. Add 2 numbers:");
            System.out.println("2. Subtract two numbers:");
            System.out.println("3. Multiply two numbers:");
            System.out.println("4. Divide two numbers:");
            System.out.println("5. Exit:");


            choice = scanner.nextInt();


            switch (choice){

                case 1:
                    System.out.println("Enter two numbers: ");
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    answer = num1+num2;
                    System.out.println("The answer : "+answer);
                    break;
                case 2:
                    System.out.println("Enter two numbers: ");
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    answer = num1 - num2;
                    System.out.println("The answer : "+answer);
                    break;
                case 3:
                    System.out.println("Enter two numbers: ");
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    answer = num1 * num2;
                    System.out.println("The answer : "+answer);
                    break;
                case 4:
                    System.out.println("Enter two numbers: ");
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    try {
                        answer = num1 / num2;
                        System.out.println("The answer : "+answer);
                    }catch (ArithmeticException e){
                        System.out.println("Division by zero is not possible."+e.toString());
                    }
                    break;
                case 5:
                    System.exit(0);





            }




        }


    }
}
