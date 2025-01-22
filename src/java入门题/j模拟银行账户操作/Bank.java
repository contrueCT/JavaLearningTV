package java入门题.j模拟银行账户操作;

public class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", 1000);
        try {
            account.deposit(500);
            account.withdraw(200);
            account.withdraw(2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
