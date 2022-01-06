/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Manusia;

/**
 *
 * @author User
 */
public class Customer implements Manusia {
    public String nama; 
    public String alamat; 
    public String notelp; 
    public char idcustomer; 
    public int jumpesanan;  
    Order [] pesanan; 
    
    public Customer(String nama, String alamat, String notelp, char idcustomer) {
        this.nama = nama;
        this.alamat = alamat;
        this.notelp = notelp;
        this.idcustomer = idcustomer;
        this.jumpesanan = 0; 
        this.pesanan=new Order[100];
    }

    public char getIdcustomer() {
        return idcustomer;
    }

    public int getJumpesanan() {
        return jumpesanan;
    }

    public void setIdcustomer(char idcustomer) {
        this.idcustomer = idcustomer;
    }

    public void setJumpesanan(int jumpesanan) {
        this.jumpesanan = jumpesanan;
    } 
    
    public void addorder(Order a){
        pesanan[jumpesanan]=a; 
        jumpesanan++;    
    }
    
    public void showorder(){
        for (int i = 0; i < jumpesanan; i++) { 
            System.out.println(pesanan[i].listpesanan.makan[i].getNamamakanan());
            System.out.println(pesanan[i].listpesanan.minum[i].getNamaminuman());  
            System.out.println(pesanan[i].totalHarga);  
        }     
    }
    
    @Override
    public String getnotelp() {
        return notelp;
    }

    @Override
    public void setnama(String a) {
        this.nama=a;
    }

    @Override
    public void setalamat(String b) {
        this.alamat=b;
    }

    @Override
    public void setnotelp(String c) {
        this.notelp=c; 
    }

    @Override
    public String getnama() {
        return nama;
    }

    @Override
    public String getalamat() {
        return alamat;
    }   
}
