package speedGame;

public class InfiniteGas implements ICar {
    ICar car;

    public InfiniteGas(ICar car) {
        this.car = car;
        this.setGas(100);
    }

    @Override
    public void setIntegrity(float integrity) {
        car.setIntegrity(integrity);
    }

    @Override
    public float getIntegrity() {
        return this.car.getIntegrity();
    }

    @Override
    public void setGas(float gas) {
        if (car != null) {
            this.car.setGas(100);
        }
    }

    @Override
    public float getGas() {
        if (car == null) {
            return 0;
        }

        return this.car.getGas();
    }
}
