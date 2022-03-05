package proxy.v01;

import java.util.Random;

/**
 * @author 张志伟
 * @version v1.0
 */
public class Tank implements Movable{
    /**
     * 模拟坦克移动
     */
    @Override
    public void move() {
        System.out.println("Tank moving ......");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
interface Movable{
    /**
     * 移动
     */
    void move();
}
