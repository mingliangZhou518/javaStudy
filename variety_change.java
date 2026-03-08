package variety_change;
/*
Java的能执行自动类型转换，没有c++那么的严格
 */
public class variety_change {
    public static void main(String[] args) {
     //范围类型小的直接写，会转换为范围类型大的
        //设计一个int型变量
        int a=10;
        //传参给下面的函数
        print1(a);
        print2(a);//传给大的就会自动转化
        print3(a);//传给小的就报错
        //可以强转
        print3((byte)a);
        //但是如果a很大的话就会溢出，数据丢失。小数强转整数会截断小数

    }
    //设计一个参数为int型变量的函数
    public static void print1(int a){}
    //设计一个参数为double型变量的函数
    public static void print2(double a){}
    //设计一个参数为byte类型的函数
    public static void print3(byte a){}
}
