package java入门题.j模拟银行账户操作;

public class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public BankAccount(){

    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(balance < amount){
            throw new MyException("余额不足！");
        }
        balance -= amount;
    }
}
