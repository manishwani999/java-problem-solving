public class AppendTwoNumbers {
    public static void main(String[] args) {
        int a = 1234;
        int b = 567891;
        int temp = b;
        int count = 1;
        while (temp != 0) {
            count *= 10;
            temp /= 10;
        }
        a *= count;
        System.out.println(a + b);
    }
}
