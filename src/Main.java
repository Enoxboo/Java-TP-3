public class Main {
    public static void main(String[] args) {
        Commande c1 = new Commande(25.0, 5.0, new LivraisonStandard());
        System.out.println("Total commande 1 : " + c1.calculerTotal() + "€");

        Commande c2 = new Commande(42.0, 7.0, new LivraisonExpress());
        System.out.println("Total commande 2 : " + c2.calculerTotal() + "€");

        Commande c3 = new Commande(18.0, 0.0, new ClickAndCollect());
        System.out.println("Total commande 3 : " + c3.calculerTotal() + "€");
    }
}