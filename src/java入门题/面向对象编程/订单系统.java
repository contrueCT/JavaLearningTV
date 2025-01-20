package java入门题.面向对象编程;

public class 订单系统 {
    public static void main(String[] args){
        Order order = new Order();
        order.setOrderId(500);
        order.setAmount(1000);
        order.applyDiscount(0.9);
        System.out.println(order.amount);
    }

    public static class Order{
        int OrderId;
        double amount;

        public void applyDiscount(double discount){
            amount = amount * discount;
        }

        public int getOrderId() {
            return OrderId;
        }

        public void setOrderId(int orderId) {
            OrderId = orderId;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }
    }
}


