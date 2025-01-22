package java入门题.商品折扣系统;

public class DiscountCalculator {
    double discount;
    public DiscountCalculator(double discount){
        this.discount = discount;
    }

    public DiscountCalculator(){

    }

    public static double calculateDiscount(Product product, double discount){
        return product.getPrice() * discount;
    }
}
