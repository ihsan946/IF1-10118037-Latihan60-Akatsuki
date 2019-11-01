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
public class TeamKakuzu extends PetinggiAkatsuki{

    public TeamKakuzu() {
        TampilNama();
        asalDesa();
        kekuatan();
        jutsuSpecial();
        penampilan();
    }

    @Override
    public void TampilNama() {
        System.out.println("Ketua : Kakuzu ");
        System.out.println("Partner : Hidan");
        
    }

    @Override
    public void asalDesa() {
        System.out.println("\nAsal Desa");
        System.out.println("Kakuzu : Takigakure");
        System.out.println("Hidan : Yugakure");
    }

    @Override
    public void jutsuSpecial() {
        System.out.println("\nJutsu Spesial");
        System.out.println("Kakuzu : Memiliki 5 jantung dalam satu tubuh");
        System.out.println("Hidan : Control tubuh dengan meminum darah orang lain");
    }

    @Override
    public void kekuatan() {
        System.out.println("\nKekuatan");
        System.out.println("Kakuzu : earth style, lighting style, water style, fire style, wind style"); 
        System.out.println("Hidan : Keahlian pedang");       
    }

    @Override
    public void penampilan() {
        System.out.println("\nPenampilan");
        System.out.println("Kakuzu : Menggunakan cadar dan penutup kepala berbentuk segitiga");
        System.out.println("Hidan : Menggunakan kalung, berambut putih dan membawa pedang berbentuk sabit");
    }
    
    
    
    
    

    
    
    
}
