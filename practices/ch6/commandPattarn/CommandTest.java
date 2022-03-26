public class CommandTest{
    public static void main(String[] args){
        ProcessArray pa=new ProcessArray();
        int[] target={3,-4,6,4};
        pa.process(target,new PrintCommand());
        System.out.println("------------------");
        pa.process(target,new SquareCommand());

        
    }
}
/*
[root@iZm5e211s4jw7g4w6pgezgZ bin]# java CommandTest
print out the array element itearately: 3
print out the array element itearately: -4
print out the array element itearately: 6
print out the array element itearately: 4
------------------
the square of array element: 9
the square of array element: 16
the square of array element: 36
the square of array element: 16
*/
