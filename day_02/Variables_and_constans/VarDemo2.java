package JavaStudySpace.day_02.Variables_and_constans;

public class VarDemo2 {
    static String name = "cx";//成员变量
    public static void main(String[] args) {
        String name = "陈";//局部变量
        System.out.println(name);//就近原则
        //System.out.println(age);//错误需要先声明以及初始化
        //int age = 17;
        //String age = 17;//同一作用域内变量不能重复定义
    }
}