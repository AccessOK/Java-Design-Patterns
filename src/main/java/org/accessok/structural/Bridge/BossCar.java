package org.accessok.structural.Bridge;

public class BossCar extends RefinedCar{
    public BossCar(Engine engine) {
        super(engine);
    }
    @Override
    public String getBrand() {
        return "Boss Car";
    }
}
