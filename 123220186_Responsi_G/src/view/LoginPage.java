/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author PC PRAKTIKUM
 */
public class LoginPage {
    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt){
        try{
            String sql = "SELECT * FROM datauser where username =" + tfUsername.getText() + "AND Password =" + tdPassword.getText() + "";
            
            java.sql.Connection con = connect.connection;
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery(sql);
            
            if(rs.next()){
                if(tfUsername.getText().equals(rs.getString("username")) && tfPassword.getText().equals(rs.getString("passqord"))){
                    JOptionPane.showMessageDialog(null,"Berhasil Login");
                    this.setVisible(false);
                    new MainView().setVisible(true);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Username atau Password Salah");
            }
        }catch(SQLExeption ex){
            JOptionPane.ShowMessageDialog(this, ex.getMessage());
        }
    }
    public JTextField getTfPassword(){
        return tfPassword;
    }
    public void setTfPassword(JTextField){
        this.tfPassword = tfPassword;
    }
    public JTextField getTfUsername(){
        return tfUsername;
    }
    public void setTfUsername(JTextField){
        this.tfUsername = tfUsername;
    }
}
