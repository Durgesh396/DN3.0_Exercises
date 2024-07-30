package DigitalNutrure;

public class FinancialProduct {
	

	    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
	        // Base case: if there are no more periods, return the present value
	        if (periods == 0) {
	            return presentValue;
	        }
	        // Recursive case: calculate the future value by applying the growth rate
	        return calculateFutureValue(presentValue * (1 + growthRate), growthRate, periods - 1);
	    }

	    public static void main(String[] args) {
	        double presentValue = 1000.0;  // Initial value
	        double growthRate = 0.05;      // 5% growth rate
	        int periods = 10;              // 10 periods

	        double futureValue = calculateFutureValue(presentValue, growthRate, periods);
	        System.out.println("Future Value: " + futureValue);
	    }
	}



