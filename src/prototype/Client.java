package prototype;

/**
 * @author Vetch
 * @Description  原型模式解决克隆羊问题
 * (现在有一只羊tom ， 姓名为 : tom, 年龄为 ： 1 ， 颜色为 ： 白色 ， 请编写程序创建和tom羊属性完全相同的10只羊 )
 * @create 2020-07-02-10:33
 */
public class Client {
    public static void main(String[] args) {
//        //传统模式
//        Sheep sheep1 = new Sheep("tom", 1, "白色");
//        Sheep sheep2 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
//        Sheep sheep3 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
//        Sheep sheep4 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
//        Sheep sheep5= new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
//        //....
//
        //原型模式
        Sheep sheep1 = new Sheep("tom", 1, "白色");

        Sheep clone = (Sheep)sheep1.clone();
        Sheep clone2 = (Sheep)sheep1.clone();
        Sheep clone3 = (Sheep)sheep1.clone();
        Sheep clone4 = (Sheep)sheep1.clone();
        System.out.println(clone);
        System.out.println(clone2);
        System.out.println(clone3);
        System.out.println(clone4);
        sheep1.setAge(12);
        System.out.println("--------------"+clone4);
        System.out.println("--------------"+sheep1);
    }
}
