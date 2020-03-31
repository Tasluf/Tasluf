
package banckaccount;

import java.util.Scanner;

public class Information {

    private static boolean x = true;

    public void showInformation(SavingAccount savingAccount) {
        System.out.println("1) Diposite\n2) Withdraw\n3) Check Balance\n"
                + "4) Show Interest\n5) Bonous\n6) Exit");

        do {
            System.out.print("Enter your choose: ");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter the diposite amount: ");
                    savingAccount.diposite(input.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter the withdraw amount: ");
                    System.out.println("Your main balance is :" 
                            + savingAccount.withdraw(input.nextDouble())+"\n");
                    break;

                case 3:
                    System.out.println("Your main balance is: " 
                            + savingAccount.checkBalance()+"\n");
                    break;

                case 4:
                    System.out.println("5% interest of your balance is: " 
                            + savingAccount.interest()+"\n");
                    break;

                case 5:
                    System.out.println("You will get bonous: " 
                            + savingAccount.bonous()+"\n");
                    break;

                case 6:
                    x = false;
                    break;
                default:
                    System.out.println("You have enter wrong choose");
                    break;
            }
        } while (x);

    }

}
