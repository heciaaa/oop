package Basics;

import java.util.Scanner;

public class SimpleIf {
    public static void main(String[] args) {
        String f;
        String a = "A";
        String s = "S";
        String m = "M";
        String d = "D";
        float x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap x,y:");
        x = sc.nextFloat();
        y = sc.nextFloat();
        System.out.println("nhap ky tu:");
        f = sc.next();
        if (f.equals(a))
             System.out.println(x+y);
        else if (f.equals(s))
             System.out.println(x-y);
        else if (f.equals(m))
            System.out.println(x*y);
        else if (f.equals(d)){
            System.out.println(x/y);
        }
        } 
        }
           
    

