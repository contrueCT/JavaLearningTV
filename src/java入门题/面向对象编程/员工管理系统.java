package java入门题.面向对象编程;

public class 员工管理系统 {
    public static void main(String[] args) {
        Employee p1 = new Employee();
        p1.setName("张三");
        p1.setSalary(5000);
        p1.setPosition("软件工程师");
        p1.print();
        Employee p2 = new Employee();
        p2.setName("李四");
        p2.setSalary(6000);
        p2.setPosition("项目经理");
        p2.print();
        Employee p3 = new Employee();
        p3.setName("王五");
        p3.setSalary(7000);
        p3.setPosition("技术总监");
        p3.print();
    }

    public static class Employee {
        String name;
        double salary;
        String position;

        public void print(){
            System.out.println("姓名：" + name);
            System.out.println("员工薪资：" + salary);
            System.out.println("员工职位：" + position);
            System.out.println("--------------------");
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }
    }
}
