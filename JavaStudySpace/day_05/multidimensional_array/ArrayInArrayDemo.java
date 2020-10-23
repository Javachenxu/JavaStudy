package JavaStudySpace.day_05.multidimensional_array;
//多维数组遍历
public class ArrayInArrayDemo {
    public static void main(String[] args) {
        //静态初始化
        int[][] arr = new int[][] {
            {1,2,3},
            {4,5},
            {6}
        };
        //动态初始化
        //int[][] arr2 = new int[3][3] ;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}