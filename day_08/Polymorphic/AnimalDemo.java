package JavaStudySpace.day_08.Polymorphic;
class Animal{
    public void eat() {
        System.out.println("吃一般的食物");
    }
}
class Dog extends Animal{
    public void eat() {
        System.out.println("吃肉");
    }
}
//饲养员类
class Person{
    public void feed(Animal a) {
        System.out.println("喂食...");
        a.eat();
    }
}
//
class Cat extends Animal{
    public void eat() {
        System.out.println("吃鱼");
    }
}
public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        a = new Cat();
        a.eat();
        //创建饲养员对象
        Person p = new Person();
        Animal d = new Dog();
        p.feed(d);

    }
}