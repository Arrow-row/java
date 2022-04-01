//编译时不检查类型导致异常
import java.util.ArrayList;

public class ListErr{
    public static void main(String[] args){
        //创建一个只想保存字符串的List集合
        ArrayList strList=new ArrayList();
        strList.add("2022");
        strList.add("0325");
        //不小心加入了Integer对象
        strList.add(5);
        strList.forEach(str -> System.out.println(((String) str).length()));


    }
}

/*
 *[root@iZm5e211s4jw7g4w6pgezgZ src]# javac -d ../bin/ ListErr.java 
Note: ListErr.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
 *
 * */
