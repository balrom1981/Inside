public class Service {
    public int calculateAverageTemperature(int[] temperatures) {
        int sum = 0;
        for (int temperature : temperatures) {
            sum += temperature;
        }
        return sum / temperatures.length;
    }

    public int calculateMaxTemperature(int[] temperatures) {
        int maxTemperatures = temperatures[temperatures.length - 1];
        for (int i = temperatures.length - 1; i >= 0; i--) {
            if (temperatures[i] > maxTemperatures) {
                maxTemperatures = temperatures[i];
            }
        }
        return maxTemperatures;
    }
}

