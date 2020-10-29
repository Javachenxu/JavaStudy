package JavaStudySpace.day_09.code_Block;
class SuperClass{
    public String name = "Super.name";
    public void doWork() {
        System.out.println("Super.doWork");
    }
}
class  SubClass extends SuperClass{
    //字段隐藏
    public String name = "Sub.name";
    //方法覆盖
    public void doWork() {
        System.out.println("Sub.doWork");
    }
}
//字段不存在多态特征
public class FileDemo {
    public static void main(String[] args) {
        SuperClass clz = new SubClass();
        clz.doWork();
        System.out.println(clz.name);
    }
}