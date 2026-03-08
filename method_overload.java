package method_overload;
/*
c++里面叫做函数重载，到java里面就变成了方法重载，反正重载的形式是一样的
 */
public class method_overload {
    public static void main(String[] args) {


    }
    //java的方法重载情况
    //个数不同
    public static void show(){
        System.out.println("无参方法");
        return;
    }
    //有参但是个数不同
    public static void show(int a){}
    //两个参数
    public static void show(int a,int b){}
    //多个参数
    public static void show(int a,int b,int c){}
    //参数类型不同
    public static void show(double a){}
    //byte型
    public static void show(byte a){}
    //long型
    public static void show(long a){}
    //参数的顺序不同
    public static void show(int a,double b){}
    //交换顺序
    public static void show(double b,int a){}



}
