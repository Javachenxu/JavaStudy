package JavaStudySpace.day_05.Java5_New_features;

public class forEachDemo {
    public static void main(String[] args) {
        int[] nums = new int[]{10,20,30,40,50,60};
        //用for循环遍历
        for (int index = 0; index < nums.length; index++) {
            System.out.println(nums[index]);
        }
        //用foreach循环遍历
        for (int index : nums) {
            System.out.println(index);
        }
    }
}