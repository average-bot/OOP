package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    Scanner sc;

    //Task 1
    static ArrayList<Employee> employees;

    //Task2
    static ArrayList<IPayable> payables;

    public static void main(String[] args) {
        employees = new ArrayList<>();

        //Task1

        employees.add(new HourlyEmployee("Eva","Evasson", "1234-567",20,180));
        employees.add(new SalariedEmployee("Bengt","Nilsson", "1256-789",12550));
        employees.add(new HourlyEmployee("Sven","Svensson", "1234-899",20,180));

        //Task2
        payables = new ArrayList<>();
        payables.add(new HourlyEmployee("Eva","Evasson", "1234-567",20,180));
        payables.add(new SalariedEmployee("Bengt","Nilsson", "1256-789",12550));
        payables.add(new Invoice("123-56", 16, 6527.99));

        //Task1
        showMenu();

        //Task2
        showPayables();



    }

    public static void showMenu(){
        Scanner sc = new Scanner(System.in);
        int userInput;
      do{
          System.out.println("Please choose one option from the following list:"
                  + "\n 1. View a list of all employees "
                  + "\n 2. View all salaried employees"
                  + "\n 3. Search for an employee " );
          try{
              userInput = sc.nextInt();
              break;
          }catch (InputMismatchException ex){
              System.out.println("Not an option, try again!");
              sc.next(); //Tömmer sc
          }
      }while (true);

      switch (userInput){
          case 1:
              viewAllEmployees();
              break;
          case 2:
              viewSalariedEmployees();
              break;
          case 3:
              searchForEmployee();
              break;
          default:
              System.out.println("Not an option!");;
              break;
      }
    }

    private static void viewSalariedEmployees() {
        for(Employee emp:employees){
            if(emp instanceof SalariedEmployee){
                System.out.println(emp);
            }
        }
    }

    private static void viewAllEmployees() {
        for(Employee emp:employees){
            System.out.println(emp.toString());
            ArrayList<Contract> contracts = emp.getContracts();
            for(Contract c : contracts){
                System.out.println(c);
            }
        }
    }

        private static void addContract(){
        //ask for employee
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter ssn: ");
            String ssn= sc.nextLine();

            for(Employee emp:employees) {
                if (emp.getSsn().equals(ssn)) {
                    System.out.println(emp);
                    //create a new contract object
                    emp.getContracts().add(new Contract("dog", 23, 34));
                    //we add it to the contract list for that employee
                }
            }
        }

    private static void searchForEmployee() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ssn: ");
        String ssn= sc.nextLine();

        boolean found= false;

        for(Employee emp:employees) {
            if (emp.getSsn().equals(ssn)) {
                System.out.println(emp);
                ArrayList<Contract> contracts = emp.getContracts();
                for(Contract c : contracts){
                    System.out.println(c);
                }
                found = true;
                break;
            }
        }
            if(found==false){
                System.out.println("The employee is not in the list!");
            }
    }

    //Task2
    private static void showPayables(){
        for(IPayable payable : payables){
            System.out.println( "\n" + payable);
            System.out.println(" The payment amount is: "
                                 + payable.getPaymentAmount());
        }
    }
    }



