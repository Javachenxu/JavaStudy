package JavaStudySpace.day_04.method_operation;
//斐波拉契数
import java.util.Scanner;

public class RecursionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入n的值：");
        int n = input.nextInt();
        int num = fn(n);
        System.out.println("第"+ n +"个斐波拉契数是："+num);
    }
    static int fn(int n) {
        if (n < 2) {
            return n;
        } else {
            return fn(n - 1) + fn(n - 2);
        }
    }
}