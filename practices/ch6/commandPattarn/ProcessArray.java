/*
1.ProcessArray：处理数组的处理类
2.process()无法确定处理数组的处理行为，定义该方法时使用了Command参数，Command参数负责对数组的处理行为
3.同Command接口实现ProcessArray 类与具体处理行为分离，程序使用Command接口代表了对数组元素的处理行为
4.这里的ProcessArray与工厂模式的Factory功能类似
*/
public class ProcessArray{
    public void process(int[] target,Command cmd){
        for(int t:target){
            cmd.process(t);
        }
    }
}
