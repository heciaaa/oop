package Basics;

import java.util.*;

public class HinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r;
        System.out.println("Nhap ban kinh:");
        r= sc.nextFloat();
        float Dt = (float) (Math.PI * r*r);
        float Cv = (float) (2*Math.PI*r);
        System.out.println("Chu vi:"+Cv+"Dien tich:"+Dt);
        
    }
}
