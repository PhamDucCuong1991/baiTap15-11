package QuanLyAcount;

import Product.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaiKhoan taiKhoan = new TaiKhoan();
        while (true) {
            System.out.println("Quan ly acount" + "\n"
                               + "1.Them tk" + "\n"
                               + "2.hien thi tk " + "\n"
                               + "3. sua password" + "\n"
                               + "3. xoa tk bang id" + "\n"


                                                    );

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {


            }
        }
    }
}
