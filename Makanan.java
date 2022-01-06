/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author User
 */
class Makanan  { 
    public String namamakanan; 
    public int harga; 
    public String idmakanan;  

    public Makanan(String namamakanan, int harga, String idmakanan) {
        this.namamakanan = namamakanan;
        this.harga = harga;
        this.idmakanan = idmakanan; 
    }
    
    public String getNamamakanan() {
        return namamakanan;
    }

    public int getHarga() {
        return harga;
    }

    public String getIdmakanan() {
        return idmakanan;
    }

    public void setNamamakanan(String namamakanan) {
        this.namamakanan = namamakanan;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setIdmakanan(String idmakanan) {
        this.idmakanan = idmakanan;
    }   
}
