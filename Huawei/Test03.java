import java.util.Scanner;

public class Test03 {
    // √∞≈›≈≈–ÚÀ„∑®
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            bubbleSort(arr);
            System.out.println(arr[0]);
            for (int i = 1; i < n; i++) {
                if (arr[i] != arr[i - 1]) {
                    System.out.println(arr[i]);
                }
            }

        }

    }
}