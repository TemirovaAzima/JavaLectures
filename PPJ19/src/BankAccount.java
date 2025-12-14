public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance){
        this.owner = owner;
        if(balance < 0) this.balance = 0;
        else  this.balance = balance;
    }

    public boolean withdraw(double amount){
        if(amount <= 0){
            System.out.println("Amount cannot be negative");
            return false;
        }

        if(balance < amount){
            System.out.println("Insufficient funds");
            return false;
        }

        balance-= amount;
        return true;
    }

    public boolean deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid deposit amount");
            return false;
        }

        balance+=amount;
        System.out.println("Operation successful");
        return true;
    }

    public double getBalance() { return  balance; }
    public void setBalance(double balance){
        this.balance = balance;
    }

}
