package JavaStudySpace.day_09.Abstract;
//模板方法设计模式
//统计String连接10000次和int相加10000次的时间差
//操作的模板类
abstract class OperateTimeTempate{
    //模板方法:总体算法的骨架，子类不能修改
    final public long getTotalTime() {
        long begin = System.currentTimeMillis();// 开始时间
        this.dowork();
        long end = System.currentTimeMillis();
        long time = end - begin;
        return time;
    }
    //具体操作
    protected abstract void dowork();
}
//String的连接10000次
class StringOperate extends OperateTimeTempate{
    protected void dowork() {
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += i;
        }
    }
    
}
//int 相加10000次
class IntOperate extends OperateTimeTempate{
    protected void dowork() {
        int n = 0;
        for (int i = 0; i < 10000; i++) {
            n += i;
        }
    }
}
public class TemplateMethodDemo {
    public static void main(String[] args) {
         System.out.println(new StringOperate().getTotalTime());
         System.out.println(new IntOperate().getTotalTime());
    }
}