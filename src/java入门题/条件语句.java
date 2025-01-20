package java入门题;

import java.util.Scanner;

public class 条件语句 {
    public static void main(String[] args){
        String username = "admin";
        String password = "12345";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String inputUsername = sc.nextLine();
        System.out.println("请输入密码：");
        String inputPassword = sc.nextLine();
        if(username.equals(inputUsername) && password.equals(inputPassword)){
            System.out.println("登录成功");
        }
        else{
            System.out.println("用户名或密码错误");
        }
    }
}
