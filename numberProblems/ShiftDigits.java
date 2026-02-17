public class ShiftDigits {

    public static void firstToLast() {
        int num = 123456;
        int temp = num;
        int count = 1;
        while (temp > 10) {
            temp /= 10;
            count *= 10;
        }
        int firstDigit = num / count;
        int remainingDigit = num % count;
        System.out.println(remainingDigit * 10 + firstDigit);
    }

    public static void lastToFirst() {
        int num = 234561;
        int temp = num;
        int count = 1;
        while (temp > 10) {
            temp /= 10;
            count *= 10;
        }
        int remainingDigit = num / 10;
        int lastDigit = num % 10;
        System.out.println(lastDigit * count + remainingDigit);

    }

    public static void main(String[] args) {
        firstToLast();
        lastToFirst();
    }
}
