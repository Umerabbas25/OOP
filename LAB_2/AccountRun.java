package LAB_2;

public class AccountRun {

    public static void main(String[] args) {

        Account A1 = new Account();
        System.out.println("Account Name: "+ A1.getAccountName());
        System.out.println("Initial balance: " + A1.getBalance());
        System.out.println("Remaining balance after deposit: " + A1.deposit(0));

        Account A2 = new Account(2500.00, "Umerpro");
        System.out.println();
        System.out.println("Account Name: " + A2.getAccountName());
        System.out.println("Initial balance: " + A2.getBalance());

        System.out.println("Remaining balance after withdrawal: "
                + A2.withdraw(100));
    }
}


class Account {

    private double balance;
    private String account_name;


    public Account() {
        balance = 155.55;
        account_name = "Umerpro";
    }

    public Account(double balance, String account_name) {
        this.balance = balance;
        this.account_name = account_name;
    }
    public double deposit(double deposit_amount) {

        if (deposit_amount > 0) {

            balance = balance + deposit_amount;

        } else {

            System.out.println("Deposit must be greater than 0");
        }

        return balance;
    }


    public double withdraw(double withdraw_amount) {

        if (withdraw_amount > 0 && withdraw_amount <= balance) {
            balance = balance - withdraw_amount;

        } else {
            System.out.println(
                    "Invalid withdrawal amount or insufficient balance."
            );
        }

        return balance;
    }



    public double getBalance() {
        return balance;
    }


    public String getAccountName() {
        return account_name;
    }
}