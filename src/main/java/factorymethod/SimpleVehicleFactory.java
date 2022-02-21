package factorymethod;

/**
 * 简单工厂的扩展性不好
 * @author 张志伟
 * @version v1.0
 */
public class SimpleVehicleFactory {
    public Car creatCar(){
        //before processing
        return new Car();
    }

    public Plane createPlane(){
        return new Plane();
    }
}
