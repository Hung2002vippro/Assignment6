package assignment6;

import java.util.*;

public class Sort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + " : ");
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);

        System.out.println("Mang sau khi sap xep: " + Arrays.toString(a));

    }

}
