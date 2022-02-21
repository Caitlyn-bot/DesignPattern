package abstractfactory;


/**
 * @author 张志伟
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory f = new ModernFactory();
        Vehicle c = f.createVehicle();
        c.go();
        Food b = f.createFood();
        b.printName();
        Weapon a = f.createWeapon();
        a.shoot();
    }
}
