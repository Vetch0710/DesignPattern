package singleton;

/**
 * @author Vetch
 * @Description 静态内部类
 * @create 2020-08-01-21:11
 */
public class type8 {
    public static void main(String[] args) {
        Singleton8 ss = Singleton8.INSTANCE;
        Singleton8 sss = Singleton8.INSTANCE;
        System.out.println(ss == sss);
    }
}

//使用枚举
enum Singleton8 {
    INSTANCE;

    public void say() {
        System.out.println("ok");
    }


}