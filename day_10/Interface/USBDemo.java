package JavaStudySpace.day_10.Interface;
//指定USB规范
interface IUSB{
    void swapDate();
}
//USB版本鼠标
class Mouse implements IUSB{
    public void swapDate() {
        System.out.println("鼠标移动");
    }
}
//USB版本打印机
class Print implements IUSB{
    public void swapDate() {
        System.out.println("打印");
    }
}
class MotherBoard {
    private static IUSB[] usbs = new IUSB[6];
    private static int index = 0;//表示插入到第几个位置

    //把设备插入到主板中的功能，接收IUSB类型的对象
    public static void pluginIn(IUSB usb) {
        if (index == usbs.length) {
            System.out.println("插槽已经用完");
            return;
        }
        usbs[index] = usb;
        index++;
    }
    //取出主板中的每一个USB设备并工作
    public static void dowork() {
        for (IUSB usb : usbs) {
            if (usb != null) {
                usb.swapDate();
            }
        }
    }

}
public class USBDemo {
    public static void main(String[] args) {
        //创建鼠标
         MotherBoard.pluginIn(new Mouse());
         //创建打印机
         MotherBoard.pluginIn(new Print());
         
         //调用主板
         MotherBoard.dowork();
         MotherBoard.dowork();
         

    }

}