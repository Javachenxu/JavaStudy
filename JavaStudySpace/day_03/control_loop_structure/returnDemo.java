package JavaStudySpace.day_03.control_loop_structure;
//return 语句与 break语句的区别
public class returnDemo {
    public static void main(String[] args) {
        for (int i = 0; i <10; i++) {
            System.out.println("i=" + i);
            if (i == 5) {
                break;
            }
        }
        System.out.println("结束了");//能执行到
        System.out.println("----------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println("i=" + i);
            if (i == 5) {
                //return 直接关闭了main方法。
                return;
            }
        }
        System.out.println("结束了");//不能执行到
    }
}