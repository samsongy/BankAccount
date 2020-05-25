import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        
        System.out.println("Enter an amount to deposit: ");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();

        Checking checkingAccount = new Checking(amount);

        System.out.println("Current balance: " + checkingAccount.balance);

    }
}
