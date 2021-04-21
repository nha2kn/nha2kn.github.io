/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import dto.HinhTron;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nhanr
 */
public class HinhTronTableModel extends AbstractTableModel{

    private static final String[] FIELD_NAMES = {"R","Dien tich"};
    private ArrayList<HinhTron> dsHT;

    public HinhTronTableModel(){
        dsHT = new ArrayList<>();
        
    }
    
    @Override
    public int getRowCount() {
        return dsHT.size();
    }

    @Override
    public int getColumnCount() {
        return FIELD_NAMES.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(rowIndex >= getRowCount())
            return "";
        HinhTron ht = dsHT.get(rowIndex);
        switch(columnIndex){
            case 0:
                return ht.getR();
            case 1:
                return ht.tinhDT();
            default:
                return "";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return double.class;
    }

    @Override
    public String getColumnName(int column) {
        if(column>=0 && column < getColumnCount()){
            return FIELD_NAMES[column];
        }
        return "";
        
        
    }

    public ArrayList<HinhTron> getDsHT() {
        return dsHT;
    }

    public void setDsHT(ArrayList<HinhTron> dsHT) {
        this.dsHT = dsHT;
        
        fireTableDataChanged();
    }
    
    public void themHinhTron(HinhTron ht){
        this.dsHT.add(ht);
        fireTableDataChanged();
    }
    
    public void xoaHinhTron(int index){
        if (index >=0 && index <getRowCount()){
            this.dsHT.remove(index);
            fireTableDataChanged();
        }
    }
    
    public void xoaHetHinhTron(){
        this.dsHT.clear();
        fireTableDataChanged();
    }
    
    public HinhTron layHinhTron(int index){
        if(index >=0 && index <getRowCount()){
            return this.dsHT.get(index);
        }
        return null;
    }
    
    public void capNhatHinhTron(int index, HinhTron htNew){
        if(index >=0 && index < getRowCount()){
            HinhTron ht = this.dsHT.get(index);
            ht.setR(htNew.getR());
            fireTableDataChanged();
        }
    }
}
