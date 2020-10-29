package JavaStudySpace.day_03.loop_structure;
//控制外层循环
public class LabelDemo {
    public static void main(String[] args) {
        outer: for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=4 ; j++) {
                if (i == 3) {
                    //结束外循环
                    break outer;
                }
                System.out.println("i="+ i+",j=" + j);
            }
        }
    }
}