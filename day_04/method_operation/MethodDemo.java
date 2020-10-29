package JavaStudySpace.day_04.method_operation;

import java.util.Scanner;

//方法的定义与调用
public class MethodDemo {
    public static void main(String[] args) {
       
        MethodDemo.printline();
        MethodDemo.printValue("Hello!");
        int age = MethodDemo.getAge();
        System.out.println(age);
        Scanner input = new Scanner(System.in);
        System.out.print("请输入第一个值：");
        int x = input.nextInt();
        System.out.println();
        System.out.print("请输入第二个值：");
        int y = input.nextInt();
        System.out.println();
        int num = MethodDemo.add(x, y);
        System.out.println("结果是:"+num);
    }
    
    //a.无参数，无返回
    //需求：定义一个方法，打印分割线
    static void printline() {
        System.out.println("-----------------");
    }
    //有参数，无返回
    //需求：打印任意值
    static void printValue (String val) {
        System.out.println(val);
    }
    //c.无参数，有返回
    //返回will的年龄（18)
    static int getAge() {
        return 18;

    }
    //d.有参数，有返回
    //需求：求两个数之和
    static int add(int a,int b) {
        return a + b;
    }
}