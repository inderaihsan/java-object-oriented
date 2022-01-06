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
class Minuman { 
    public String namaminuman; 
    public int hargaminuman; 
    public String idminuman;    

    public Minuman(String namaminuman, int hargaminuman, String idminuman) {
        this.namaminuman = namaminuman;
        this.hargaminuman = hargaminuman;
        this.idminuman = idminuman;
    }
    
    public String getNamaminuman() {
        return namaminuman;
    }

    public int getHargaminuman() {
        return hargaminuman;
    }

    public String getIdminuman() {
        return idminuman;
    } 

    public void setNamaminuman(String namaminuman) {
        this.namaminuman = namaminuman;
    }

    public void setHargaminuman(int hargaminuman) {
        this.hargaminuman = hargaminuman;
    }

    public void setIdminuman(String idminuman) {
        this.idminuman = idminuman;
    }    
}
