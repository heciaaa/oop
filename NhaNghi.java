package Basics;

import java.util.Scanner;

public class NhaNghi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so ngay o: ");
        int Sn = sc.nextInt();
        System.out.println("nhap son gia: ");
        double DonGia = sc.nextDouble();
        if (Sn==1)
            System.out.println("so tien ban phai thanh toan la:"+(DonGia*Sn));
        else if(Sn>=2 && Sn<=4)
            System.out.println("so tien ban phai thanh toan la: "+((DonGia*Sn)-(DonGia*Sn)*25/100));
        else if (Sn >=5 && Sn <= 10)
            System.out.println("so tien ban phai thanh toan la: "+((DonGia*Sn)-(DonGia*Sn)*40/100));
        else if (Sn>=11)
            System.out.println("so tien ban phai thanh toan la: "+((DonGia*Sn)-(DonGia*Sn)*60/100));

    }
    
}
