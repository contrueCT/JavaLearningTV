package java进阶题;

import java.time.LocalDateTime;

public class LoginAttempt {
    int account;
    String source;
    String id;
    boolean isSuccessful;
    LocalDateTime time;

    public LoginAttempt(int account, String source, String id, boolean isSuccessful, LocalDateTime time){
        this.account = account;
        this.source = source;
        this.id = id;
        this.isSuccessful = isSuccessful;
        this.time = time;
    }

}
