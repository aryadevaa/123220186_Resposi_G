/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC PRAKTIKUM
 */
public class DataPenitipan {
    private Integer id;
    private String namaHewan;
    private String jenisHewan;
    private String namaPemilik;
    private String nomorHP;
    private String durasi;
    private String harga;
    
    public Integer getId(){
        return id;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
    public String getNama(){
        return namaHewan;
    }
    
    public void setNama(String namaHewan){
        this.namaHewan = namaHewan;
    }
    
    public String getJenis(){
        return jenisHewan;
    }
    
    public void setJenis(String jenisHewan){
        this.jenisHewan = jenisHewan;
    }
    
    public String getPemilik(){
        return namaPemilik;
    }
    
    public void setPemilik(String namaPemilik){
        this.namaPemilik = namaPemilik;
    }
    
    public String getNomor(){
        return nomorHP;
    }
    
    public void setNomor(String nomorHP){
        this.nomorHP = nomorHP;
    }
    
    public String getDurasi(){
        return durasi;
    }
    
    public void setDurasi(String durasi){
        this.durasi = durasi;
    }
    
    public String getHarga(){
        return harga;
    }
    
    public void setHarga(String harga){
        this.harga = harga;
    }
}
