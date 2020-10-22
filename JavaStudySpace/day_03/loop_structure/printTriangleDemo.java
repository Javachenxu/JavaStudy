package JavaStudySpace.day_03.loop_structure;
//打印直角三角形
public class printTriangleDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}