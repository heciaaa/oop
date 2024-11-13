package Basics;

import java.util.Scanner;

public class GiamGia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float GiaBan;
        float PTGiam;
        System.out.println("Nhap gia ban:");
        GiaBan = sc.nextFloat();
        System.out.println("Nhap phan tram giam:");
        PTGiam = sc.nextFloat();
        float GiaMoi = (float) GiaBan - (GiaBan * (PTGiam/100)); 
        System.out.println("Gia moi la:"+GiaMoi);
    }
    
}
