package java入门题;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class 日志记录系统 {
    public static void main(String[] args){
        File file = new File("System.log");
        try (FileWriter writer = new FileWriter(file,true)){
            writer.write(LocalDateTime.now().toString() + " [debug] 启动\n");
            int[] inventory = {120,80,60,150,200};
            int total = 0;
            for(int i = 0;i<inventory.length;i++){
                total += inventory[i];
            }
            System.out.println("商品库存总量为："+total);
            writer.write(LocalDateTime.now().toString() + " [debug] 计算了商品数量\n");

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
