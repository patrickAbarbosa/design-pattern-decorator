package speedGame;

public class Car implements ICar {
    private float integrity;
    private float gas;

    public Car(float integrity, float gas) {
        if (!isValidPercentage(integrity)) {
            throw new IllegalArgumentException("Invalid integrity!");
        }

        if (!isValidPercentage(gas)) {
            throw new IllegalArgumentException("Invalid gas!");
        }

        this.integrity = integrity;
        this.gas = gas;
    }

    private boolean isValidPercentage(float percentage) {
        return percentage >= 0 && percentage <= 100;
    }

    @Override
    public void setIntegrity(float integrity) {
        if (!isValidPercentage(integrity)) {
            throw new IllegalArgumentException("Invalid integrity!");
        }

        this.integrity = integrity;
    }

    @Override
    public float getIntegrity() {
        return this.integrity;
    }

    @Override
    public void setGas(float gas) {
        if (!isValidPercentage(gas)) {
            throw new IllegalArgumentException("Invalid gas!");
        }

        this.gas = gas;
    }

    @Override
    public float getGas() {
        return this.gas;
    }
}
