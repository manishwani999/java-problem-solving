public class FindSecondLast {
    public static void main(String[] args) {
        int num = 123456;
        int secondLastNum = (num / 10) % 10;
        System.out.println("second last digit : " + secondLastNum);
    }
}
