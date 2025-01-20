package java入门题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 集合 {
    public static void main(String[] args){
        List<String> electronics = Arrays.asList("手机", "笔记本电脑", "平板");
        List<String> clothing = Arrays.asList("T恤", "牛仔裤", "夹克");
        ArrayList<String> all = new ArrayList<>();
        all.addAll(electronics);
        all.addAll(clothing);
        System.out.println(all);
    }
}
