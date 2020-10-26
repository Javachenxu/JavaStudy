package JavaStudySpace.day_09.code_Block;

public class CodeBlockDemo {
    //初始化代码块
    {
        System.out.println("初始化代码块");
    }
    CodeBlockDemo(){
        System.out.println("构造器执行");
    }
    //静态代码块
    static{
        System.out.println("静态代码块");
    }
    public static void main(String[] args) {
        System.out.println("进入mian方法");
        new CodeBlockDemo();
        new CodeBlockDemo();
        new CodeBlockDemo();
    }
}