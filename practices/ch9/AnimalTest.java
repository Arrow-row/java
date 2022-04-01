//泛型通配符测试

import java.util.*;

abstract class Animal{
    abstract int countLegs();
}
class Dog extends Animal{
    public int countLegs(){
        return 1;
    }
}

public class AnimalTest{
    static int countLegs(List<? extends Animal> animals){
        int retVal=0;
        for(Animal animal:animals){
            retVal+=animal.countLegs();
        }
        return retVal;
    }
    static int countLegs1(List<Animal> animals){
        int retVal=0;
        for (Animal animal:animals){
            retVal+=animal.countLegs();
        }
        return retVal;
    }
    public static void main(String[] args){
        List<Dog> dogs=new ArrayList<>();
        countLegs(dogs);    //不会报错
        countLegs1(dogs);   //会报错，泛型的类型参数是父类，传入子类也不行
    }
}

/*
[root@iZm5e211s4jw7g4w6pgezgZ ch9]# javac -d bin/ AnimalTest.java 
AnimalTest.java:32: error: incompatible types: List<Dog> cannot be converted to List<Animal>
        countLegs1(dogs);   //会报错，泛型的类型参数是父类，传入子类也不行
                   ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error

*/
