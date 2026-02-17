public class AppendSumAtFirst {
    public static void main(String[] args) {
        long num = 1234l;
        long temp = num;
        int sum = 0;
        int power = 1;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
            power *= 10;
        }
        sum *= power;
        System.out.println(sum += num);
    }
}
