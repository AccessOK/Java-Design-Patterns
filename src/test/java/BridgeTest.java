import org.accessok.structure.EBridge.BossCar;
import org.accessok.structure.EBridge.HybridEngine;
import org.junit.Test;

public class BridgeTest {
    //如果要增加一种引擎，只需要针对Engine派生一个新的子类
    //如果要增加一个品牌，只需要针对RefinedCar派生一个子类
    //任何RefinedCar的子类都可以和任何一种Engine自由组合
    //即一辆汽车的两个维度：品牌和引擎都可以独立地变化。
    @Test
    public void BridgeTest() {
        BossCar car=new BossCar(new HybridEngine());
        car.drive();
        car.getBrand();
    }
}
