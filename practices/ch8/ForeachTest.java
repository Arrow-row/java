//使用foreach遍历集合

import java.util.*;

public class ForeachTest{
    public static void main(String[] args){
        HashSet books=new HashSet();
        books.add("2022");
        books.add("0331");
        books.add("15:29"); 
        for(Object obj:books){  //放进集合里面的元素，都会失去原来本身的类型变成Object类型
            String book=(String) obj;
            System.out.println(book);
        }
    }
}


/*
 *1.foreach语法格式：
for(ElementType  var : obj){
    引用了var的java语句;
}

obj是前面定义过的集合名称
ElementType是obj中的类型
var是符号标识符规则的新变量名


 *
 *[root@iZm5e211s4jw7g4w6pgezgZ bin]# java ForeachTest 
15:29
0331
2022
 *
 * */
