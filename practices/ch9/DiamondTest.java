//菱形语法:使用构造器时省略<>中的参数类型

import java.util.*;

public class DiamondTest{
    public static void main(String[] args){
        List<String> books = new ArrayList<>();  //使用构造器省略<>中的参数类型
        books.add("2022");
        books.add("0401");
        books.forEach(ele->System.out.println(ele.length()));
        Map<String,List<String>> schoolsInfo=new HashMap<>();
        List<String> schools=new ArrayList<>();
        schools.add("15:00");
        schools.add("15:01");
        schoolsInfo.put("arrow",schools);
        //遍历Map时，Map的key是String类型，value是List<String>类型
        schoolsInfo.forEach((key,value)->System.out.println(key+"-->"+value));
    }
}



/*
 *[root@iZm5e211s4jw7g4w6pgezgZ bin]# java DiamondTest 
4
4
arrow-->[15:00, 15:01]

 * */
