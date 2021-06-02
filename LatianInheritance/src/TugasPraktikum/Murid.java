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
public class Murid extends WargaSekolah{
     protected String kelas;
    protected int absen;
    private String NIS;

    public Murid(String nama, String kelas, int absen, int umur, String NIS) {
        super(nama, "Murid", umur);
        this.kelas = kelas;
        this.absen = absen;
        this.NIS = NIS;
    }

    public String getNIS() {
        return NIS;
    }
    
    @Override
    public void info(){
        System.out.println("======== Info Murid ========");//hiasan
        super.info();
        System.out.println("Kelas / No Absen : " + this.kelas + " / " + this.absen );
        System.out.println("NIS : " + getNIS());
        System.out.println("================\n");
    }
    
    
}
