public class CreditPaymentService {
    public double calculate(int creditSum, double interestRate, int creditPeriod) {


        double monthlyAnnuityPayment = creditSum * (interestRate * (Math.pow((1 + interestRate), creditPeriod)) / ((Math.pow((1 + interestRate), creditPeriod)) - 1));
        return monthlyAnnuityPayment;
    }
}