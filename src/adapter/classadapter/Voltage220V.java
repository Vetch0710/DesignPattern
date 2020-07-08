package adapter.classadapter;

/**
 * @author Vetch
 * @Description  被试配类
 * @create 2020-07-02-21:01
 */
public class Voltage220V {
    public  int output220V(){
        int src=220;
        System.out.println("电压为"+src+"V");
        return src;
    }
}
