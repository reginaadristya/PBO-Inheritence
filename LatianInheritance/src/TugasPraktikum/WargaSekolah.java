/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author user
 */
public class WargaSekolah {
    //attribut utama
    protected String nama, status;
    protected int umur;
    
    //konstruktor
    public WargaSekolah(String nama, String status, int umur){
        this.nama = nama;
        this.status = status;
        this.umur = umur;
    }
    
    public void info(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Umur : " + this.umur);
        System.out.println("Status : " + this.status);
    }
    
}
