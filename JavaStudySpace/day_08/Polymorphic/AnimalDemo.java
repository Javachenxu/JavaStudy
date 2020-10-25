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
    }
}