package bridge;

/**
 * @author Vetch
 * @Description  手机类型 抽象类
 * @create 2020-07-03-10:01
 */
public class Phone {
    private  Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }
    protected void open(){
        this.brand.open();
    }
    protected void close(){
        this.brand.close();
    }
    protected void call(){
        this.brand.call();
    }
}
