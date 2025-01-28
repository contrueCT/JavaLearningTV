package java进阶题;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class LoginSystem {
    public static void main(String[] args){
        User user1 = new User(111111,"123456");
        User user2 = new User(222222,"456789");
        User theUser = null; //当前要登录的用户

        List<User> user = new ArrayList<>();
        List<User> LockedUser = new ArrayList<>();
        List<LoginAttempt> LoginAttempts = new ArrayList<>();

        user.add(user1);
        user.add(user2);
        long lastTime = 1000000000;   //上一次输入错误的时间
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入账号：");
            while (true) {
                int account = sc.nextInt();
                boolean isExist = false;
                for(User curUser : user){
                    if(curUser.account == account){
                        System.out.println("账号正确！");
                        isExist = true;
                        theUser = curUser;
                        break;
                    }
                }
                if(isExist){
                    if(LockedUser.contains(theUser)){
                        System.out.println("账号已被锁定，请联系管理员解锁");
                        continue;
                    }
                    break;
                }
                System.out.println("账号错误请重新输入");
            }
            System.out.println("请输入密码：");
            boolean isRight = false;
            LinkedList<Long> failTimes = new LinkedList<>();
            while(true){
                String password = sc.next();
                if(password.equals(null)){
                    System.out.println("不能输入空白，请重新输入");
                }

                long now = Instant.now().toEpochMilli();

                isRight = theUser.login(password);
                if(isRight){
                    break;
                }else{
                    System.out.println("密码错误，请重新输入");

                    long curFailTimes = Instant.now().toEpochMilli();
                    failTimes.offer(curFailTimes);
                    if(failTimes.size() >= 3){
                        lastTime = failTimes.poll();
                    }
                }
                LoginAttempts.add(new LoginAttempt(theUser.account,"console","196.168.0.0.1",isRight, LocalDateTime.now()));
                System.out.println("failTimes.size() = " + failTimes.size());
                System.out.println("lastTime = " + lastTime);
                System.out.println("LoginAttempts.size() = " + LoginAttempts.size());
                System.out.println("now - lastTime = " + (now - lastTime));
                if(LoginAttempts.size()>=3&&now - lastTime<10000){
                    System.out.println("密码输入错误次数过多，账号被锁定");
                    LockedUser.add(theUser);
                    break;
                }

            }
        }
    }
}
