
package banckaccount;

import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter balance: ");
        double balance = input.nextDouble();
        
        SavingAccount savingAccount = new SavingAccount(name,balance);
        Information information = new Information();
        information.showInformation(savingAccount);
    }
    
}
