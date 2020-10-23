package JavaStudySpace.day_05.Java5_New_features;
//求数组中的元素之和
public class VarArgsDemo {
    public static void main(String[] args) {
        double sum = getSum(10.0,20.0,30.0,40.0,50.0);
        System.out.println(sum);
    }
    static double getSum(double ...ds) {
        double sum = 0.0;
        for (double d : ds) {
            sum += d;
        }
        return sum;
    }
}