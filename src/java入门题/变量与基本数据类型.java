package java入门题;

public class 变量与基本数据类型 {
    public static void main(String[] args) {
        double salary = 0.0;
        for(int i = 0; i < 20; i++) {
            for(int j = 0;j<8;j++){
                salary += 50;
            }
        }
        System.out.println(salary);
    }
}
