package Basics;

import java.util.Scanner;

public class XepLoai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Diem;
        System.out.println("nhap diem thi:");
        Diem = sc.nextInt();
        if (Diem <=100 && Diem >= 90)
            System.out.println("A");
            else if(Diem >=80 && Diem<90)
                System.out.println("B");
            else if(Diem >=70 && Diem<80)
                System.out.println("C");
                else if(Diem>=50&&Diem<70)
                    System.out.println("D");
                    else if (Diem<50)
                        System.out.println("F");
            }

        }
    
    

