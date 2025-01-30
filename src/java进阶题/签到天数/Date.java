package java进阶题.签到天数;

import com.sun.istack.internal.NotNull;

import java.time.LocalDate;
import java.util.*;

public class Date {
    @NotNull
    Map<LocalDate, Set<Integer>> UsersDateRecord = new HashMap<>();

    public void dateSignIn(LocalDate date,int... accounts) {
        for (int account: accounts) {
            Set<Integer> set = UsersDateRecord.getOrDefault(date, new HashSet<>());
            set.add(account);
            UsersDateRecord.put(date, set);
        }
    }

    public int checkTimes(int account) {
        long count = UsersDateRecord.values().stream().filter(Objects::nonNull).filter(set -> set.contains(account)).count();
        return (int) count;
    }

    public int continuousCheckTimes(int account) {
        int count = 0;
        int max = 0;
        List<LocalDate> sortedDates = new ArrayList<>(UsersDateRecord.keySet());
        Collections.sort(sortedDates);
        for(LocalDate date:sortedDates){
            Set set = UsersDateRecord.get(date);
            if(set!=null&&set.contains(account)){
                count++;
                if(count > max){
                    max = count;
                }
            }else{
                count = 0;
            }
        }
        return max;
    }

    public Date() {
    }
}
