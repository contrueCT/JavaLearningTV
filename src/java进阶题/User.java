package java进阶题;

public class User {
    int account;
    String password;

    public User(int account, String password){
        this.account = account;
        this.password = password;
    }
    public User(){

    }

    public boolean login(String password){
        if(this.password.equals(password)){
            System.out.println("登录成功！");
            return true;
        }
        else{
            System.out.println("登录失败！");
            return false;
        }
    }
}
