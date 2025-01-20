package java入门题;

public class 商品库存计算 {
    public static void main(String[] args) {
        int[] inventory = {120,80,60,150,200};
        int total = 0;
        for(int i = 0;i<inventory.length;i++){
            total += inventory[i];
        }
        System.out.println("商品库存总量为："+total);
    }
}
