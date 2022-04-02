public class MultiExceptionTest{
    public static void main(String[] args){
        try{
            Integer a=Integer.parseInt(args[0]);
            Integer b=Integer.parseInt(args[1]); 
            Integer c=a/b;
            System.out.println("the dividing res of the two numbers:"+c);
        }
        catch(IndexOutOfBoundsException|NumberFormatException|ArithmeticException ie){  //多异常用类型 | 分隔
            System.out.println("IndexOutOfBoundsException|NumberFormatException|ArithmeticException i");
            //ie =new ArithmeticException("test");    //捕获多异常时，异常变量默认有final修饰，此行将报错
        }
        catch(Exception e){ 
            System.out.println("UnknownError");
            e=new RuntimeException("test"); //捕获单一异常时，异常变量没有final修饰 
        }
    }
}
