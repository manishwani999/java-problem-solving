public class Palindrome {
    public static void main(String[] args) {
        int num = 131;
        int temp = num;
        int reverse = 0;
        while (temp != 0) {
            reverse *= 10;
            reverse += temp % 10;
            temp /= 10;
        }
        if (num == reverse) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
    }
}
