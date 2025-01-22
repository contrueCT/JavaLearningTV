package java入门题.商品折扣系统;

public class ShopSystem {
    public static void main(String[] args){
        Product apple = new Product("苹果", 5.0);
        Product banana = new Product("香蕉", 3.0);
        Product orange = new Product("橙子", 4.0);
        double discount = 0.8;
        System.out.println(apple.getName()+"折扣价是"+String.format("%.2f",DiscountCalculator.calculateDiscount(apple, discount)));
        System.out.println(banana.getName()+"折扣价是"+String.format("%.2f",DiscountCalculator.calculateDiscount(banana, discount)));
        System.out.println(orange.getName()+"折扣价是"+String.format("%.2f",DiscountCalculator.calculateDiscount(orange, discount)));

    }
}
