package JavaStudySpace;

//用 do...while 循环实现从1到100的累加。
public class doWhileDemo {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        do {
            sum += num;
            num++;
        } while (num <= 100);
        System.out.println(sum);
    }
}