package assignment6;

import java.util.*;

public class MinMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i+ " : ");
            a[i]=scanner.nextInt();
        }
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Phan tu lon nhat trong mang = " + max);
        System.out.println("Phan tu nho nhat trong mang = " + min);
    }

}
