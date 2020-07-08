package bridge;

/**
 * @author Vetch
 * @Description
 * @create 2020-07-03-10:14
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new FoldedPhone(new XiaoMi());
        phone.open();
        phone.call();
        phone.close();
    }
}

