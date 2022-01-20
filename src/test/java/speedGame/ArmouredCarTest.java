package speedGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmouredCarTest {
    @Test
    public void shouldReturnGreaterIntegrity() {
        ICar car = new ArmouredCar(new Car(20f, 45f));

        assertEquals(50f, car.getIntegrity());
    }

    @Test
    public void shouldBePossibleModifyIntegrity() {
        ICar car = new ArmouredCar(new Car(20f, 45f));
        car.setIntegrity(30);

        assertEquals(75f, car.getIntegrity());
    }

    @Test
    public void shouldReturnIntegrity() {
        ICar car = new ArmouredCar(new Car(80f, 95f));

        assertEquals(100f, car.getIntegrity());
    }

    @Test
    public void shouldReturnGas() {
        ICar car = new ArmouredCar(new Car(80f, 95f));

        assertEquals(95f, car.getGas());
    }

    @Test
    public void shouldUpdateGas() {
        ICar car = new ArmouredCar(new Car(80f, 95f));

        car.setGas(10f);
        assertEquals(10f, car.getGas());
    }

    @Test
    public void shouldFailIfUsesLessThanZeroGas() {
        try {
            ICar car = new ArmouredCar(new Car(90f, -5f));
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid gas!", e.getMessage());
        }
    }

    @Test
    public void shouldFailIfPassesGasGreaterThanOneHundred() {
        try {
            ICar car = new ArmouredCar(new Car(90f, 101f));
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid gas!", e.getMessage());
        }
    }

    @Test
    public void shouldFailIfUsesLessThanZeroIntegrity() {
        try {
            ICar car = new ArmouredCar(new Car(-1f, 0f));
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid integrity!", e.getMessage());
        }
    }
}