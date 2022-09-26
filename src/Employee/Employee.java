package Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {

    public static void main(String[] args) {

        int choice;
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> empList = new ArrayList<>();

        String empName;

        while(true){
            System.out.println("Select an option");
            System.out.println("1. Add Employee");
            System.out.println("2. View all Employee");
            System.out.println("3.Exit");
            choice = scanner.nextInt();

            switch (choice){

                case 1:
                    empName = scanner.next();
                    empList.add(empName);
                    break;
                case 2:
                    if(empList.size()==0){
                        System.out.println("No Emloyees added.");
                    }else{
                        System.out.println(empList);
                    }
                    break;
                case 3:
                    System.exit(0);



            }



        }
    }
}
