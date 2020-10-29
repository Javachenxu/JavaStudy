package JavaStudySpace.day_08.Extends;
class Animal{
    private String name;
    private int age;
    Animal(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("Animal的构造器");
    }
    //想要在private修饰符下给其它类使用成员变量必须使用getter方法
    public String getNname(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
class Fish extends Animal{
    private String color;
    Fish(String name,int age,String color){
        super(name,age);//先调用了父类Animal构造器,必须用实参
        this.color = color;
        System.out.println("Fish的构造器");
    }
    public void say() {
        System.out.println(getNname() + "," + getAge() + "," + this.color);
    }
}
public class SubClassInitDemo {
    public static void main(String[] args) {
        Fish f = new Fish("尼莫",18,"红色");
        f.say();
    }
}