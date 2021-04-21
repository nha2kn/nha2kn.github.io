/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;


public class Lab2_1 {

    public static void main(String[] args) {
        HinhTron ht;
        ht = new HinhTron(10);
        System.out.println(ht);
    }
}
     class HinhTron {
        private double r;
        public HinhTron(){
            
        }
        public HinhTron (double r) {
            this.r = r;
        }
        public double getR() {
            return r;
        }
        public void setR(double r) {
            this.r = r;
    }
        public double tinhCV() {
            return 2 * Math.PI * r;
        }
        public double tinhDT() {
            return r * r *Math.PI;
        }
        public String toString() {
            return "HinhTron: r=" + r + ";CV="+tinhCV()+";DT="+tinhDT();
        }
}
