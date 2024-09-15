/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikumpbo_4;

/**
 *
 * @author Raymond
 */
public class PraktikumPBO_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pekerja orang1= new Pekerja();
        orang1.pekerja("budi",25,"mancing",302010);
        
        System.out.println(orang1);
        
        orang1.setNama("andi");
        
        System.out.println(orang1);
        
        System.out.println(orang1.nama);
        System.out.println(orang1.usia);
        System.out.println(orang1.getGaji());
    }
}
