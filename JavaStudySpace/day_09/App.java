package JavaStudySpace.day_09;
//代码执行顺序
/*
    1 :App类依赖于SubClass类，所以把SubClass类的字节码加载进JVM
    构造SuperClass：
    2   
    4
    3
    hello
*/
public class App {
    private static App d = new App();//static字段的初始化
    private SubClass t = new SubClass();//非static字段的初始化其实都是在构造器中优先执行的。
    static{
        System.out.println(3);
    }
    public App(){
        System.out.println(4);
    }
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
//父类
class SuperClass {
    SuperClass() {
        System.out.println("构造SuperClass");
    }
}
//子类
class SubClass extends SuperClass {
    static {
        System.out.println(1);
    }

    public SubClass() {
        super();//隐式调用
        System.out.println(2);
    }
}