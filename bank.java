import java.util.*;

class JavaBank{
    // Instance Variables 
    String name;
    int accNo, balance;
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
}

public class bank{
    public static void main(String[] args){
        // Creating Objects(Accounts).
        JavaBank c1 = new JavaBank("Mayur Kariya",101,15000);
        JavaBank c2 = new JavaBank("Vishnu Kariya",102,10000);

        // Displaying data of bank customers(objects).
        c1.display();
        System.out.println("");
        c2.display();

        // deposit Money 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to deposit");
        int deposit = sc.nextInt();
        c2.deposit(deposit);
    }
}