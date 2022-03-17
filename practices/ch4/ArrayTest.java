/*
1.数组是引用类型，int[]表示一个引用数据类型，int[] a；后，a是一个未指向任何内存的指针
2.数组必须流程：定义-->初始化-->使用，初始化意味着分配内存空间，并且赋值，（不能只分配内存不赋值，null也是一个值）
3.数组初始化有动态初始化和静态初始化两种
*/


//静态初始化：由程序员指定每个数组元素的初始值，由系统决定数组长度
int[] intArr;
intArr=new int[] {5,6};	
Object[] objArr;
objArr=new String[] {"Java","hat"};	//静态初始化，数组类型是定义数组时类型的子类
Object[] objArr2;
objArr2=new Object[] {"java"};	//静态初始化
int[] a={1,2,3};	//数组定义和初始化同时完成，实际中更常见


//动态初始化：程序员只指定数组长度，由系统为数组元素分配初始值
int[] prices = new int[5];
Object[] books=new String[4];
