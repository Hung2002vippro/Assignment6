package assignment6;

import java.util.*;

public class Count {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + " : ");
            a[i] = scanner.nextInt();
        }
        System.out.print("Nhap: ");
        int b = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (b == a[i]) {
                count++;
            }
        }

        System.out.println("So lan so " + b + " xuat hien trong mang la: " + count);

    }

}
