package testspace;
/**
 * 二维数组示例： JAVA中没有真正的多维数组，本质还是数组中的元素还是数组。
 * 3个班级各3个学员成绩，记录每个学员的平均成绩，并计算平均分。
 */
import java.util.Scanner;
public class Test10 {
    public static void main(String[] args) {
        int [][] scores = {{78,88,99},{85,86,87},{97,91,65}};
        int scoresLen = scores.length;
        for (int i = 0; i < scoresLen; i++) {
            int sum = 0;
            int count = scores[i].length;
            for (int j = 0; j < count; j++) {
                sum+= scores[i][j];
            }
            int avg = sum/count;
            System.out.println("第"+ (i + 1) + "班的平均成绩是：" + avg);
        }
    }
}