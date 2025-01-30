package java进阶题.签到天数;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class recordSystem {
    public static void main(String[] args){
        User user1 = new User(111111);
        User user2 = new User(222222);
        Date date = new Date();

        LocalDate today = LocalDate.now();

        for(int i = 0;i<21;i++){
            LocalDate day = today.plusDays(i);
            System.out.println("今天是"+day+"，谁签到了？（1，2分别代表用户1和用户2）");
            int re = new Scanner(System.in).nextInt();
            //用户维度签到
            if(re==1){
                user1.SignIn(day,true);
                user2.SignIn(day,false);
                date.dateSignIn(day,111111);
            }
            else if(re==2){
                user1.SignIn(day,false);
                user2.SignIn(day,true);
                date.dateSignIn(day,222222);
            }
        }

        //日期维度查询
        int TotalStreak1 = date.checkTimes(111111);
        int continuousStreak1 = date.continuousCheckTimes(111111);
        int TotalStreak2 = date.checkTimes(222222);
        int continuousStreak2 = date.continuousCheckTimes(222222);

        System.out.println("用户维度：用户1签到了"+user1.getTotalStreak()+"天，连续签到了"+user1.getContinuousStreak()+"天，"
                +"用户2签到了"+user2.getTotalStreak()+"天，连续签到了"+user2.getContinuousStreak()+"天。");
        System.out.println("日期维度：用户1签到了"+TotalStreak1+"天，连续签到了"+continuousStreak1+"天，"
                +"用户2签到了"+TotalStreak2+"天，连续签到了"+continuousStreak2+"天。");
    }
}
