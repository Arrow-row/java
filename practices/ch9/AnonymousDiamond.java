//匿名内部类中使用菱形语法

import java.util.*;

interface Foo<T>{
    void test(T t);
}

public class AnonymousTest{
    public static void main(String[] args){
        Foo<String> f=new Foo<>(){  //定义Foo类型变量f，Foo类中泛型为String
            public void test(String t){ //此时test方法参数类型为String 
                System.out.println("the String parameter t of test:"+t);
            }
        };
        Foo<?> fo=new Foo<>(){  //使用泛型通配符，此时相当于通配符上限为Object
            public void test(Object t){ //此时test方法参数类型为Object 
                System.out.println("the Object parameter of test:"+t);
            }
        };
        Foo<? extends Number> fn=new Foo<>(){   //使用泛型通配符，此时相当于通配符上限为Number 
            public void test(Number t){ //此时test方法参数类型为Number
                System.out.println("the Number parameter of test:"+t);
            }
        };
    }
}


