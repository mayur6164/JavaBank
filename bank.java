import java.util.*;

class JavaBank{
    // Instance Variables 
    private static String bankName = "JavaBank";
    private String name;
    private int accNo;
    private double balance;
    private String chequeNumber;
    private static final int minimumBalance = 10000;
    private static char rupeeChar = '\u20B9';
    private static int accountCounter = 0;

    // Non-Parameterized Construcor
    public JavaBank(){
        name = "Not Assigned";
        accNo = 0;
        balance = 0;
        // System.out.println(name + " " + accNo + " " + balance);
        accountCounter++;
    }

    // Parameterized constructor to initialize objects fields. 
    public JavaBank(String name, int accNo, int balance){
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
        accountCounter++;
    }

    // Static block
    static{
        System.out.println("JavaBank system initialized...");
    }

    // Getter Method to Display All data of Account Holder
    public void displayAccountHolder(){
        System.out.println("Name: " + name + "\nAccount Number: " + accNo + "\nBalance: " + balance);
    }
    // Getter Method to return balance
    public double getBalance(){
        return balance;
    }
    // Getter Method to return name of account holder
    public String getName(){
        return name;
    }
    // Getter Method to return name of bank
    public static String getBankName(){
        return bankName;
    }
    // Getter Method to return account-number
    public int getAccNo(){
        return accNo;
    }
    // Getter Method to return count of account created
    public static int getAccCount(){
        return accountCounter;
    }
    // Setter Method to change bank name
    public static String changeBankName(String newBankName){
        bankName = newBankName;
        return bankName;
    }

    // Method to deposit money to bank Accounts
    public void depositAmt(double depositAmt){
        if(depositAmt == 0){
        System.out.println("---------------------------");
            System.out.println("Please deposit minimum "+rupeeChar+"1");
        System.out.println("---------------------------");
        }
        else if(depositAmt < 0){
        System.out.println("---------------------------");
            System.out.println("You can't add minus value.");
        System.out.println("---------------------------");
        }
        else{
        balance = balance + depositAmt;
        System.out.println("---------------------------");
        System.out.println("New Balance: "+ balance);
        System.out.println("---------------------------");
        }
    }
    public void depositAmt(double depositAmt, String chequeNumber ){
        if(depositAmt == 0){
        System.out.println("---------------------------");
            System.out.println("Please deposit minimum "+rupeeChar+"1");
        System.out.println("---------------------------");
        }
        else if(depositAmt < 0){
        System.out.println("---------------------------");
            System.out.println("You can't add minus value.");
        System.out.println("---------------------------");
        }
        else{
        balance = balance + depositAmt;
        this.chequeNumber = chequeNumber;
        System.out.println("---------------------------");
        System.out.println("New Balance: "+ balance);
        System.out.println("Cheque Number: "+ chequeNumber);
        System.out.println("---------------------------");
        }
    }

    // Method to withdraw money from bank account
    public void withdrawAmt(double withdrawAmt){
        double remainingBalance = balance - withdrawAmt;

        if(withdrawAmt == 0){
            System.out.println("Please withdraw minimum " +rupeeChar +"1");
        }
        else if(withdrawAmt < 0){
            System.out.println("You can't withdraw a negative amount");
        }
        else if(withdrawAmt > balance){
            System.out.println("Insufficient Balance!");
        }
        else if(remainingBalance >= minimumBalance && withdrawAmt > 0){
            balance = balance - withdrawAmt;
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
        // JavaBank c2 = new JavaBank(); // Non parameterized Constructor call 

        //Using getter to show Count of Account Created. 
        // System.out.println("Total Account Created: " + JavaBank.getAccCount());

        // To change bank name using setter method
        String newBankName = JavaBank.changeBankName("Mayur's Bank");
        // System.out.println("New Bank Name:  " + newBankName);


        // Getting Idivuduals data of account holder: 
        // System.out.println("Account Name of c1: " + c1.getName());
        // System.out.println("Account Number of c1: " + c1.getAccNo());
        // System.out.println("Account Balance of c1: " + c1.getBalance());

        // Scanner Object created.
        Scanner sc = new Scanner(System.in);
        int menuChoice;
        // Menu of choosing:
        do{
            // Welcome Message
            System.out.println("===== Welcome to "+JavaBank.getBankName()+" ===== \n1. Display Account\n2. Deposit Money\n3. Withdraw Money\n4.Exit\nEnter choice: ");
                
            // Taking input for menu choice 
            menuChoice = sc.nextInt();

            switch (menuChoice) {
            case 1:
                // Displaying data of bank customers(objects).
                c1.displayAccountHolder();
                break;
            case 2:
                // deposit Money 
                System.out.print("Enter deposit amount: ");
                double depositAmt = sc.nextDouble();

                System.out.print("Enter cheque number: ");
                String chequeNumber = sc.next(); 
                c1.depositAmt(depositAmt,chequeNumber);
                break;
            case 3:
                // withdraw Money
                System.out.println("Enter withdraw amount: ");
                double withdrawAmt = sc.nextDouble();
                c1.withdrawAmt(withdrawAmt);
                c1.displayAccountHolder();
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