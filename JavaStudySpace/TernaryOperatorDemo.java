package JavaStudySpace;
import java.util.Scanner;
//现在给一个小数，需要求出其四舍五入之后的结果。
/**
 * @author cx
 * 思路：小数部分>=0.5,进上
 *       小数部分< 0.5,舍弃
 */
public class TernaryOperatorDemo {
    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);
        System.out.println("请输入一个小数");
        final double num = input.nextDouble();
        // 整数部分
        final int iNum = (int) num;
        // 小数部分
        final double dNum = num - iNum;
        final int result = dNum < 0.5 ? iNum : iNum + 1;
        System.out.println(result);
        //判断一个数是奇数还是偶数：陷阱
        //判断取模后余数是不是0就可以。
        System.out.println("请输入一个整数：");
        int num2 = input.nextInt();
        String ret = num2 % 2 == 0 ? "偶数" : "奇数";
        System.out.println(ret);
        //错误，负数取模2会有-1选项
        /*System.out.println("请输入一个整数：");
        int num3 = input.nextInt();
        String ret2 = num3 % 2 == 1 ? "奇数" : "偶数";
        System.out.println(ret2);*/
    }
}