package JavaStudySpace;

public class StringDemo {
    public static void main(String[] args) {
        //
        String username = "你好";
        System.out.println("名字：" + username);
        System.out.println("\"你好世界\"");
        //字符串和任意数据类型数据连接都是一个字符串。
        System.out.println(7 + 8 + "Hello");//15Hello
        System.out.println(7 + "Hello" + 8);//7Hello8
        System.out.println("Hello" + 7 + 8);//Hello78
    }
}