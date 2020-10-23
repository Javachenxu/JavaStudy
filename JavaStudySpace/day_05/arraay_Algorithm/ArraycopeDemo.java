package JavaStudySpace.day_05.arraay_Algorithm;

public class ArraycopeDemo {
    public static void main(String[] args) {
        int[] src = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] dest = new int[10];
        printArray(dest);
        //copy(src, 2, dest, 5, 4);
        System.arraycopy(src, 2, dest, 5, 4);
        // 需求：从src数组中拷贝3,4,5,6元素到dest数组
        printArray(dest);
    }
    static void copy(int[] src,int srcPos,int[] dest,int destPos,int length) {
        
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
}