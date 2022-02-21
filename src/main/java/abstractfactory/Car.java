package abstractfactory;

import factorymethod.Moveable;

/**
 * @author 张志伟
 * @version v1.0
 */
public class Car extends Vehicle{

    @Override
    public void go(){
        System.out.println("Car go......");
    }
}
