public class AverageOfDigit {
    public static void main(String[] args) {
        int num = 12345;
        double avg = 0;
        int count = 0;
        while (num != 0) {
            avg += num % 10;
            num /= 10;
            count++;
        }
        System.out.println(avg / count);
    }
}

// output: 3.0