package bsu.comp152;

public class bankaccount {
    private double balance;
    private float interestRate;
    private int accountID;
    private static int nextID =1000;

    public bankaccount(){
        interestRate=0.02f;
        accountID = nextID;
        nextID++;
    }

    public bankaccount(double initialBalance, float initialRate){
        balance=initialBalance;
        interestRate=initialRate;
        accountID= nextID;
        nextID=nextID + 1;
    }


    public void deposit(double amount){
        balance = balance + amount;
    }


    public boolean withdraw(double amount){
        if (amount <= balance){
            balance -=amount;
            return true;

        }
        return false;



    }
    public String getMessage() {
        return "Welcome to your new account";

    }
    public double checkBalance() { //what balance of account is

        return balance;
     }


     public double addInterest(){
        var interest = balance*interestRate;
        balance = balance + interest;
        return balance;

    }

    public int getAccountID() {
        return accountID;
    }
}
