package JavaStudySpace.day_04.array_operation;
/*
数组的动态初始化操作：
    由我们设置数组的元素个数(数组长度)，而每一个数组元素的初始值由系统决定
*/
public class ArrayInitDemo2 {
    public static void main(String[] args) {
        int[] nums = new int[3];
        System.out.println(nums);

        nums = new int[5];
        System.out.println(nums);
        nums = null;//此时nums没有引用任何内存空间

    }
}