interface Eatable{
    void taste();
}
interface Flyable{
    void fly(String weather);
}
interface Addable{  
    int add(int a,int b);
}

public class LambdaQs{
    public void eat(Eatable e){     //通过Eatable对象调用
        System.out.println(e);
        e.taste();
    }
    public void drive(Flyable f){   //通过Flyable对象调用
        System.out.println("driving: "+f);
        f.fly("sunny day");
    }
    public void test(Addable add){  //通过Addable对象调用
        System.out.println("5+3= "+add.add(5,3));
    }
    public static void main(String [] args){
        LambdaQs lq=new LambdaQs();
        //Lambda表达式的代码块只有一条语句，可以省略花括号
        lq.eat(()->System.out.println("the apple tastes not bad"));
        //Lambda表达式形参列表只有一个形参，可以省略圆括号
        lq.drive(weather->{
            System.out.println("the weather of today: "+weather);
            System.out.println("the helicopter is flying smoothly");
        });
        //代码块中只有一条语句，即使该表达式需要返回值，也可以省略return关键字
        lq.test((a,b)->a+b);
    }
}

/*
[root@iZm5e211s4jw7g4w6pgezgZ classes]# java LambdaQs
LambdaQs$$Lambda$1/471910020@1218025c
the apple tastes not bad
driving: LambdaQs$$Lambda$2/142257191@3e3abc88
the weather of today: sunny day
the helicopter is flying smoothly
5+3= 8
*/
