package JavaStudySpace.day_06.Class_And_Object;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "赵一";
        s1.isFee = true;
        Student s2 = new Student();
        s2.name = "钱二";
        Student s3 = new Student();
        s3.name = "张三";
        s3.isFee = false;
        Student s4 = new Student();
        s4.name = "李四";
        s4.isFee = true;

        Student[] arr = new Student[]{s1,s2,s3,s4};
        for (Student ele : arr) {
            System.out.println(ele.isFee);
            if (!ele.isFee) {
                ele.fees();
            }
        }
        for (Student ele : arr) {
            System.out.println(ele.isFee);
        }
    }
}
class Student{
    String name;
    boolean isFee;
    void fees() {
        isFee = true;
    }
}