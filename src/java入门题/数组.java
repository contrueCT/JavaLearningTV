package java入门题;

public class 数组 {
    public static void main(String[] args){
        double[] sales = {230.0,120.0,560.0, 300.5, 410.0};
        double total = 0;
        double max = 0;
        double min = 500000;
        for(int i =0;i<sales.length;i++){
            total += sales[i];
            if(sales[i]>max){
                max = sales[i];
            }
            if(sales[i]<min){
                min = sales[i];
            }
        }
        System.out.println("总销售额为："+total);
        System.out.println("最大销售额为："+max);
        System.out.println("最小销售额为："+min);
    }
}
