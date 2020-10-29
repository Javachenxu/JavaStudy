package JavaStudySpace.day_06.Class_And_Object;
//Servant类的测试类
public class ServantDemo {
    public static void main(String[] args) {
        //创建一个菲佣对象
        Servant s1 = new Servant();
        //给菲佣s1起名和设置年龄
        s1.name = "小丽";
        s1.age = 21;
        s1.cook();
        s1.shopping();
        s1.wash();
        System.out.println(s1.name + "," + s1.age);
    }
}
//菲佣类型/描述了菲佣对象/包括了菲佣的状态和行为
class Servant {
    String name;//姓名
    int age;//年龄
    void shopping() {
        System.out.println("买菜");
    }
    void cook() {
        System.out.println("做饭");
    }
    void wash() {
        System.out.println("洗碗");
    }
}