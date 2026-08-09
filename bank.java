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
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }

    // Method to deposit money to bank Accounts
    public void deposit(int deposit){
        if(deposit == 0){
            System.out.println("Please deposit minimum "+rupeeChar+"1");
        }
        else if(deposit < 0){
            System.out.println("You can't add minus value.");
        }
        else{
        balance = balance + deposit;
        System.out.println("New Balance: "+ balance);
        }
    }

    // Method to withdraw money from bank account
    public void withdraw(int withdrawMoney){
        int remainingBalance = balance - withdrawMoney;

        if(remainingBalance >= minimumBalance && withdrawMoney > 0){
            balance = balance - withdrawMoney;
            System.out.println("withdraw Success.");
            System.out.println("New Balance after withdraw: " + balance);
        }
        else if(withdrawMoney == 0){
            System.out.println("Please withdraw minimum " +rupeeChar +"1");
        }
        else if(withdrawMoney < 0){
            System.out.println("You can't withdraw a negative amount");
        }
        else{
            System.out.println("You need to maintain minimum 10,000 rupis in bank account.");
            System.out.println("Balance is still: " + balance);
        }
    }
}

public class bank{
    public static void main(String[] args){
        // Creating Objects(Accounts).
        JavaBank c1 = new JavaBank("Mayur Kariya",101,15000);

        // Displaying data of bank customers(objects).
        c1.display();

        // deposit Money 
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter amount to deposit");
        // int deposit = sc.nextInt();
        // c1.deposit(deposit);
        
        // withdraw Money
        System.out.println("Enter withdraw amount: ");
        int withdrawMoney = sc.nextInt();
        c1.withdraw(withdrawMoney);
        c1.display();
    }
}