package JavaStudySpace.day_04.array_operation;


public class ArrayOperateDemo2 {
    public static void main(String[] args) {
        int[] nums = new int[]{ 1, 3, 5, 7, 9};
        int maxNum = ArrayOperateDemo2.getMax(nums);
        System.out.println("最大值是："+ maxNum );
        int minNum = ArrayOperateDemo2.getMin(nums);
        System.out.println("最小值是：" + minNum);
    }
    //获取数组最大值
    static int getMax(int[] nums) {
        int max = nums[0];
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] > max) {
                max = nums[index];
            }
        }
        return max;
    }
    //获取数组最小值
    static int getMin(int[] nums) {
        int min = nums[0];
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] < min) {
                min = nums[index];
            }
        }
        return min;

    }
}