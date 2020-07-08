package singleton;

/**
 * @author Vetch
 * @Description 饿汉式(静态代码块)
 * @create 2020-07-01-20:52
 */
public class type2 {


    public static void main(String[] args) {
        Singleton2 ss = Singleton2.getInstance();
        Singleton2 sss = Singleton2.getInstance();
        System.out.println(ss == sss);
        System.out.println("instance.hashCode=" + ss.hashCode());
        System.out.println("instance.hashCode=" + sss.hashCode());
    }
}


class Singleton2 {
    //创建静态常量-->singleton对象
    private final static Singleton2 singleton;

    //在静态代码块中初始化
    static {
        singleton = new Singleton2();
    }

    //私有化构造器，防止new 对象
    private Singleton2() {};



    //公共方法，返回对象实例
    public static Singleton2 getInstance() {
        return singleton;
    }
}