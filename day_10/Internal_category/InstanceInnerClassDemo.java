package JavaStudySpace.day_10.Internal_category;
//外部类
class Outter{
    String name = "Outter.name";

    //内部类
    class Inner{
        String name = "Inner.name";
        public void test() {
            
            String name = "Local.name";
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Outter.this.name);
        }
    }
}
//演示实例内部类
public class InstanceInnerClassDemo {
    public static void main(String[] args) {
        // 创建实例内部类前,必须存在外部类对象,通过外部类对象创建内部类对象(当存在内部类对象时,一定存在外部类对象)
        Outter out = new Outter();
        Outter.Inner in = out.new Inner();
        System.out.println(in);
        in.test();
    }
}