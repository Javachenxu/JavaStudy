package testspace;
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