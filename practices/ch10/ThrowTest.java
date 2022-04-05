public class ThrowTest{
    public static void main(String[] args){
        try{
            //调用声明抛出Checked异常的方法throwChecked(),需要捕获该异常或者在主调函数中再次声明抛出
            //这里的处理方式是用try-catch进行捕获
            throwChecked(3);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        //调用声明抛出Runtime异常(非Checked异常)的方法throwRuntime(),，可以显示捕获该异常，也可不做处理
        throwRuntime(3);
    }
    public static void throwChecked(int a) throws Exception{
        if(a>0){
            throw new Exception("out of specification");
        }
    }
    public static void throwRuntime(int a){
        if(a>0){
            throw new RuntimeException("out of specification");
        }
    }

}

/*[root@iZm5e211s4jw7g4w6pgezgZ bin]# java ThrowTest 
out of specification
Exception in thread "main" java.lang.RuntimeException: out of specification
	at ThrowTest.throwRuntime(ThrowTest.java:22)
	at ThrowTest.main(ThrowTest.java:13)

 *
 * */
