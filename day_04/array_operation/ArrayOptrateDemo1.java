package JavaStudySpace.day_04.array_operation;

public class ArrayOptrateDemo1 {
    public static void main(String[] args) {
        int[] num1 = new int[]{1,3,5,7,9};
        //数组长度
        System.out.println("数组的长度:"+num1.length);
        //获取index[2]的元素
        System.out.println("第2位置的数据：" + num1[2]);
        //设置元素
        System.out.println("第3位置的原来数据：" + num1[3]);
        num1[3] = 8;
        System.out.println("第3位置的数据：" + num1[3]);
        //遍历元素
        for (int i = 0; i < num1.length; i++) {
            System.out.println("第"+i+"元素是："+num1[i]);
        }
    }
}