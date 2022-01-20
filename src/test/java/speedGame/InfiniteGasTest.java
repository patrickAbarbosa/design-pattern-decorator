package speedGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfiniteGasTest {
    @Test
    public void shouldReturnIntegrity() {
        ICar car = new InfiniteGas(new Car(80f, 95f));

        assertEquals(80f, car.getIntegrity());
    }

    @Test
    public void shouldReturnGas() {
        ICar car = new InfiniteGas(new Car(80f, 30f));

        assertEquals(100, car.getGas());
    }

    @Test
    public void shouldUpdateIntegrity() {
        ICar car = new InfiniteGas(new Car(80f, 95f));

        car.setIntegrity(54f);
        assertEquals(54f, car.getIntegrity());
    }

    @Test
    public void shouldUpdateGas() {
        ICar car = new InfiniteGas(new Car(80f, 95f));

        car.setGas(10f);
        assertEquals(100f, car.getGas());
    }

    @Test
    public void shouldFailIfUsesLessThanZeroIntegrity() {
        try {
            ICar car = new InfiniteGas(new Car(-1f, 0f));
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid integrity!", e.getMessage());
        }
    }

    @Test
    public void shouldFailIfPassesIntegrityGreaterThanOneHundred() {
        try {
            ICar car = new InfiniteGas(new Car(200f, 50f));
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid integrity!", e.getMessage());
        }
    }
}