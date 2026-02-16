public class FindFirstDigit {
    public static void main(String[] args) {
        int num = 325461;
        // int first = 0;
        while (num > 10) {
            num = num / 10;
        }
        System.out.println(num);
    }
}
