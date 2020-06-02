public class Checking {

    double balance;

    public Checking(){
        double balance;
    }

    public void Deposit(double amount){
        balance += amount;
    }

    public void Withdraw(double amount){
        balance-=amount;
    }


    public double GetBalance(){
        return balance;
    }
    
}