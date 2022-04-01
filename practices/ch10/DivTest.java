//常见的三种运行时异常
//须记住异常类型及触发异常的常见场景

public class DivTest{
    public static void main(String[] args){
        try{
            Integer a=Integer.parseInt(args[0]);
            Integer b=Integer.parseInt(args[1]); 
            Integer c=a/b;
            System.out.println("the result of dividing the two numbers that you input:"+c);
        }
        catch(IndexOutOfBoundsException ie){
            System.out.println("IndexOutOfBoundException"); //参数不够时数组越界异常
        }
        catch(NumberFormatException ne){
            System.out.println("NumberFormatException");    //参数非数字时，数字格式异常
        }
        catch(ArithmeticException ae){
            System.out.println("ArithmeticException");      //第二个参数是0，除0异常
        }
        catch(Exception e){
            System.out.println("UnknownException");         //其他异常，对象总是Exception类或其子类的实例
        }
    }
}
