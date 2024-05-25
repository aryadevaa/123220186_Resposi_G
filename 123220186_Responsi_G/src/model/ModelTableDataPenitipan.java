/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author PC PRAKTIKUM
 */
public class ModelTableDataPenitipan extends AbstractTableModel{
    List<DataPenitipan> dataPenitipan;
    String kolom[] = {"ID", "Nama Hewan", "Jenis Hewan", "Nama Pemilik", "Nomor HP", "Durasi", "Harga"};
    
    public ModelTableDataPenitipan(List<DataPenitipan>dataPenitipan){
        this.dataPenitipan = dataPenitipan;
    }
    
    @Override
    public int getRowCount(){
        return dataPenitipan.size();
    }
    @Override
    public int getColumnCount(){
        return kolom.length;
    }
    @Override
    public String getColumnName(int columnIndex){
        return kolom[columnIndex];
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0 :
                return dataPenitipan.get(rowIndex).getId();
            case 1 :
                return dataPenitipan.get(rowIndex).getNama();
            case 2 :
                return dataPenitipan.get(rowIndex).getJenis();
            case 3 :
                return dataPenitipan.get(rowIndex).getPemilik();
            case 4 :
                return dataPenitipan.get(rowIndex).getNomor();
            case 5 :
                return dataPenitipan.get(rowIndex).getDurasi();
            case 6 :
                return dataPenitipan.get(rowIndex).getHarga();
            default :
                return null;
        }
    }
}
