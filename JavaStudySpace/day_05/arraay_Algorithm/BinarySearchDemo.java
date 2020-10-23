package JavaStudySpace.day_05.arraay_Algorithm;

import javax.lang.model.util.ElementScanner6;

//二分查找
public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7, 8};
        BinarySearch(arr, 4);
    }
    static int BinarySearch(int[] arr, int key) {
        int low = 0;//最小的索引
        int high = arr.length - 1;//最大的索引
        while (low <= high) {
            int mid = (low + high) >> 1;
            int midVal = arr[mid];
            if (midVal > key) {//猜打了
                high = mid -1;
            } else if(midVal < key) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}