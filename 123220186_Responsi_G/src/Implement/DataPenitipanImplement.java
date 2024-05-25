/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Implement;
import java.util.List;
import model.*;

/**
 *
 * @author PC PRAKTIKUM
 */
public interface DataPenitipanImplement {
    public void insert(DataPenitipan dp);
    public void update(DataPenitipan dp);
    public void delete(int id);
    public List<DataPenitipan>getAll();
}
