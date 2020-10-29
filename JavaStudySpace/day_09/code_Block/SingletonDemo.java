package JavaStudySpace.day_09.code_Block;


//单例设计模式(饿汉式)
class ArrayUtil{
    //(1)必须在该类中，自己先创建一个对象。
    private static final ArrayUtil instance = new ArrayUtil();
    //(2)私有化自身的构造器，防止外界通过构造器创建新的对象
    private ArrayUtil(){}
    //(3)给外界暴露一个共有的静态方法用于获取自身的对象
    public static ArrayUtil getInstance() {
        return instance;
    }

    public void sort(int[] arr) {
        System.out.println("排序操作");
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        ArrayUtil.getInstance().sort(null);
    }
}