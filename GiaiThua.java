package Basics;

import java.util.Scanner;

public class GiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("nhap a: ");
        a = sc.nextInt();
        int B = 1;
        while (a<0) {
            System.out.println("Nhap lai");
        }
        for (int i=1; i<=a; i++)
            B = B*a;
        System.out.println("ket qua: "+B);
    }
}
