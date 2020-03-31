
package banckaccount;

public class SavingAccount extends Account implements Bonous{
    
    SavingAccount(String name,double balance)
    {
        super(name,balance);
    }

    @Override
    public double interest() {
        double inter = super.checkBalance()*(5.0/100);
        return inter;
    }

    @Override
    public double bonous() {
        if(super.checkBalance() > 50000)
        {
            return 1000;
        }
        else if(super.checkBalance() <= 50000 && super.checkBalance() >= 15000)
        {
            return 500;
        }
        else 
        {
            return 0;
        }
        
    }
    
    
}
