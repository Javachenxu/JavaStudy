package JavaStudySpace.day_05.Value_Transfer_Mechanism_of_Method_Parameters;

public class ParameterDemo1 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("main方法前，x=" + x);//10
        change(x);
        System.out.println("main方法后，x=" + x);//10
    }
    static void change(int x) {
        System.out.println("change方法前，x=" + x);//10
        x = 50;
        System.out.println("change方法后，x=" + x);//50
    }
}