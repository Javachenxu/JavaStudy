//方法重载
package JavaStudySpace;

import java.util.Scanner;

public class OverloadDemo {
    public static void main(String[] args) {
       sum(1.2, 1.6);
    }
    
    // 需求：求两个整数之和
    static int sum(int a, int b) {
        int num = a + b;
        return num;
    }
    //需求：求两个小数之和
    static double sum(double a,double b) {
        double num = a + b;
        return num;
    }
}