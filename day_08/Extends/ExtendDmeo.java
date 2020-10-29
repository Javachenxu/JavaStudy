package JavaStudySpace.day_08.Extends;
//普通人类
class Person{
    public String name;
    protected int age;
    public void sleep() {
        System.out.println("睡着");
    }
}
//学生类
class Student extends Person{
    
    String sn;
}
//老师类
class Teacher extends Person{

    private String level;
}
//员工类
class Employee extends Person{
    String hireDate;//入职时间
}
public class ExtendDmeo {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.sleep();
    }
}