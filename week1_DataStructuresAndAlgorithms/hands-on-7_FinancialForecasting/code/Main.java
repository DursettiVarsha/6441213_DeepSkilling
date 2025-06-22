public class Main {
    public static void main(String[] args) {
        double presentValue = 10000.0;
        double growthRate = 0.08; 
        int years = 5;

        double futureValue = Forecast.forecastRecursive(presentValue, growthRate, years);
        System.out.printf("Predicted future value after %d years: Rs. %.2f%n", years, futureValue);
    }
}
