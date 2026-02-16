public class SumOfDigit {
    public static void main(String[] args) {
        int num = 12345;
        int temp = num;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of " + temp + " is " + sum);
    }
}
