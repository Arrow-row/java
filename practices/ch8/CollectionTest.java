import java.util.*;

public class CollectionTest{
    public static void main(String[] args){
        ArrayList c=new ArrayList();
        c.add("2022");
        c.add(6);   //集合中不能放置基本类型，但java支持自动装箱
        System.out.println("element size in coliection c: "+c.size());
        c.remove(6);
        System.out.println("element size in coliection c: "+c.size());


    }
}
