package Basics;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double length = scanner.nextDouble();

        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double width = scanner.nextDouble();

        double area = length * width; // Tính diện tích
        double perimeter = 2 * (length + width); // Tính chu vi

        System.out.println("Diện tích của hình chữ nhật là: " + area);
        System.out.println("Chu vi của hình chữ nhật là: " + perimeter);
    }
}
