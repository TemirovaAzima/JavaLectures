
public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
        balance = 0;
    }
    public BankAccount(String accountNumber,double initialBalance){
        this.accountNumber = accountNumber;
//        this.balance = (balance <0) ? 0 : balance;
        if(initialBalance >0) balance = initialBalance;
        else{
            System.out.println("negative balance is invalid, set to 0");
            balance = 0;
        }
    }

    public void deposit(double amount){
        if(amount <0 ) {
            System.out.println("cannot deposit a negative amount");
        }else{
            balance+= amount;
            System.out.println("Successful. You deposited " + amount + " and your total balance " + balance);
        }
    }
    public void withdraw(double amount){
        if(amount < 0) {
            System.out.println("cannot withdraw a negative amount of money");
        } else if(amount > balance){
            System.out.println("Not enough funds. Balance is " + balance);
        }else{
            balance -=amount;
            System.out.println("Successful.You withdrew " + amount + " and your total balance: " + balance);
        }
    }
    public void showBalance(){
        System.out.println("Balance is " + balance);
    }
}
