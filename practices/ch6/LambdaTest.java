/*1.Runnable是Java本身提供的一个函数式接口，接口中只包含一个无参数方法
 *2.Lambda表达式代表的你们方法实现了Runnable接口中唯一的无参数方法
 *3.下面的Lambda表达式创建了一个Runnable对象
 * */

Runnable r=()->{
    for(int i = 0;i<100;i++){
        System.out.println();
    }
};

//使用函数式接口Runnable对Lambda表达式进行强制类型转换
Object obj1=(Runnable)()->{
    for(int i = 0;i<100;i++){
        System.out.println();
    }
};
