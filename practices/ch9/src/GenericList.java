import java.util.ArrayList;
import java.util.List;


public class GenericList{
    public static void main(String[] args){
        //1.创建一个只想保存字符串的List
        //2.List<String>:表示List是带一个类型参数的泛型接口，strList不是任意的List,是一个String类型List
        //3.泛型使得集合自动记住所有集合元素的数据类型，从而无须对集合元素进行强制类型转换
        List<String> strList=new ArrayList<String>();   ////4.java7以后，构造器泛型的类型参数信息可以省略 ArrayList<>()
        strList.add("2022");
        strList.add("0325");
        strList.add(5); //编译将出错
        strList.forEach(str->System.out.println(str.length()));

    }
}


/*
 *[root@iZm5e211s4jw7g4w6pgezgZ src]# javac -d ../bin/ GenericList.java 
GenericList.java:13: error: no suitable method found for add(int)
        strList.add(5); //编译将出错
               ^
    method Collection.add(String) is not applicable
      (argument mismatch; int cannot be converted to String)
    method List.add(String) is not applicable
      (argument mismatch; int cannot be converted to String)
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error

 * */
