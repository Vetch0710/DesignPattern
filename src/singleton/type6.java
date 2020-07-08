package singleton;

/**
 * @author Vetch
 * @Description 双重检查
 * @create 2020-07-01-21:11
 */
public class type6 {
    public static void main(String[] args) {
    //测试
    Singleton6 instance = Singleton6.getInstance();
    Singleton6 instance2 = Singleton6.getInstance();
    System.out.println(instance == instance2); // true
    System.out.println("instance.hashCode=" + instance.hashCode());
    System.out.println("instance2.hashCode=" + instance2.hashCode());
}
}


class Singleton6 {
    //singleton6 = new Singleton6();可能会出现指令重排序
    //volatile 可防止指令重排序和内存可见性
    private static volatile Singleton6 singleton6;

    private Singleton6() {};

    public  static Singleton6 getInstance() {
        //第一次判断对象是否为空，当对象不为空时直接返回，不需要等待
        if (singleton6 == null) {
            //同步方法，多个线程线程进入时，每次只能有一个线程执行
            synchronized (Singleton6.class){
                //第二次判断对象是否为空，当第一个线程完成对象初始化时，其他等待初始化的线程直接跳出（）对象已经初始化了
                if (singleton6 == null) {
                    singleton6 = new Singleton6();
                }
            }
        }
        return singleton6;
    }
}