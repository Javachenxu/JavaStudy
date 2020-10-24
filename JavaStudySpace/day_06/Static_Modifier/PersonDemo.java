package JavaStudySpace.day_06.Static_Modifier;

public class PersonDemo {
    public static void main(String[] args) {
        System.out.println(Person.totalNum);
        Person p1 = new Person("lucy",18);
        Person p2 = new Person("will",17);
        System.out.println(Person.totalNum); 
        p2.die();
        System.out.println(Person.totalNum);
        Person.destory();
        System.out.println(Person.totalNum);
    }
}
class Person {
    String name;//名称
    int age;//年龄
    static int totalNum = 5;
    //自定义构造器
    Person(String n,int a) {
        name = n;
        age = a;
        totalNum++;
    }
    void die() {
        totalNum--;
        System.out.println("去世");
    }
    static void destory() {
        totalNum = 0;
        System.out.println("人类毁灭");
    }
}