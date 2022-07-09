public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int creditSum = 1_000_000;
        double interestRate = 0.008325;
        int creditPeriod = 12;
        double monthlyAnnuityPayment = service.calculate(creditSum, interestRate, creditPeriod);
        System.out.println("Сумма кредита (в руб.): " + creditSum);
        System.out.println("Процентная ставка: 9,99%");
        System.out.println("Срок кредита: " + creditPeriod + " месяцев");
        System.out.printf("Ежемесячный платеж по кредиту составит (в руб.): " + "%.0f", monthlyAnnuityPayment);
        System.out.println();

        int creditSum1 = 1_000_000;
        double interestRate1 = 0.008325;
        int creditPeriod1 = 24;
        double monthlyAnnuityPayment1 = service.calculate1(creditSum1, interestRate1, creditPeriod1);
        System.out.println();
        System.out.println("Сумма кредита (в руб.): " + creditSum1);
        System.out.println("Процентная ставка: 9,99%");
        System.out.println("Срок кредита: " + creditPeriod1 + " месяца");
        System.out.printf("Ежемесячный платеж по кредиту составит (в руб.): " + "%.0f", monthlyAnnuityPayment1);
        System.out.println();

        int creditSum2 = 1_000_000;
        double interestRate2 = 0.008325;
        int creditPeriod2 = 36;
        double monthlyAnnuityPayment2 = service.calculate2(creditSum2, interestRate2, creditPeriod2);
        System.out.println();
        System.out.println("Сумма кредита (в руб.): " + creditSum2);
        System.out.println("Процентная ставка: 9,99%");
        System.out.println("Срок кредита: " + creditPeriod2 + " месяцев");
        System.out.printf("Ежемесячный платеж по кредиту составит (в руб.): " + "%.0f", monthlyAnnuityPayment2);
    }
}
