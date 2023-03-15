import java.util.ArrayList;
import java.util.List;
public class Varukorg {

    private static List<Produkt> Produkter;

    public Varukorg() { Produkter = new ArrayList<>(); }

    public static void addProdukt(Produkt produkt) { Produkter.add(produkt); }

    public double getTotalPris() {
        double totalPris = 0;
        for (Produkt produkt : Produkter) {
            totalPris += produkt.getPris();
        }
        return totalPris;
    }

    public void visaKvitto() {
            System.out.println("Kvitto");
        for (Produkt produkt : Produkter) {
            System.out.println(produkt.getNamn() + " " + produkt.getPris());}
            System.out.println("Totalt: " + getTotalPris());
    }
}