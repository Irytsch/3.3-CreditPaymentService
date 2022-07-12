public class Main {

    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        double monthlyAnnuityPayment = service.calculate(1_000_000, 0.008325, 12);
        System.out.println("Сумма кредита (в руб.): " + 1_000_000);
        System.out.println("Процентная ставка: 9,99%");
        System.out.println("Срок кредита: " + 12 + " месяцев");
        System.out.printf("Ежемесячный платеж по кредиту составит (в руб.): " + "%.0f", monthlyAnnuityPayment);
        System.out.println();

        double monthlyAnnuityPayment1 = service.calculate(1_000_000, 0.008325, 24);
        System.out.println();
        System.out.println("Сумма кредита (в руб.): " + 1_000_000);
        System.out.println("Процентная ставка: 9,99%");
        System.out.println("Срок кредита: " + 24 + " месяца");
        System.out.printf("Ежемесячный платеж по кредиту составит (в руб.): " + "%.0f", monthlyAnnuityPayment1);
        System.out.println();

        double monthlyAnnuityPayment2 = service.calculate(1_000_000, 0.008325, 36);
        System.out.println();
        System.out.println("Сумма кредита (в руб.): " + 1_000_000);
        System.out.println("Процентная ставка: 9,99%");
        System.out.println("Срок кредита: " + 36 + " месяцев");
        System.out.printf("Ежемесячный платеж по кредиту составит (в руб.): " + "%.0f", monthlyAnnuityPayment2);
        System.out.println();
    }
}
