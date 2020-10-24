package JavaStudySpace.day_07.encapsulation;
//this关键字测试
class User{

    User(){
        System.out.println(this);
    }
    
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
//this关键字
public class ThisDemo {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1);
        u1.setName("永夜");
        String n = u1.getName();
        u1.setAge(18);
        int a = u1.getAge();
        System.out.println(n);
        System.out.println(a);
    }
}