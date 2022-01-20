package speedGame;

public class ArmouredCar implements ICar {
    ICar car;

    public ArmouredCar(ICar car) {
        this.car = car;
        this.setIntegrity(this.car.getIntegrity());
    }

    @Override
    public void setIntegrity(float integrity) {
        float newIntegrity = integrity * 2.5f;

        if(newIntegrity > 100) {
            newIntegrity = 100;
        }

        car.setIntegrity(newIntegrity);
    }

    @Override
    public float getIntegrity() {
        return this.car.getIntegrity();
    }

    @Override
    public void setGas(float gas) {
        if (car != null) {
            this.car.setGas(gas);
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
