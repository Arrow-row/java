//使用Lambda表达式（目标类型是Comsumer）遍历集合元素

import java.util.*;

public class IteratorEach{
    public static void main(String[] args){
        HashSet books=new HashSet();
        books.add("2022");
        books.add("0331");
        books.add("15:13"); 
        Iterator it=books.iterator();
        it.forEachRemaining(obj->System.out.println("iterate element: "+obj));
    }
}


/*
 *[root@iZm5e211s4jw7g4w6pgezgZ bin]# java IteratorEach 
iterate element: 15:13
iterate element: 0331
iterate element: 2022

 * */
