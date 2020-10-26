package JavaStudySpace.day_08.Polymorphic;

public class CombinationDemo {
    private ArrayUtil util = new ArrayUtil();
    public void test() {
        int[] arr = {-2,9,1,0,5};
        util.selectionSort(arr);
    }
    public static void main(String[] args) {
        new CombinationDemo().test();
    }
}