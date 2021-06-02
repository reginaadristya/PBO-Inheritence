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
public class Main {
    public static void main(String[] args) {
    // TODO code application logic here
        
        //membuat objek guru
        Guru cikgu = new Guru("Pak Didi", "Matematika", 43, "19850723203607");
        cikgu.info();
        
        //membuat objek murid
        Murid murid = new Murid("Regina Adristya Avillia Mahaeswari", "X RPL 1", 32, 16, "171807032");
        murid.info();
        
        //membuat objek karyawan
        Karyawan satpam = new Karyawan("Pak Amin", "Security", 45, "19850723206532");
        satpam.info();
    }
}