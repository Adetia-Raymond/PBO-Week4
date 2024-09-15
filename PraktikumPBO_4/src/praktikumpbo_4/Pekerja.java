/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo_4;

/**
 *
 * @author Raymond
 */
public class Pekerja extends Manusia{
    private int gaji;
    
    public void pekerja(String nama, int usia, String pekerjaan, int gaji){
        this.nama= nama;
        this.usia= usia;
        this.pekerjaan= pekerjaan;
        this.gaji= gaji;
    }
    
    public int getGaji(){
        return this.gaji;
    }
    
    public void setGaji(int gaji){
        this.gaji= gaji;
    }
    
    @Override
    public String toString(){
        return  "nama "+this.nama+
                " usia "+this.usia+
                " pekerjaan "+this.pekerjaan+
                " gaji "+this.gaji;
    }
    
    
}
