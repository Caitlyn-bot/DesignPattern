package abstractfactory;

/**
 * 抽象工厂
 * @author 张志伟
 * @version v1.0
 */
public abstract class AbstractFactory {
    abstract Food createFood();
    abstract Vehicle createVehicle();
    abstract Weapon createWeapon();
}
