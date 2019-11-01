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
public class TeamItachi extends PetinggiAkatsuki{

    public TeamItachi() {
        TampilNama();
        asalDesa();
        kekuatan();
        jutsuSpecial();
        penampilan();
    }

    @Override
    public void penampilan() {
        System.out.println("\nPenampilan");
        System.out.println("Itachi : Menggunakan ikat kepala konoha yang dicoret ");
        System.out.println("Kisame : Menggunakan ikat kepala kirigakure yang dicoret");
        System.out.println("         dan membawa pedang samehada");
    }

    @Override
    public void jutsuSpecial() {
        System.out.println("\nJutsu Spesial");
        System.out.println("Itachi : Mangekyo sharingan, Tsukoyomi, Susanoo");
        System.out.println("Kisame : Clone shark");
    }

    @Override
    public void kekuatan() {
        System.out.println("\nKekuatan");
        System.out.println("Itachi : Fire style, Wind style, Water style, sharingan");
        System.out.println("Kisame : Earth style, Water style, Wind style, Fire tyle");
    }

    @Override
    public void asalDesa() {
        System.out.println("\nAsal Desa");
        System.out.println("Itachi : Desa Konoha");
        System.out.println("Kisame : Kirigakure");
    }

    @Override
    public void TampilNama() {
        System.out.println("Ketua : Uciha Itachi");
        System.out.println("Partner : Hosigaki Kisame");
    }
    
    
    
}
