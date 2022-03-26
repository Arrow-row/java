public class CommandTest{
    public static void main(String[] args){
        ProcessArray pa = ProcessArray();
        int target = {3,-4,6,4};
        pa.process(target,new Command(){
            public void process(int element){
                System.out.println("square of the array element: "+element*element);
            }
        });
    }
}
