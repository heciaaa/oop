package Basics;
public class TongLe{
     public static void main(String[] args) {
         int sum = 0; 
         // Lặp qua các số từ 1 đến 100 
         for (int i = 1; i <= 100; i++) {
             // Kiểm tra nếu số là chẵn
              if(i % 2 != 0) { 
                sum += i; 
                // Cộng số lẻ vào tổng 
                } 
            } 
            // In tổng các số lẻ
            System.out.println("Tong cac so le: " + sum); 
        }
     }