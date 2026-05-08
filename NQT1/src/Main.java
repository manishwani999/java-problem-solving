import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of groups: ");
        int groups = sc.nextInt();
        int arr[] = new int[groups];

        for (int i = 0; i < groups; i++) {
            System.out.print("Enter group "+ (i+1) +": ");
            arr[i] = sc.nextInt();
            System.out.println();
        }

        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
            }
        }
        System.out.println("Number of Violations: "+count);
    }
}