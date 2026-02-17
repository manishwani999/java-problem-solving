public class FindMin {
    public static void main(String[] args) {
        int n = 234345;
        int min = 9;
        while (n != 0) {
            int last = n % 10;
            if (last < min) {
                min = last;
            }
            n /= 10;
        }
        System.out.println(min);
    }
}
