package JavaStudySpace;

public class ArrayOperateDemo3 {
    public static void main(String[] args) {
        String[] arr = {"A","B","C","D","E"};
        ArrayOperateDemo3.printArray(arr);
        String[] newArr = ArrayOperateDemo3.reverse(arr);
        ArrayOperateDemo3.printArray(newArr);
    }
    //打印数组元素
    static void printArray(String[] arr) {
        if (arr == null) {
            System.out.println("[]");
            return;
        }
        String ret = "[";
        for (int index = 0; index < arr.length; index++) {
            ret += arr[index];
            //如果不是最后一个元素，打印", "
            if (index != arr.length - 1) {
                ret += ", ";
            }
        }
        ret += "]";
        System.out.println(ret);
    }
    //逆序打印数组
    static String[] reverse(String[] oldArr) {
        //存储一个新的数组，存储颠倒之后的元素
        String[] newArr = new String[oldArr.length];
        for (int index = oldArr.length - 1; index >= 0; index--) {
            //
            newArr[oldArr.length - 1 - index] = oldArr[index];
        }
        return newArr;
        
    }
}