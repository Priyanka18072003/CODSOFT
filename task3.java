//TASK 3- ATM INTERFACE
import java.util.*;
/*creating class ATM */
class ATM{
    private BankAccount account;
    private Scanner sc;
    public ATM(BankAccount account){
        this.account= account;
        sc = new Scanner(System.in);
    }
    //beginning
    public void begin(){
        int ch;
        System.out.println("ATM MENU:");
        System.out.println("1. MONEY DEPOSIT");
        System.out.println("2. MONEY WITHDRAWAL");
        System.out.println("3. CHECK BALANCE");
        System.out.println("4. EXIT");
        System.out.print("Enter your choice:");
        ch= sc.nextInt();//choice input
        while(ch!=4){    
            switch(ch){
                case 1:
                    deposit();
                    break;
                case 2:
                    withdrawal();
                    break;
                case 3:
                    checkBalance();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("ATM MENU:");
            System.out.println("1. MONEY DEPOSIT");
            System.out.println("2. MONEY WITHDRAWAL");
            System.out.println("3. CHECK BALANCE");
            System.out.println("4. EXIT");
            System.out.print("Enter your choice:");
            ch= sc.nextInt();//choice input
        }
        System.out.println("THANK YOU FOR VISITING.");
    }
    //method for depositing money
    private void deposit(){
        System.out.println("Enter deposit amount:");
        double amount= sc.nextDouble();
        account.deposit(amount);
    }
    //method for withdrawing money
    private void withdrawal(){
        System.out.println("Enter withdrawal amount: ");
        double amount = sc.nextDouble();
        account.withdrawal(amount);

    }
    //method for checking balance
    private void checkBalance(){
        System.out.println("Current Balance:"+ account.getBal());
    }

}
//creating class BankAccount
class BankAccount{
    private double balance;

    public BankAccount(double initialBal){
        balance=initialBal;
    }

    public double getBal(){
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("Successful Deposit of: "+ amount);
        }
        else{
            System.out.println("Please enter a valid amount");
        }
    }
    public void withdrawal(double amount){
        if(amount<=balance && amount>0){
            balance=balance-amount;
            System.out.println("Successful withdrawal of: " + amount);
        }
        else{
            System.out.println("Transaction Failed! Please enter the valid amount");
        }
    }
}
//main method
public class task3{
    public static void main(String[] args){
        double initialBal=100.0;
        BankAccount useraccount = new BankAccount(initialBal);
        ATM atm=new ATM(useraccount);
        atm.begin();
    }
}