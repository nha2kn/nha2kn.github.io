/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nhanr
 */
public class Lab2_2 {
    public static void main(String[] args) {
        List<SinhVien> dssv = new ArrayList<>();
        SinhVien sv = new SinhVien();
        dssv.add(new SinhVien("111","Bach",7));
        dssv.add(new SinhVien("111","Kha",7.5));
        dssv.add(new SinhVien("111","Duc",6.5));
        dssv.add(new SinhVien("111","Nghia",3));
        dssv.add(new SinhVien("111","Tam",9));
        for (int i = 0; i < dssv.size(); i++) {
            System.out.println(dssv.get(i));
        }
        double Max=0;
        for (int i = 0; i < dssv.size(); i++) {
            if(dssv.get(i).dtb>Max){ // change dtb to public
                Max=dssv.get(i).dtb;
            }
        }
        System.out.println("Average Max = "+Max);
    }
}
    class SinhVien{
        private String mssv;
        private String hoten;
        public double dtb; // change
        public SinhVien(){
            
    }
    public SinhVien(String mssv, String hoten, double dtb) {
        this.mssv = mssv;
        this.hoten = hoten;
        this.dtb = dtb;
    }

        public String getMssv() {
            return mssv;
        }

        public void setMssv(String mssv) {
            this.mssv = mssv;
        }

        public String getHoten() {
            return hoten;
        }

        public void setHoten(String hoten) {
            this.hoten = hoten;
        }

        public double getDtb() {
            return dtb;
        }

        public void setDtb(double dtb) {
            this.dtb = dtb;
        }
        public String toString(){
            return "SinhVien("+ "mssv="+mssv+", hoten="+hoten+", dtb="+dtb+')';
        }
        
        }

