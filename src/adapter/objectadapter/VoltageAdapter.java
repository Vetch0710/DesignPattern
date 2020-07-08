package adapter.objectadapter;

/**
 * @author Vetch
 * @Description 对象适配器模式----适配器类
 * @create 2020-07-02-21:03
 */
public class VoltageAdapter implements IVoltage5V {
    private Voltage220V v220 ;

    public VoltageAdapter(Voltage220V v220) {
        this.v220 = v220;
    }

    @Override
    public int output5V() {

        int dst =0;
        if (v220!=null){
            int src=v220.output220V();
            dst=src/44;
            System.out.println("适配完成");
        }
        return dst;
    }
}
