public class DepositCalculation {
    double yearRate = 0.06;
    double calculateComplexPercent (double amount, int depositPeriod) {
        return Math.round((amount * Math.pow((1 + yearRate/ 12), 12 * depositPeriod))*100/100);
    }

    double calculateSimplePercent (double amount, int depositPeriod) {
        return Math.round((amount + amount * yearRate * depositPeriod)*100/100);
    }

    double getFinalAmount(double amount, int depositPeriod, int typeOfDeposit) {
        double finalAmount = 0;
        if (typeOfDeposit == 1) {
            finalAmount = calculateSimplePercent (amount, depositPeriod);
        }
        else if (typeOfDeposit == 2) {
            finalAmount = calculateComplexPercent (amount, depositPeriod);
        }
        return finalAmount;
    }

}
