/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author nhanr
 */
public class Lab2_btlt_Set {
    public static void main(String[] args) {
        Set<NhanVien> set = new HashSet<NhanVien>();
        NhanVien nv = new NhanVien();
        set.add(new NhanVien("Bach",7,1000));
        set.add(new NhanVien("Kha",7.5,1500));
        set.add(new NhanVien("Duc",6.5,2000));
        set.add(new NhanVien("Nghia",3,2500));
        set.add(new NhanVien("Tam",9,3000));
        
            System.out.println(set);
        double l=0;
        for (NhanVien n:set) {
            l+=n.getLuong();
        }
        System.out.println("Average = "+l/set.size());
    }
}
    class NhanVienSet{
      private String hoten;
      private double ngaycong;
      private double luongcb;

    public NhanVienSet(String hoten, double ngaycong, double luongcb) {
        this.hoten = hoten;
        this.ngaycong = ngaycong;
        this.luongcb = luongcb;
        }
    public NhanVienSet(){
    
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
