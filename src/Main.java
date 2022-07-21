public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1000000;
        int period = 36;
        float percent = 9.99F;
        int creditPayment = service.calculate(amount, period, percent );
        System.out.println("Ежемесячный платеж = " + creditPayment + " руб");

    }
}
