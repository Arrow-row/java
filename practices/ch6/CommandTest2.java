public class CommandTest{
       public static void main(String[] args){
           ProcessArray pa = ProcessArray();
           int array = {3,-4,6,4};
           pa.process(array,(int element)->{
                System.out.println("the square of array element: "+element*element);
           });
       }
 }

