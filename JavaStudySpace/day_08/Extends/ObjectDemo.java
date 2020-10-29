package JavaStudySpace.day_08.Extends;
class User{
    private String name;
    private int age;
    User(String name,int age){
        this.name = name;
        this.age = age;
    }
    //覆盖toString(),
    public String toString() {
        return this.name +","+ this.age;
    }
}
public class ObjectDemo {
    public static void main(String[] args) {
        String str1 = new String("AA");
        String str2 = new String("AA");
        System.out.println(str1 == str2);//比较地址
        System.out.println(str1.equals(str2));//比较值
        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1);
        User u1 = new User("will",18);
        System.out.println(u1);
    }
}