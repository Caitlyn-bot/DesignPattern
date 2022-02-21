package factorymethod;

/**
 * @author 张志伟
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        Moveable moveable = new CarFactory().create();
        moveable.go();
    }
}
