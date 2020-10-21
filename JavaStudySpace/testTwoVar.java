package JavaStudySpace;
//交换两个变量值练习
public class testTwoVar {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;
        int temp = 0;
        temp = x;
        x = y;
        y = temp;
        System.out.println(x);
        System.out.println(y);
    }
}