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
LambdaQs$$Lambda$1/471910020@1218025c   //line13:println(e)
the apple tastes not bad    //line26:println("the apple tastes not bad")
driving: LambdaQs$$Lambda$2/142257191@3e3abc88  //line17:println("driving: "+f)
the weather of today: sunny day     //line14:e.taste();line29:println("the weather of today: "+weather)
the helicopter is flying smoothly   //line30:println("the helicopter is flying smoothly")
5+3= 8

***************************************
理解Lambda表达式
1.Lambda表达式就是把函数式接口中的方法实现了，调用该方法时直接将Lambda体看成方法体，传参照样传就是了
例如 执行e.taste(); 跳转到()->System.out.println("the apple tastes not bad");后，System.out.println("the apple tastes not bad")就是接口函数taste()的函数体
2.Lambda生成的对象是LambdaQs$$Lambda$1/471910020@1218025c
3.Lambda 生成的对象类型是对应的函数式接口类型
****************************************

*/
