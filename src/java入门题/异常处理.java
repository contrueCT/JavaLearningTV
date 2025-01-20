package java入门题;

import java.util.Scanner;

public class 异常处理 {
    public static void main(String[] args){
        try{
            int a;
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个整数：");
            if(sc.hasNextInt()){
                a = sc.nextInt();
                if(a<0){
                    throw new MyException("输入的数字不能为负数！");
                }
                else{
                    System.out.println(a);
                }
            }
            else{
                throw new MyException("输入错误，请输入整数！");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());

        }
    }

    public static class MyException extends RuntimeException{
        public MyException() {
            super();
        }

        public MyException(String message) {
            super(message);
        }
    }
}
