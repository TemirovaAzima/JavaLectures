public class DebitCard extends BankAccount{
    private double debitLimit;

    public DebitCard(String owner,double balance,double debitLimit){
        super(owner,balance);
        if(debitLimit< 0){
            System.out.println("Cannot be negative, set to 0");
            this.debitLimit = 0;
        }else{
            this.debitLimit = debitLimit;
        }
    }

    @Override
    public boolean withdraw(double amount){
         if(super.withdraw(amount)){
             return true;
         }

         if(amount > 0 && getBalance() + debitLimit >= amount){
             setBalance(getBalance() -amount);
             System.out.println("Operation successful. Balance: " + getBalance());
             return true;
         }

         return false;

    }

    @Override
    public boolean deposit(double amount){
        return super.deposit(amount);
    }

}
