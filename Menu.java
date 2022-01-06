/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Makanan;

/**
 *
 * @author User
 */
class Menu { 
    public char idmenu; 
    public String namamenu;    
    public Makanan[] makan; 
    public Minuman[] minum;  
    public int jumminuman=0; 
    public int jummakanan=0;  
   
    public Menu() {
        this.makan = new Makanan[100];
        this.minum= new Minuman[100]; 
    }

    public char getIdmenu() {
        return idmenu;
    }

    public String getNamamenu() {
        return namamenu;
    }

    public void setIdmenu(char idmenu) {
        this.idmenu = idmenu;
    }

    public void setNamamenu(String namamenu) {
        this.namamenu = namamenu;
    } 
    
    public void setmakanan(String nama, int harga, String id){
        makan[jummakanan] = new Makanan(nama,harga,id);    
        jummakanan++; 
    }  
    
    public void setminuman(String nama, int harga, String id){
        Minuman B = new Minuman(nama, harga, id); 
        minum[jumminuman]=B; 
        jumminuman++; 
    } 
    
    public void showmenu(){
        System.out.println("Menu Makanan :");
        for (int i = 0; i < jummakanan; i++) { 
            System.out.println((i+1)+"."+makan[i].getNamamakanan()+"     "+makan[i].getHarga()); 
        } 
        
        System.out.println(""); 
        System.out.println(""); 
        
        System.out.println("Menu Minuman :");
        for (int i = 0; i < jumminuman; i++) { 
            System.out.println((i+1)+"."+minum[i].getNamaminuman()+"     "+minum[i].getHargaminuman());    
        } 
    }
}
