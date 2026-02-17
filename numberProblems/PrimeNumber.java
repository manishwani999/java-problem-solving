public class PrimeNumber {
    public static void main(String[] args) {
        int n = 11;
        boolean isPrime = false;
        if (n == 0 || n == 1) {
            isPrime = true;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = true;
                    break;
                }
            }
        }
        if (!isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
