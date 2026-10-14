
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap kich thuoc mang: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cho mang:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Selection Sort giam dan
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        // In mang sau khi sap xep
        System.out.print(
                "Mang sau khi sap xep theo thu tu giam dan: "
        );
        System.out.print("[");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);

            if (i < n - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        // Phan tu lon nhat
        System.out.println(
                "Phan tu lon nhat trong mang la: " + arr[0]
        );

        sc.close();
    }
}
