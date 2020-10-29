package JavaStudySpace.day_04.array_operation;
//元素出现索引第-次/最后一 次，线性搜索.
public class ArraySearchDemo {
    public static void main(String[] args) {
        int[] arr = { 50, 20, 10, 30, 50, -30, 10 };
        int beginIndex = ArraySearchDemo.indexOf(arr, 10);
        System.out.println("第一次出现的位置："+ beginIndex);
        int lastIndex = ArraySearchDemo.lastIndexOf(arr, 10);
        System.out.println("最后一次出现的位置：" + lastIndex);
        
    }
    /*
    查询key元素在arr数组中第一次出现的位置。
    参数：
        arr：所查询的数组
        key：需要查询的值
    返回：如果key存在于arr数组中，则返回第一次出现的索引，
        key不存在与arr数组中，返回-1
    */
    static int indexOf(int[] arr,int key) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == key) {
                return index;
            }
        }
        return -1;
    }
    static int lastIndexOf(int[] arr,int key) {
        for (int index = arr.length - 1; index >= 0; index--) {
            if (arr[index] == key) {
                return index;
            }
        }
        return -1;
    }
}