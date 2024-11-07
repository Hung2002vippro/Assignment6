package assignment6;

import java.util.*;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i+ " : ");
            a[i]=scanner.nextInt();
        }
        int count=0;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=a[i];
            count++;
        }
        double average= (double) sum/count;
        System.out.println("Tong cac phan tu trong mang = " + sum);
        System.out.println("Trung binh cong cac phan tu trong mang = " + average);
    }

}
