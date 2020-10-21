package JavaStudySpace;
import java.util.Scanner;
//if...else...
public class ifElseDemo {
    public static void main(String[] args) {
        //求两数中的最大值
        Scanner input = new Scanner(System.in);
        System.out.print("请输入第一个数：");
        int x = input.nextInt();
        System.out.println();
        System.out.print("请输入第二个数：");
        int y = input.nextInt();
        int maxNum = 0;
        if (x > y) {
            maxNum = x;
        } else {
            maxNum = y;
        }
        System.out.println("最大值为：" + maxNum);
    }
}