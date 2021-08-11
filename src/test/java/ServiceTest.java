import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTest {

    @Test
    void calculateAverageTemperature(){
        Service service = new Service();
        int[] temperatures = {10, 20, 30, 40, 50};
        int actual = service.calculateAverageTemperature(temperatures);
        assertEquals(30, actual);
    }

    @Test
    void calculateMaxTemperature(){
        Service service = new Service();
        int[] temperatures = {10, 20, 30, 40, 50};
        int actual = service.calculateMaxTemperature(temperatures);
        assertEquals(30, actual);
    }
}
