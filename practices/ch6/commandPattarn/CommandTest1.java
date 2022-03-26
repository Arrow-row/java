public class CommandTest1{
    public static void main(String[] args){
        ProcessArray pa = new ProcessArray();
        int[] target = {3,-4,6,4};
        pa.process(target,new Command(){    //匿名内部类
            public void process(int element){
                System.out.println("square of the array element: "+element*element);
            }
        });
    }
}

/*
 *[root@iZm5e211s4jw7g4w6pgezgZ bin]# java CommandTest1
the square of array element: 9
the square of array element: 16
the square of array element: 36
the square of array element: 16

 * */
