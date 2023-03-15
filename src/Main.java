public class Main {
    public static void main(String[] args) {

        Varukorg varukorg = new Varukorg();
        Produkt Mjölken = new Produkt("Mjölk", 10);
        varukorg.addProdukt(Mjölken);

        Varukorg.addProdukt(new Produkt("Glass", 50));
        Varukorg.addProdukt(new Produkt("Korv", 60));
        Varukorg.addProdukt(new Produkt("Lingon", 90));
        varukorg.visaKvitto();

    }
}
