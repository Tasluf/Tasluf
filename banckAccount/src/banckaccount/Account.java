
package banckaccount;

public abstract class Account {
    private String name;
    private double balance;
    
    Account(String name,double balance)
    {
        this.name = name;
        this.balance = balance;
    }
    
    public void diposite(double ammount)
    {
            balance = balance + ammount;
            System.out.println(ammount+" is successfully diposite");
            System.out.println("Your main balance is "+balance+"\n");
        
    }
    
    public double withdraw(double ammount)
    {
        if(ammount > balance)
        {
            System.out.println("You don't have enough balance");
            return balance;
        }
        else
        {
            balance = balance - ammount;
            System.out.println(ammount+" is successfully withdraw");
            return balance;
        }
        
    }
    public double checkBalance()
    {
        return balance;
    }
    
    public abstract double interest();
}
