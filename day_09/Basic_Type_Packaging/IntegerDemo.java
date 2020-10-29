package JavaStudySpace.day_09.Basic_Type_Packaging;
//演示包装类，演示拆箱和装箱操作
public class IntegerDemo {
    public static void main(String[] args) {
        //装箱操作：把一个基本类型的值，装换成为对应包装类对象
        //方式一：
        Integer num1 = new Integer(17);
        //方式二：
        Integer num2 = Integer.valueOf(17);
        //拆箱操作
        int num3 = num1.intValue();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        //自动装箱：可以直接把基本类型赋值给对应的基本类型变量
        Integer num4 = 17;
        //自动拆箱：可以直接把一个包装类对象赋给对应的基本类型变量
        int num5 = num4;
        System.out.println(num4);
        System.out.println(num5);
        Integer num = 10;
        switch (num) {
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        Object obj = 17;
    }
}