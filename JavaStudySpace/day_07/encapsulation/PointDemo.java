package JavaStudySpace.day_07.encapsulation;
//点对象
class Point{
    private int x;//横坐标
    private int y;//纵坐标
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
//圆对象
class Circle{
    private int r;
    Circle(int r){
        this.r = r;
    }
    int judge(Point p) {
        int xxyy = p.getX() * p.getX() + p.getY() * p.getY();
        int rr = this.r * this.r;
        if (xxyy > rr) {
            return 1;
        } else if (xxyy < rr) {
            return -1;
        } else {
            return
        } 
    }
}
public class PointDemo {
    public static void main(String[] args) {
        //创建一个点对象
        Point p = new Point(3,4);
        Circle r = new Circle(5);
        int ret = r.judge(p);
        System.out.println(ret);
    }
}