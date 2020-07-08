package adapter.classadapter;

/**
 * @author Vetch
 * @Description  适配器类
 * @create 2020-07-02-21:03
 */
public class VoltageAdapter  extends Voltage220V implements  IVoltage5V {

    @Override
    public int output5V() {
        int src=output220V();
        int dst=src/44;
        return dst;
    }
}
