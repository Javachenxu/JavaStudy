package JavaStudySpace.day_06.Constructor;

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person("will");
        System.out.println(p1.name);
    }
}
class Person {
    String name = null;
    //自定义构造器
    Person(String n) {
        System.out.println("--------AAAAA-------");
        name = n;
    }
}