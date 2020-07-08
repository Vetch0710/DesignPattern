package builder;

/**
 * @author Vetch
 * @Description  抽象的建造者
 * @create 2020-07-02-16:55
 */
public abstract class HouseBuilder {
    protected House house=new House();

    public  abstract  void  buildBasic();
    public  abstract  void  buildWalls();
    public  abstract  void  roofed();
    public  House  buildHouse(){
        return  house;
    }
}
