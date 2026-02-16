public class FindSecondDigit {
    public static void main(String[] args) {
        int num = 12345;
        int second = 0;
        while (num > 99) {
            num /= 10;
            second = num % 10;
        }
        System.out.println(second);
    }
}
