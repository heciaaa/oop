package Basics;

import java.util.Scanner;

public class NhapXuat {
    public static void main(String[] args) {
        int x;
        float y;
        String a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap x=");
        x=sc.nextInt();
        System.out.println("nhap y=");
        y=sc.nextFloat();
        System.out.println("nhap ky tu: ");
        a=sc.next();
        System.out.println("nhap xau ki tu:");
        b=sc.nextLine();
    }
}
