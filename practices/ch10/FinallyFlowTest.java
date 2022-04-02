public class FinallyFlowTest{
    public static void main(String[] args){
        throws Exception{
            Boolean a = test();
            System.out.println(a);
         }
    }
    public static boolean test(){
        try{
            return true;    //finally块中包含return 语句，此条将失去作用
        }
        finally{
            return false;   //应经历避免在finally中使用return或throw，会导致方法终止，且不会再返回try块
        }
    }
}
