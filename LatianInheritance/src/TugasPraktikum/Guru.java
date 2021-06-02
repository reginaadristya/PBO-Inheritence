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
public class Guru extends WargaSekolah{
    protected String Bidang;
    private String NIP;
    //konstruktor
    public Guru(String nama, String Bidang, int umur, String NIP){
        super(nama, "Guru", umur);
        this.Bidang = Bidang;
        this.NIP = NIP;
    }

    public String getNIP() {
        return NIP;
    }
    
    //overide info method
    @Override
    public void info(){
        System.out.println("======== Info Guru ========");//hiasan
        
        //calling info method from superclass
        super.info();
        
        System.out.println("Bidang Keahlian : " + Bidang);
        System.out.println("NIP : " + getNIP());
        System.out.println("================\n");
    }
}
