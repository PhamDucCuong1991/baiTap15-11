package QuanLyAcount;

import java.util.Scanner;

public class ThemSuaXoaAcount {
   TaiKhoan[] taiKhoans = new TaiKhoan[0];

   public void show(){
       for (int i = 0; i < taiKhoans.length; i++) {
           System.out.println(taiKhoans[i]);
       }
   }

   public void add(TaiKhoan taiKhoan){
      TaiKhoan[] newArr = new TaiKhoan[taiKhoans.length + 1];
       for (int i = 0; i < taiKhoans.length; i++) {
           newArr[i] = taiKhoans[i];
       }
      newArr[newArr.length-1] = taiKhoan;
       taiKhoans = newArr;
   }

   public TaiKhoan createAcount(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Nhap ID");
       int id = Integer.parseInt(scanner.nextLine());

       System.out.println("Nhap user name");
       String user = scanner.nextLine();

       System.out.println("nhap password");
       String pass = scanner.nextLine();

       System.out.println("nhap sdt");
       String sdt = scanner.nextLine();

       System.out.println("nhap ngay sinh");
       String ngaySinh = scanner.nextLine();

       return new TaiKhoan(id,user,pass,sdt,ngaySinh);
   }

   public void edit(int index, TaiKhoan taiKhoan){
       for (int i = 0; i < taiKhoans.length; i++) {
           taiKhoans[index] = taiKhoan;
       }
   }

//   public void delete(int id){
//       TaiKhoan[] newArr = new TaiKhoan[taiKhoans.length-1];
//       for (int i = 0; i < taiKhoans.length-1; i++) {
//           if(id.)
//       }
//   }

    public void search(int id){

    }

    public suaPass(String newPassWord){

    }
}
