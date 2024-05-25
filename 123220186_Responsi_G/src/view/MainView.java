/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package view;
import java.swing.JTable;
import controller.DataPenitipanController;
import javax.swing.JTextField;

/**
 *
 * @author PC PRAKTIKUM
 */
public class MainView extends javax.swing.JFrame{
    DataPenitipanController dpc;
    public MainView(){
        initComponents();
        dpc = new DataPenitipanController(this);
        dpc.isiTable();
    }
    private int selectedId;
    
    private void buttoAddActionPerformed(java.awt.event.ActionEvent evt){
        dpc.delete();
        dpc.isiTable();
    }
    private void tableDataPenitipanMouseClicked(java.awt.event.MouseEvent evt){
        int baris = tableDataPenitipan.getSelectedRow();
        
        tfNamaHewan.setText(tableDataPenitipan.getValueAt(baris, 1),toString());
        tfJenisHewan.setText(tableDataPenitipan.getValueAt(baris, 2),toString());
        tfNamaPemilik.setText(tableDataPenitipan.getValueAt(baris, 3),toString());
        tfNomorHP.setText(tableDataPenitipan.getValueAt(baris, 4),toString());
        tfDurasi.setText(tableDataPenitipan.getValueAt(baris, 5),toString());
        tfHarga.setText(tableDataPenitipan.getValueAt(baris, 6),toString());
        selectedId = (Integer.parseInt(tableDataPenginapan.getValueAt)(baris, 0).toString());
    }
    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt){
        dpc.update();
        dpc.isiTable();
    }
    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt){
        tfNamaHewan.setText("");
        tfJenisHewan.setText("");
        tfNamaPemilik.setText("");
        tfNomorHP.setText("");
        tfDurasi.setText("");
        tfHarga.setText("");
    }
}
