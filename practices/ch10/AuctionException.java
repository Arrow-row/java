//定义异常类时通常需要提供两个构造器：一个是无参数的构造器；另一个是带一个字符串参数的构造器

public class AuctionException extends Exception{
    public AuctionException(){}
    public AuctionException(String msg){
        super(msg);
    }
}
