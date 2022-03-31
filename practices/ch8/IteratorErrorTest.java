//使用Iterator过程中不可修改元素，否则会引发 java.util.Concurrent ModificationException异常

import java.util.*;

public class IteratorErrorTest{
    public static void main(String[] args){
        HashSet books=new HashSet();
        books.add("2022");
        books.add("0331");
        books.add("14:53");
        Iterator it=books.iterator();
        while(it.hasNext()){
            String book=(String)it.next();
            System.out.println(book);
            if(book.equals("2022")){
                books.remove(book); //引发异常 
            }
        }
    }
}
