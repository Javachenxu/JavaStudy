package JavaStudySpace;

public class TypeConvertDemo {
    public static void main(String[] args) {
        //自动类型转换
        byte b = 17;
        short c = b;
        double d = c;
        System.out.println(c); 
        //byte b2 = d ;//错误：不兼容的类型，从double转换到byte可能会有损失。
        //强制类型转换
        //需求：强制的把double类型的d转换为int类型。
        int num = (int) 3.1415926;
        System.out.println(num);

        //表达式类型自动提升
        System.out.println("------------------");
        double result = 123 + 3.14 + 3.15f + 100L;

    }
}