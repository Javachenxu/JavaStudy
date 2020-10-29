package JavaStudySpace.day_09.Abstract;

abstract class Graph {
    abstract public Double getArea();
}
//圆(circle)
class Circle extends Graph{
    private Integer r;
    Circle(Integer r){
        this.r = r;
    }
    public Double getArea() {
        return 3.14 * r * r;
    }
}
//矩形
class Rectangle extends Graph{
    private Integer width;
    private Integer height;
    Rectangle(Integer width,Integer height){
        this.width = width;
        this.height = height;
    }
    public Double getArea() {
        //将int类型的数据转换为double
        return width.doubleValue() * height.doubleValue();
    }
}
//三角形(Triangle)
class Triangle extends Graph{
    private Integer a;
    private Integer b;
    private Integer c;
    Triangle(Integer a,Integer b,Integer c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Double getArea() {
       Double p = (a + b + c) / 2.0;
       return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

public class GraphDemo {
    public static void main(String[] args) {
        System.out.println(new Circle(10).getArea());
        System.out.println(new Rectangle(7,8).getArea());
        System.out.println(new Triangle(3, 4, 5).getArea());
    }
}