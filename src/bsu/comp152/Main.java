package bsu.comp152;

public class Main {

    public static void main(String[] args) {
        var myAccount= new bankaccount();
        myAccount.deposit(double amount: 1000);
        myAccount.addInterest();
        var suceeded = myAccount.withdraw(double amount: 2000);
        if (suceeded)
            System.out.println("managed to withdraw 2000");
        else
            System.out.println("you tried to take out 2000 but you only have" + myAccount.checkBalance() +
                    "in your account");

    }
}
