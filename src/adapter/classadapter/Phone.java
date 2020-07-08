package adapter.classadapter;

/**
 * @author Vetch
 * @Description  手机
 * @create 2020-07-02-21:08
 */
public class Phone {
    public void charging(IVoltage5V i5) {
        if (i5.output5V() == 5) {
            System.out.println("充电");
        } else {
            System.out.println("不能充电");
        }
    }
}
