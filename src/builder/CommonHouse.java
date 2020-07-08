package builder;

/**
 * @author Vetch
 * @Description
 * @create 2020-07-02-16:58
 */
public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("砌墙");

    }

    @Override
    public void roofed() {
        System.out.println("封顶");

    }
}
