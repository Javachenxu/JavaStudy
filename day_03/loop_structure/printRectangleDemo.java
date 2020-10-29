package JavaStudySpace.day_03.loop_structure;

import testspace.HelloWorld;

//打印矩形
public class printRectangleDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}