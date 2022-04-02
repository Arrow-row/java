import java.io.*;

public class FinallyTest{
    public static void main(String[] args){
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("a.txt");
        }
        catch(IOException ioe){
            System.out.println(ioe.getMessage());
            return; //return语句强制方法返回,finally代码会执行
            //System.exit(1);   //使用exit退出虚拟机,finally代码不会执行
        }
        finally{
            //关闭磁盘文件，回收资源
            if(fis!=null){
                try{
                    fis.close();
                }
                catch(IOException ioe){
                    ioe.printStackTrace();
                }
            }
            System.out.println("excute resource collection in finally block");

        }
    }
}

/*
[root@iZm5e211s4jw7g4w6pgezgZ bin]# java FinallyTest
a.txt (No such file or directory)
excute resource collection in finally block
*/
