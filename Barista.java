/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Karyawan;

/**
 *
 * @author User
 */
public class Barista extends Karyawan{
    
    public Barista(char idKaryawan, double gaji, String nama, String alamat, String notelp) {
        super(idKaryawan, gaji, nama, alamat, notelp);    
    }
    
    public void setIdKaryawan(char idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNotelp() {
        return notelp;
    }
    
    public char getIdKaryawan() {
        return idKaryawan;
    }

    public double getGaji() {
        return gaji;
    }     
}
