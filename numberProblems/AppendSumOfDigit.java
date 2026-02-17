public class AppendSumOfDigit {
    public static void main(String[] args) {
        long num = 1234999999l;
        int sum = 0;
        long temp = num;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (sum < 10) {
            num *= 10;
        } else {
            num *= 100;
        }
        System.out.println(num + sum);
    }
}
