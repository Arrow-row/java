public class SquareCommand implements Command{
    public void process(int element){
        System.out.println("the square of array element: "+element*element);
    }
}
