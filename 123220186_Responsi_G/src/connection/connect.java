/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package connection;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author PC PRAKTIKUM
 */
public class connect {
    static Connection con;
    
    public static Connection connect(){
        if(con == null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("responsi_2024_pbo_if_g");
            data.setUser("root");
            data.setPassword("");
            try{
                con = data.getConnection();
                System.out.println("Connection Successful");
            }catch(SQLException ex){
                ex.printStackTrace();
                System.out.println("Connection Failed");
            }
        }
        return con;
    }
}
