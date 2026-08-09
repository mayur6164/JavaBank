import java.util.*;

class JavaBank{
    String name;
    int accNo, balance;

    public JavaBank(String name, int accNo, int balance){
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }

    public void deposit(int deposit){
        balance = balance + deposit;
        System.out.println("New Balance: "+ balance);
    }

}

public class bank{
    public static void main(String[] args){
        JavaBank c1 = new JavaBank("Mayur Kariya",101,15000);
        JavaBank c2 = new JavaBank("Vishnu Kariya",102,10000);
        c1.display();
        System.out.println("");
        c2.display();

        // deposit Money 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to deposit");
        int deposit = sc.nextInt();
        c1.deposit(deposit);

    }
}