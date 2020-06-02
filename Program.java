import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        Checking checkingAccount = new Checking();

        System.out.print("Enter an amount to deposit: ");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();

        checkingAccount.Deposit(amount);


        System.out.println(checkingAccount.balance);

    }
}
