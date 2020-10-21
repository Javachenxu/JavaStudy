package JavaStudySpace;
/**
 * 需求：给出一共有46条数据，要求每一页最多有10条数据
 * 计算：一共有多少页？
 * 上一页：
 * 下一页
 */
public class Pagedemo {
    public static void main(String[] args) {
        int totalCount = 46;
        int pageSize = 10;
        //总页数：
        int totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
        System.out.println(totalPage);
        //驻留页数
        int currentPage = 2;
        //上一页：
        int lastPage = currentPage -1 >= 1 ? currentPage - 1 : 1;
        System.out.println(lastPage);
        //下一页
       
    }
}