package bridge;

/**
 * @author Vetch
 * @Description  手机类型 具体子类
 * @create 2020-07-03-10:06
 */
public class FoldedPhone extends Phone{


    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("折叠手机");
    }
    public void close(){
        super.close();
        System.out.println("折叠手机");
    }
    public void call(){
        super.call();
        System.out.println("折叠手机");
    }
}
