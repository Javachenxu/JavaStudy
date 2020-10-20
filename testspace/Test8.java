package testspace;
/**
 * 数组示例：1.猜数游戏：从键盘任意输入一个数据，判断数列中是否包含此数。
 * @author cx
 */
import java.util.Scanner;
import java.util.Random;
public class Test8 {
    public static void main(String[] args) {
        int[] num = new int [5];
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        int lens = num.length;
        for (int i = 0; i < lens; i++) {
            num[i] = r.nextInt(50);
        }
        System.out.println("请输入你要猜的数字数字：");
        boolean flag = false;
        int user = input.nextInt();
        for (int x : num) {
            if (user == x) {
                flag = true;
                break;
            } 
        }
        if (flag) {
            System.out.println("恭喜你猜对了！");
        } else {
            System.out.println("猜错了，加油！");
        }
    }
}