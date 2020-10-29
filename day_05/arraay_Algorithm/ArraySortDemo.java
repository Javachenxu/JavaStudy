package JavaStudySpace.day_05.arraay_Algorithm;

public class ArraySortDemo {
    public static void main(String[] args) {
        int[] arr = { 9, 2, 6, 7, 4, 6 };
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
        int[] arr1 = { 3, 2, 1, 7, 4, 8 };
        printArray(arr1);
        selectionSort(arr1);
        printArray(arr1);

    }
    //冒泡排序
    static void bubbleSort(int[] arr) {
        //第一轮
        for (int times = 1; times <= arr.length - 1; times++) {
            for (int i = 1; i <= arr.length - times; i++) {
                if (arr[i - 1] > arr[i]) {
                    swap(arr, i - 1, i);
                }
            }
        }
    }
    
    // 选择排序
    static void selectionSort(int[] arr) {
        for (int times = 1; times <= arr.length -1; times++) {
            for (int i = times; i <= arr.length - 1; i++) {
                if (arr[times - 1] > arr[i]) {
                    swap(arr, times - 1, i);
                }
            }   
        }
        /*
        //第一轮
        for (int i = times; i <= arr.length - 1; i++) {
            if (arr[0] > arr[i]) {
                swap(arr, 0, i);
            }
        }
        //第二轮
        for (int i = 2; i <= arr.length - 1; i++) {
            if (arr[1] > arr[i]) {
                swap(arr, 1, i);
            }
        }
        //第三轮
        for (int i = 3; i <= arr.length - 1; i++) {
            if (arr[2] > arr[i]) {
                swap(arr, 2, i);
            }
        }*/
    }
    //交换模块
    static void swap(int[] arr,int index1,int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
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