package bsu.comp152;

public class bankaccount {
    private double balance;
    private float interestRate;



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
        var interest = balance*interestRate
        balance = balance + interest;
        return balance;

    }

}
