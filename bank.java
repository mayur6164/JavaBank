import java.util.*;

class JavaBank{
    String name;
    int accNo, bal;

    public JavaBank(String name, int accNo, int bal){
        this.name = name;
        this.accNo = accNo;
        this.bal = bal;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + bal);
    }
}

public class bank{
    public static void main(String[] args){
        JavaBank c1 = new JavaBank("Mayur Kariya",101,15000);
        JavaBank c2 = new JavaBank("Vishnu Kariya",102,10000);
        c1.display();
        c2.display();
    }
}