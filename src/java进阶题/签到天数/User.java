package java进阶题.签到天数;

import java.time.LocalDate;

public class User {
    int account;
    int continuousStreak;//连续签到天数
    int totalStreak;
    int count;

    public void SignIn(LocalDate date,boolean doCHeck) {
        if(doCHeck) {
            totalStreak++;
            count++;
            if(count > continuousStreak) {
                continuousStreak = count;
            }
        }else{
            count = 0;
        }
    }

    public int getContinuousStreak(){
        return continuousStreak;
    }
    public int getTotalStreak(){
        return totalStreak;
    }

    public User() {
    }

    public User(int account){
        this.account = account;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }
}
