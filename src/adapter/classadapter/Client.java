package adapter.classadapter;

/**
 * @author Vetch
 * @Description  测试
 * @create 2020-07-02-21:11
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
