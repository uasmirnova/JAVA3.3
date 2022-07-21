public class CreditPaymentService {
    public int calculate(int amount, int period, float percent) {
        float percentPerMonth = percent / 12 / 100;
        double coefficient = percentPerMonth * (Math.pow((1 + percentPerMonth), period)
                / (Math.pow((1 + percentPerMonth), period) - 1));
        return (int) (coefficient * amount);
        }
    }

