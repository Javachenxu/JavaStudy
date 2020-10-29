package JavaStudySpace.day_08.Extends;
//方法覆盖演示
//普通的鸟类
class bird{
    public void fly() {
        System.out.println("能飞");
    }
}
//企鹅类
class Penguin extends bird{
    public void fly() {
        System.out.println("不能飞");
    }
    public void say() {
        System.out.println("唱歌");
        super.fly();
    }
}
public class OverrideDemo {
    public static void main(String[] args) {
        Penguin p = new Penguin();
        p.say();

    }
}