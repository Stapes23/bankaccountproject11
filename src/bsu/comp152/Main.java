package bsu.comp152;

public class Main {

    public static void main(String[] args) {
        var myAccount= new bankaccount();
        var yourAccount= new bankaccount( 10000,  0.05f);
        myAccount.deposit(1000);
        myAccount.addInterest();
        yourAccount.addInterest();
        System.out.println("My account with account number " + myAccount.getAccountID() + " has "
                         + myAccount.checkBalance());

        System.out.println("your account with ID " + yourAccount.getAccountID() + " has " + yourAccount.checkBalance());
        var suceeded = myAccount.withdraw(2000);
        if (suceeded)
            System.out.println("managed to withdraw 2000");
        else
            System.out.println("you tried to take out 2000 but you only have " + myAccount.checkBalance() +
                    " in your account");

    }
}
