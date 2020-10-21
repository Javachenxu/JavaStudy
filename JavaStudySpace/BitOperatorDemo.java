package JavaStudySpace;
//位运算符
public class BitOperatorDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(a & b);//1
        /*
        a:0b00000101
      & b:0b00000011
      ----------------
          0b00000001
        */
        System.out.println(a | b);//7
        /*
        a:0b00000101 
      | b:0b00000011 
      ---------------- 
          0b00000111
         */
        System.out.println(a ^ b);//6
        /*
        a:0b00000101 
      ^ b:0b00000011 
      ---------------- 
          0b00000110
         */
        System.out.println(~a);//-6
        /*
        a:0b00000101 
       ~ 
          ----------------
          0b11111010
         */
        //操作负数 :得到原码--》反码--》补码--》操作
        //-6 原码：除符号位取绝对值，反码：正数就是本身、负数除符号位其它位取反，补码：正数的补码等于他的原码、负数的补码等于反码+1。
        //原码：0b10000110
        //反码：0b11111001
        //补码：0b11111010
    //~
    //---------------------
        //      0b00000101
        System.out.println(~-6);
        int num = 2;
        System.out.println(num << 3);//16
        System.out.println(16 >> 3);//1
        System.out.println(16 >>> 3);
    }
}