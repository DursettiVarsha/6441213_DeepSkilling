public class Forecast {

    public static double forecastRecursive(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return forecastRecursive(presentValue, growthRate, years - 1) * (1 + growthRate);
    }
}
