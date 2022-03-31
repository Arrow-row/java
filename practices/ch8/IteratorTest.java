//通过Iterator接口遍历集合元素

import java.util.*;
public class IteratorTest{
    public static void main(String[] args){
        HashSet books=new HashSet();
        books.add("2022");
        books.add("0330");
        books.add("23:26");
        Iterator it=books.iterator();    //获取books集合的迭代器,iterator()返回对象是Iterator类型
        while (it.hasNext()){
            String book=(String)it.next();  //it.next()返回的数据类型是Object,需要强制类型转换
            System.out.println(book);
            if(book.equals("2022")){
                it.remove();    //从集合中删除上一次next()方法返回的元素
            }
            book="666"; //对book变量赋值，不会改变集合元素本身
        }
        System.out.println(books);
    }
}

/*理解Iteratoe
 * 1.Iterator本身不存储对象，使用它需要依附于Collection对象
 * 2.Iterator并不是把集合元素本身传递给迭代变量，而是把集合元素的值传给迭代变量,修改迭代变量的值对集合元素本身没有影响，如 line17
 *
 *
 * [root@iZm5e211s4jw7g4w6pgezgZ bin]# java IteratorTest
23:26
0330
2022
[23:26, 0330]

 * */
