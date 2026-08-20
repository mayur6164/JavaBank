import java.util.*;

class JavaBank{
    // Instance Variables 
    String name;
    int accNo, balance;
    final int minimumBalance = 10000;
    char rupeeChar = '\u20B9';

    // Parameterized constructor to initialize objects fields. 
    public JavaBank(String name, int accNo, int balance){
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    // Method to display bank customer data
    public void display(){
        System.out.println("---------------------------");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
        System.out.println("---------------------------");
    }

    // Method to deposit money to bank Accounts
    public void deposit(int deposit){
        if(deposit == 0){
        System.out.println("---------------------------");
            System.out.println("Please deposit minimum "+rupeeChar+"1");
        System.out.println("---------------------------");
        }
        else if(deposit < 0){
        System.out.println("---------------------------");
            System.out.println("You can't add minus value.");
        System.out.println("---------------------------");
        }
        else{
        balance = balance + deposit;
        System.out.println("---------------------------");
        System.out.println("New Balance: "+ balance);
        System.out.println("---------------------------");
        }
    }

    // Method to withdraw money from bank account
    public void withdraw(int withdrawMoney){
        int remainingBalance = balance - withdrawMoney;

        if(withdrawMoney == 0){
            System.out.println("Please withdraw minimum " +rupeeChar +"1");
        }
        else if(withdrawMoney < 0){
            System.out.println("You can't withdraw a negative amount");
        }
        else if(remainingBalance >= minimumBalance && withdrawMoney > 0){
            balance = balance - withdrawMoney;
        System.out.println("---------------------------");
            System.out.println("withdraw Success.");
            System.out.println("New Balance after withdraw: " + balance);
        System.out.println("---------------------------");
        }  
        else{
        System.out.println("---------------------------");
            System.out.println("You need to maintain minimum 10,000 rupis in bank account.");
            System.out.println("Balance is still: " + balance);
        System.out.println("---------------------------");
        }
    }
}

public class bank{
    public static void main(String[] args){
        // Creating Objects(Accounts).
        JavaBank c1 = new JavaBank("Mayur Kariya",101,15000);
            
        // Scanner Object created.
        Scanner sc = new Scanner(System.in);
        int menuChoice;
        // Menu of choosing:
        do{
            // Welcome Message
            System.out.println("===== Java Bank =====\n1. Display Account\n2. Deposit Money\n3. Withdraw Money\n4.Exit\nEnter choice: ");
                
            // Taking input for menu choice 
            menuChoice = sc.nextInt();

            switch (menuChoice) {
            case 1:
                // Displaying data of bank customers(objects).
                c1.display();
                break;
            case 2:
                // deposit Money 
                System.out.println("Enter amount to deposit");
                int deposit = sc.nextInt();
                c1.deposit(deposit);
                break;
            case 3:
                // withdraw Money
                System.out.println("Enter withdraw amount: ");
                int withdrawMoney = sc.nextInt();
                c1.withdraw(withdrawMoney);
                c1.display();
                break;
            case 4: 
                System.exit(0);
            default:
                System.out.println("Enter an valid input from 1 to 4");
                break;
            }
        } while (menuChoice != 4);      
    }
}