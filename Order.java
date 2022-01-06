/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Menu;

/**
 *
 * @author User
 */
public class Order {
   public char idOrder;
   public double totalHarga;
   public boolean isReady;
   int noantrian; 
   public Menu listpesanan;  
   public int jumpesanan; 

    public Order(char idOrder, boolean isReady ) {
        this.idOrder = idOrder;
        this.isReady = isReady;  
        this.noantrian=1;
    }

    public char getIdOrder() {
        return idOrder;
    }

    public double getTotalHarga() {
        for (int i = 0; i < listpesanan.jummakanan; i++) { 
           totalHarga= totalHarga+listpesanan.makan[i].harga; 
        } 
        for (int i = 0; i < listpesanan.jumminuman; i++) {
            totalHarga=totalHarga+listpesanan.minum[i].hargaminuman;
        } 
        return totalHarga;
    }

    public boolean isIsReady() {
        return isReady;
    }

    public void setIdOrder(char idOrder) {
        this.idOrder = idOrder;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public void setIsReady(boolean isReady) {
        this.isReady = isReady;
    } 
    
    public void addmenu (Menu A){ 
        listpesanan = A;     
    }  
}
