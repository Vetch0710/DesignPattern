package singleton;

/**
 * @author Vetch
 * @Description 懒汉式（线程不安全）
 * @create 2020-07-01-21:11
 */
public class type3 {
    public static void main(String[] args) {
    //测试
    Singleton3 instance = Singleton3.getInstance();
    Singleton3 instance2 = Singleton3.getInstance();
    System.out.println(instance == instance2); // true
    System.out.println("instance.hashCode=" + instance.hashCode());
    System.out.println("instance2.hashCode=" + instance2.hashCode());
}
}


class Singleton3 {
    private static Singleton3 singleton3;

    private Singleton3() {};

    public static Singleton3 getInstance() {
        if (singleton3 == null) {
            singleton3 = new Singleton3();
        }
        return singleton3;
    }
}