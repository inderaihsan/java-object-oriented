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
abstract class Karyawan implements Manusia { 
    
    public char idKaryawan; 
    public double gaji; 
    public String nama; 
    public String alamat; 
    public String notelp;  

    public Karyawan(char idKaryawan, double gaji, String nama, String alamat, String notelp) {
        this.idKaryawan = idKaryawan;
        this.gaji = gaji;
        this.nama = nama;
        this.alamat = alamat;
        this.notelp = notelp;
    }

    public void setIdKaryawan(char idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public char getIdKaryawan() {
        return idKaryawan;
    }

    public double getGaji() {
        return gaji;
    }
    
    @Override
    public void setnama(String a) {
        this.nama=a;
    }

    @Override
    public String getnama() {
        return nama;
    }

    @Override
    public String getalamat() {
        return alamat;
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
    public String getnotelp() {
        return notelp;
    }
}
