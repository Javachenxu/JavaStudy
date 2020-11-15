package testspace;
/**
 * 求一个数列中的最大值和最小值
 */

public class Test11 {
    public static void main(String[] args) {
        int [] num = {7,5,19,9,10,6,2,21,25,23};
        System.out.println("数列的最大值：" + Max(num));
        System.out.println("数列的最小值：" + Min(num));
    }
    //求数列的最大值
    public static int Max(int[] num) {
        int Maxnum = num[0];
        int len = num.length;
        for (int i = 0; i < len; i++) {
            if (num[i] > Maxnum) {
                num[i] = Maxnum + num[i];
                Maxnum = num[i] - Maxnum;
                num[i] = num[i] - Maxnum;
            }
        }
        return Maxnum;
    }
    //求数列的最小值
    public static int Min(int[] num) {
        int Minnum = num[0];
        int len = num.length;
        for (int i = 0; i < len; i++) {
            if (num[i] < Minnum) {
                num[i] = Minnum + num[i];
                Minnum = num[i] - Minnum;
            }
        }
        return Minnum;
    }
}