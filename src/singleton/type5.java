package singleton;

/**
 * @author Vetch
 * @Description 懒汉式（线程安全,同步方法）
 * @create 2020-07-01-21:11
 */
public class type5 {
    public static void main(String[] args) {
    //测试
    Singleton5 instance = Singleton5.getInstance();
    Singleton5 instance2 = Singleton5.getInstance();
    System.out.println(instance == instance2); // true
    System.out.println("instance.hashCode=" + instance.hashCode());
    System.out.println("instance2.hashCode=" + instance2.hashCode());
}
}


class Singleton5 {
    private static Singleton5 singleton5;

    private Singleton5() {};

    public  static Singleton5 getInstance() {
        if (singleton5 == null) {
            synchronized (Singleton5.class){
                singleton5 = new Singleton5();
            }
        }
        return singleton5;
    }
}