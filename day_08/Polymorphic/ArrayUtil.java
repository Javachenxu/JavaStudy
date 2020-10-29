package JavaStudySpace.day_08.Polymorphic;

public class ArrayUtil {
    static void selectionSort(int[] arr) {
        for (int times = 1; times <= arr.length - 1; times++) {
            for (int i = times; i <= arr.length - 1; i++) {
                if (arr[times - 1] > arr[i]) {
                    swap(arr, times - 1, i);
                }
            }
        }
    }

    // 交换模块
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}