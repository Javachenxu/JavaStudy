package JavaStudySpace.day_03.loop_structure;
//用 for 循环实现从1到100的累加。
public class forDemo {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}