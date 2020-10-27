package JavaStudySpace.day_10.Internal_category;
//局部内部类
public class LocalInnerClassDemo {
    static String name = "XX";
    public static void main(String[] args) {
        System.out.println();
        class Inner{
            int age = 17;
            public void test() {
                System.out.println(age);
                System.out.println(name);
            }
        }
        new Inner().test();
    }
}