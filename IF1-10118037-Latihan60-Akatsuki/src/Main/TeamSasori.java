/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Muhammad Ihsan
 */
public class TeamSasori extends PetinggiAkatsuki{

    public TeamSasori() {
        TampilNama();
        asalDesa();
        kekuatan();
        jutsuSpecial();
        penampilan();
    }

    @Override
    public void penampilan() {
        System.out.println("\nPenampilan");
        System.out.println("Sasori : Berambut merah muda dan terlihat masih muda");
        System.out.println("Deidara : Berambut kuning diikat dan memiliki mulut di tangan");                
    }

    @Override
    public void jutsuSpecial() {
        System.out.println("\nJutsu Special");
        System.out.println("Sasori : Pengendali boneka manusia");
        System.out.println("Deidara : Tanah liat peledak");
    }

    @Override
    public void kekuatan() {
        System.out.println("\nKekuatan");
        System.out.println("Sasori : Elemen Magnet");
        System.out.println("Deidara : Earth style");
    }

    @Override
    public void asalDesa() {
        System.out.println("\nAsal Desa");
        System.out.println("Sasori : Sunagakure");
        System.out.println("Deidara : Iwagakure");
    }

    @Override
    public void TampilNama() {
        System.out.println("Ketua : Sasori");
        System.out.println("Partner : Deidara");
    }
    
    
}
