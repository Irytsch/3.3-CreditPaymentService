public class CreditPaymentService {
    public double calculate(int creditSum, double interestRate, int creditPeriod) {

        double monthlyAnnuityPayment = creditSum * (interestRate * (Math.pow((1 + interestRate), creditPeriod)) / ((Math.pow((1 + interestRate), creditPeriod)) - 1));
        return monthlyAnnuityPayment;
    }
    public double calculate1(int creditSum1, double interestRate1, int creditPeriod1) {

        double monthlyAnnuityPayment1 = creditSum1 * (interestRate1 * (Math.pow((1 + interestRate1), creditPeriod1)) / ((Math.pow((1 + interestRate1), creditPeriod1)) - 1));
        return monthlyAnnuityPayment1;
    }
    public double calculate2(int creditSum2, double interestRate2, int creditPeriod2) {

        double monthlyAnnuityPayment2 = creditSum2 * (interestRate2 * (Math.pow((1 + interestRate2), creditPeriod2)) / ((Math.pow((1 + interestRate2), creditPeriod2)) - 1));
        return monthlyAnnuityPayment2;
    }
}