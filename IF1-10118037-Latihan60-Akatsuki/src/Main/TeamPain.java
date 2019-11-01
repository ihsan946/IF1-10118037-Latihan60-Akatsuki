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
public class TeamPain extends PetinggiAkatsuki{

    public TeamPain() {
        TampilNama();
        asalDesa();
        kekuatan();
        jutsuSpecial();
        penampilan();
    }

    @Override
    public void penampilan() {
        System.out.println("\nPenampilan");
        System.out.println("Pain : Ada 6 karakter berbeda dengan mata rhinegan yang sama");
        System.out.println("Konan : Berambut ungu dan seorang wanita");
    }

    @Override
    public void jutsuSpecial() {
        System.out.println("\nJutsu Special");
        System.out.println("Pain : Shinra tensei, Chibaku Tensei, Rinne Tensei");
        System.out.println("Konan : Meledakkan diri dengan menjadi bom kertas");
    }

    @Override
    public void kekuatan() {
        System.out.println("\nKekuatan");
        System.out.println("Pain : Earth style, Water Style, Lighting style, Wind style, Fire style, Yin dan Yang");
        System.out.println("Konan : Wind style, Earth style, Water style");
    }

    @Override
    public void asalDesa() {
        System.out.println("\nAsalDesa");
        System.out.println("Pain : Amegakure");
        System.out.println("Konan : Amegakure");
    }

    @Override
    public void TampilNama() {
        System.out.println("Ketua : Pain (Uzumaki Nagato)");
        System.out.println("Partner : Konan");
    }
    
}
