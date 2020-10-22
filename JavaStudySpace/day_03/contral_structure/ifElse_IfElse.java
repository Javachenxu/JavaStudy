package JavaStudySpace.day_03.contral_structure;

import java.util.Scanner;

//需求：考试成绩大于90分，就打印优，如果大于80分，就打印良，如果大于70分，打印中，其他情况打印多多努力
public class ifElse_IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //输入成绩
        System.out.println("请输入成绩：");
        int score = input.nextInt();
        
        if (score > 80) {
            if (score > 90) {
                System.out.println("优");
            } else {
                System.out.println("良");
            }
        } else {
            if (score > 70) {
                System.out.println("中");
            } else {
                System.out.println("多多努力！");   
            }
        }
        
    }
}