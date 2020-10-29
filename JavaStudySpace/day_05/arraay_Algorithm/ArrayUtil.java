package JavaStudySpace.day_05.arraay_Algorithm;

public class ArrayUtil {

    static void copy(int[] src, int srcPos, int[] dest, int destPos, int length) {

        for (int index = srcPos; index < srcPos + length; index++) {
            dest[destPos] = src[index];
            destPos++;
        }
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
    
    // 逆序打印数组
    static String[] reverse(String[] oldArr) {
        // 存储一个新的数组，存储颠倒之后的元素
        String[] newArr = new String[oldArr.length];
        for (int index = oldArr.length - 1; index >= 0; index--) {
            //
            newArr[oldArr.length - 1 - index] = oldArr[index];
        }
        return newArr;

    }
    
    // 冒泡排序
    static void bubbleSort(int[] arr) {
        // 第一轮
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
    }
    
    // 交换模块
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
    // 获取数组最大值
    static int getMax(int[] nums) {
        int max = nums[0];
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] > max) {
                max = nums[index];
            }
        }
        return max;
    }

    // 获取数组最小值
    static int getMin(int[] nums) {
        int min = nums[0];
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] < min) {
                min = nums[index];
            }
        }
        return min;
    }
    
    static int indexOf(int[] arr, int key) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == key) {
                return index;
            }
        }
        return -1;
    }

    static int lastIndexOf(int[] arr, int key) {
        for (int index = arr.length - 1; index >= 0; index--) {
            if (arr[index] == key) {
                return index;
            }
        }
        return -1;
    }
}