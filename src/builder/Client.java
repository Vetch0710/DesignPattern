package builder;

/**
 * @author Vetch
 * @Description
 * @create 2020-07-02-17:17
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        //准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        //完成盖房子，返回产品
        House house = houseDirector.constructHouse();

    }
}
