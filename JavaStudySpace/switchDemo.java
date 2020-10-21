package JavaStudySpace;

import java.util.Scanner;

public class switchDemo {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        //输入日期
        System.out.println("请输入日期：");
        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
            case 7:
                System.out.println("周日");
                break;
            default:
            System.out.println("SB没有这么一天");
                break;
        }
    }
}