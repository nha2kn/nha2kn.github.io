/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author nhanr
 */
public class Lab2_bt2 {
    public static void main(String[] args) {
        NhanVien nv,nv1,nv2,nv3,nv4,nv5;
        nv = new NhanVien("Bach",7,1000);
        nv2 = new NhanVien("Kha",7.5,1500);
        nv3 = new NhanVien("Duc",6.5,2000);
        nv4 = new NhanVien("Nghia",3,2500);
        nv5 = new NhanVien("Tam",9,3000);
        System.out.println(nv+"\n"+nv2+"\n"+nv3+"\n"+nv4+"\n"+nv5);
        double averege = (nv.getLuong()+nv2.getLuong()+nv3.getLuong()+nv4.getLuong()+nv5.getLuong()/5);
        System.out.println(averege);
    }
}
    class NhanVien{
      private String hoten;
      private double ngaycong;
      private double luongcb;

    public NhanVien(String hoten, double ngaycong, double luongcb) {
        this.hoten = hoten;
        this.ngaycong = ngaycong;
        this.luongcb = luongcb;
        }
    public NhanVien(){
    
    }

        public String getHoten() {
            return hoten;
        }

        public void setHoten(String hoten) {
            this.hoten = hoten;
        }

        public double getNgaycong() {
            return ngaycong;
        }

        public void setNgaycong(double ngaycong) {
            this.ngaycong = ngaycong;
        }

        public double getLuongcb() {
            return luongcb;
        }

        public void setLuongcb(double luongcb) {
            this.luongcb = luongcb;
        }

        public double getLuong(){
            return ngaycong * luongcb;
        }
        
        @Override
        public String toString() {
            return "NhanVien{" + "hoten=" + hoten + ", ngaycong=" + ngaycong + ", luongcb=" + luongcb + '}';
        }
      
      
    }
