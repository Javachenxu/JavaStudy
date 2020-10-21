package JavaStudySpace;
//逻辑运算符
public class LogicalOperatorDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 1;
        System.out.println(a > b & a >c);
        System.out.println(a > b | a < c);
        System.out.println(a > b && a > c);
        System.out.println(a < b || a > c);
        System.out.println(!(a > b & a > c));
    }
}