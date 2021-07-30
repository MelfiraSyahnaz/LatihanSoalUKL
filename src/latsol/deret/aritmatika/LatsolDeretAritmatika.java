/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latsol.deret.aritmatika;

/**
 *
 * @author MOKLET-2
 */
public class LatsolDeretAritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sukuPertama = 3;
        int Selisih = 5;
        int jumlahSuku = 10;
        int nilaiSuku;
        
        System.out.println("Deret Aritmatika");
        
        for (int i = 1; 1 <= jumlahSuku; i++) {
            
            nilaiSuku = sukuPertama;
            sukuPertama = Selisih;
            
            System.out.println ("Suku ke - " +i+ " : "+nilaiSuku);
            
            
        }
    }
    
}
