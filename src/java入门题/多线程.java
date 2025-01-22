package java入门题;

public class 多线程 {
    public static void main(String[] args){
        Thread t1 = new Thread(new MyThread("1"));
        Thread t2 = new Thread(new MyThread("2"));
        Thread t3 = new Thread(new MyThread("3"));

        t1.start();
        t2.start();
        t3.start();

    }

    public static class MyThread implements Runnable{
        String name;
        public MyThread(String name){
            this.name = name;
        }
        @Override
        public void run(){
            Thread t = Thread.currentThread();
            try {
                System.out.println("订单"+name+"正在处理中");
                Thread.sleep(2000);
                System.out.println("订单"+name+"处理完成");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
