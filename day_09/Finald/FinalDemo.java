package JavaStudySpace.day_09.Finald;
//final修饰符
class SuperClass{
    public final void dowork() {}
}
class SubClass extends SuperClass{
    //public void dowork() {}//错误：SubClass中的dowork()无法覆盖SuperClass中被final修饰的dowork()方法
}
public class FinalDemo {
    final static String name = "AAA";
    public static void main(String[] args) {
        //name = "BBB";//错误：不能为最终变量name赋值第二次值，final修饰的变量不可修改
        System.out.println(name);
    }
}