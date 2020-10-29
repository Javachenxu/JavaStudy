package JavaStudySpace.day_02.operational_character;
//比较运算符
public class ComparisonOperatorDemo {
    public static void main(String[] args) {
        int a = 15;
        double b = 15.0;
        System.out.println(a == b);//true,若比较的两个操作数都是数值类型，即使它们的类型不同，只要值相同就返回 true
        System.out.println(a != b);//false
        System.out.println(15 > 3);//true
        System.out.println(15 < 3);//false
        System.out.println(15 >= 15);//true
        System.out.println(15 <= 20);//true
        
    }
}