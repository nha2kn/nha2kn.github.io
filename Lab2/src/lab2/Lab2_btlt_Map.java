/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author nhanr
 */
public class Lab2_btlt_Map {
    public static void main(String[] args) {
        Map<Integer,NhanVien> map = new HashMap<Integer,NhanVien>();
        
        map.put(1,new NhanVien("Bach",7,1000));
        map.put(2,new NhanVien("Kha",7.5,1500));
        map.put(3,new NhanVien("Duc",6.5,2000));
        map.put(4,new NhanVien("Nghia",3,2500));
        map.put(5,new NhanVien("Tam",9,3000));
        
         System.out.println(map);
         double average = 0;
        for (NhanVien nv: map.values()) {
            average += nv.getLuong();
        }
        System.out.println("Average = "+average/map.size());
    }
}
    class NhanVienMap{
      private String hoten;
      private double ngaycong;
      private double luongcb;

    public NhanVienMap(String hoten, double ngaycong, double luongcb) {
        this.hoten = hoten;
        this.ngaycong = ngaycong;
        this.luongcb = luongcb;
        }
    public NhanVienMap(){
    
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
