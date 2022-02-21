package factorymethod;

/**
 * @author 张志伟
 * @version v1.0
 */
public class CarFactory {
    public Moveable create(){
        System.out.println("a car created!");
        return new Car();
    }
}
