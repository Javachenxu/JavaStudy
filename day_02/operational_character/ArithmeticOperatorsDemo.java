package JavaStudySpace.day_02.operational_character;
//算术运算符
public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        System.out.println(a + b);//加+
        System.out.println(a - b);//减-
        System.out.println(a * b);//乘*
        System.out.println(a / b);//除/
        System.out.println(a % b);//取模%
        System.out.println("--------------------------");
        //自增操作
        //前置
        int x1 = 10;
        int y1 = ++x1;
        System.out.println("x1= " + x1);
        System.out.println("y1= " + y1);
        System.out.println("--------------------------");
        //后置
        int x2 = 10;
        int y2 = x1++;
        System.out.println("x2= " + x2);
        System.out.println("y2= " + y2);
        //自减操作同理

    };
}