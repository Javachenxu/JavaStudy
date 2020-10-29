package JavaStudySpace.day_05.arraay_Algorithm;

import java.util.Arrays;
//调用Java官方API的数组操作方法
public class ArrayDemo {
    public static void main(String[] args) {
        int[] nums = {1,3,1,2,0,9,6,-3};
        String ret = Arrays.toString(nums);
        System.out.println(ret);
        Arrays.sort(nums);
        String ret1 = Arrays.toString(nums);
        System.out.println(ret1);
        int index = Arrays.binarySearch(nums, 6);
        System.out.println(index);
    }
}