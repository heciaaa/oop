package Basics;

import java.util.Scanner;

public class TienDien {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float SoDien;
        System.out.println("Nhap so dien: ");
        SoDien = sc.nextFloat();
        if(SoDien>0 && SoDien <=50)
            System.out.println("Tien dien la"+SoDien*1484);
            else if (SoDien >50 && SoDien<= 100)
                    System.out.println("Tien dien la:"+((SoDien-50)*1533+(50*1484)));
                else if (SoDien > 100 && SoDien <=200)
                    System.out.println("Tien dien la:"+((SoDien-100)*1786+(50*1484)+(50*1533)));
                else if (SoDien >200)
                    System.out.println("Tien dien la:"+((SoDien-200)*2242+100*1786+50*1533+50*1484));
    }    
    
}
