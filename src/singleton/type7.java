package singleton;

/**
 * @author Vetch
 * @Description 静态内部类
 * @create 2020-07-01-21:11
 */
public class type7 {
    public static void main(String[] args) {
        //测试
        Singleton7 instance = Singleton7.getInstance();
        Singleton7 instance2 = Singleton7.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}


class Singleton7 {

    private Singleton7() {
    }

    //写一个静态内部类，当Singleton7类被加载时，该静态内部类并不会被加载
    private static class SingletonInstance {
        private static final Singleton7 singleton7 = new Singleton7();
    }

    public  static Singleton7 getInstance() {

        return SingletonInstance.singleton7;
    }
}