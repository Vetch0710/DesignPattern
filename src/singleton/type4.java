package singleton;

/**
 * @author Vetch
 * @Description 懒汉式（线程安全,同步方法）
 * @create 2020-07-01-21:11
 */
public class type4 {
    public static void main(String[] args) {
    //测试
    Singleton4 instance = Singleton4.getInstance();
    Singleton4 instance2 = Singleton4.getInstance();
    System.out.println(instance == instance2); // true
    System.out.println("instance.hashCode=" + instance.hashCode());
    System.out.println("instance2.hashCode=" + instance2.hashCode());
}
}


class Singleton4 {
    private static Singleton4 singleton4;

    private Singleton4() {};

    public synchronized static Singleton4 getInstance() {
        if (singleton4 == null) {
            singleton4 = new Singleton4();
        }
        return singleton4;
    }
}