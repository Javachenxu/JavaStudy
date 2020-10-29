package JavaStudySpace.day_03.loop_structure;

//用 while 循环实现从1到100的累加。
public class whileDemo {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        while (num <= 100) {//表示一个循环结束
            sum += num;
            num++;
        } 
        System.out.println(sum);
    }
}