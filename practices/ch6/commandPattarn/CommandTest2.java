public class CommandTest2{
       public static void main(String[] args){
           ProcessArray pa = new ProcessArray();
           int[] array = {3,-4,6,4};
           pa.process(array,(int element)->{    //使用Lambda表达式
                System.out.println("the square of array element: "+element*element);
           });
       }
 }

/*
[root@iZm5e211s4jw7g4w6pgezgZ bin]# java CommandTest2
the square of array element: 9
the square of array element: 16
the square of array element: 36
the square of array element: 16
*/
