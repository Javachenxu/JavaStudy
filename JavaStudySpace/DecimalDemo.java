package JavaStudySpace;
//float 、double类型
public class DecimalDemo {
    public static void main(String[] args) {
        //小数常量
        System.out.println(3.14);//默认double类型
        System.out.println(3.14f);
        System.out.println(3.14e2);
        System.out.println("-------------------");
        //小数变量
        double num1 = 3.14;
        float num2 = 3.14f;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("-------------------");
        double a = 1.000000012450000000005555;
        double b = 1.025545554;
        System.out.println(a + b);
    }
}