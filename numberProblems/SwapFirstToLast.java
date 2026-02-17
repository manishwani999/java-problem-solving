public class SwapFirstToLast {
    public static void main(String[] args) {
        int num = 12345;
        int last = num % 10; // 5
        num /= 10; // 1234
        int temp = num; // 1234
        int length = 1;
        while (temp > 9) {
            temp /= 10;
            length *= 10;
        } // temp = 1
        num %= length; // 234
        last *= length; // 5000
        last += num; // 5234
        last *= 10;
        last += temp;
        System.out.println(last);
    }
}
