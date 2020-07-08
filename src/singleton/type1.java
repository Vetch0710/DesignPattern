package singleton;

/**
 * @author Vetch
 * @Description 饿汉式(静态常量)
 * @create 2020-07-01-20:52
 */
public class type1 {


    public static void main(String[] args) {
        Singleton ss=Singleton.getInstance();
        Singleton sss=Singleton.getInstance();
        System.out.println(ss==sss);
        System.out.println("instance.hashCode=" + ss.hashCode());
        System.out.println("instance.hashCode=" + sss.hashCode());
    }
}


class Singleton {
    //创建静态常量-->singleton对象
    private final static Singleton singleton = new Singleton();

    //私有化构造器，防止new 对象
    private  Singleton(){};

    //公共方法，返回对象实例
    public static Singleton getInstance() {
        return singleton;
    }
}