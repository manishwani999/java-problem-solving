// WAP to find maximum digit from given number

public class FindMax {
    public static void main(String[] args) {
        int n = 12543;
        int max = 0;
        while (n != 0) {
            int last = n % 10;
            if (last > max) {
                max = last;
            }
            n /= 10;
        }
        System.out.println(max);
    }
}
