package JavaStudySpace.day_05.Value_Transfer_Mechanism_of_Method_Parameters;

public class ParameterDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[]{10,58,69,37};
        printArray(arr);
        swap(arr);
        printArray(arr);
    }
    //交换数组第一位和最后一位
    static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
    }    
    // 打印数组元素
    static void printArray(int[] arr) {
        if (arr == null) {
            System.out.println("[]");
            return;
        }
        String ret = "[";
        for (int index = 0; index < arr.length; index++) {
            ret += arr[index];
            // 如果不是最后一个元素，打印", "
            if (index != arr.length - 1) {
                ret += ", ";
            }
        }
        ret += "]";
        System.out.println(ret);
    }
}