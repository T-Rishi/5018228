public class FinancialForecasting {
    
    // Recursive method to predict future value
    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        // Base case: if no more years to project, return the current value
        if (years == 0) {
            return currentValue;
        }
        
        // Recursive case: calculate the future value for the next year
        double futureValue = currentValue * (1 + growthRate);
        return predictFutureValue(futureValue, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double currentValue = 1000.0;  // current value in Rupees
        double annualGrowthRate = 0.05;  // annual growth rate (5%)
        int years = 10;  // number of years to predict
        
        double predictedValue = predictFutureValue(currentValue, annualGrowthRate, years);
        System.out.printf("The predicted future value after %d years is: %.2f%n", years, predictedValue);
    }
}
