public class CommandTest2{
       public static void main(String[] args){
           ProcessArray pa = new ProcessArray();
           int[] array = {3,-4,6,4};
           pa.process(array,(int element)->{    //使用Lambda表达式
                System.out.println("the square of array element: "+element*element);
           });
       }
 }

