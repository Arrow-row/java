import java.util.*;
public class CollectionEach{
    public static void main(String[] args){
        HashSet books = new HashSet();
        books.add("2022");
        books.add("0327");
        books.add("21:55");
        books.forEach(obj->System.out.println("element of the iterate set: "+obj));
    }
}

/* 1.forEach()方法自动将集合元素逐个传递给Lambda表达式形参，这样Lambda表达式代码体即可遍历集合元素
 * [root@iZm5e211s4jw7g4w6pgezgZ bin]# java CollectionEach
element of the iterate set: 2022
element of the iterate set: 21:55
element of the iterate set: 0327
*
/
