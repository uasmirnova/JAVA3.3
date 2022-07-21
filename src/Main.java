public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int creditPayment = service.calculate(1000000,12,9.99F);
        System.out.println("Ежемесячный платеж = " + creditPayment + " руб");

        creditPayment = service.calculate(1000000,24,9.99F);
        System.out.println("Ежемесячный платеж = " + creditPayment + " руб");

        creditPayment = service.calculate(1000000,36,9.99F);
        System.out.println("Ежемесячный платеж = " + creditPayment + " руб");

    }
}
