package JavaStudySpace.day_10.Interface;
//爬行动物接口
interface TWalkable{
    void walk();
}
//水生动物接口
interface TSwimable{
    void swim();
}
//两栖动物接口
interface Amphibiousable extends TSwimable,TWalkable{

}
//猫
class Cat implements TWalkable{
    public void walk() {
        System.out.println("走路");
    }
}
class Animal{

}
//青蛙(类多实现接口)
class Frog extends Animal implements TSwimable,TWalkable{
    public void swim() {
        System.out.println("蛙泳");
    }
    
    public void walk() {
        System.out.println("跳");
    }
}
//鱼
class Fish implements TSwimable{
    public void swim() {
        System.out.println("游泳");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        TWalkable c = new Cat();//面向接口编程，存在多态
        c.walk();//体现多态特征：执行Cat类中的walk方法
        TSwimable f = new Fish();
        f.swim();
        Frog frog = new Frog();
        frog.swim();
        frog.walk();

    }
}