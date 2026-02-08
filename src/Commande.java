public class Commande {
    private final double prixPlats;
    private final double distance;
    private final StrategieLivraison strategieLivraison;

    public Commande(double prixPlats, double distance, StrategieLivraison strategieLivraison) {
        this.prixPlats = prixPlats;
        this.distance = distance;
        this.strategieLivraison = strategieLivraison;
    }

    public double calculerTotal() {
        double frais = strategieLivraison.calculerFrais(distance);
        return prixPlats + frais;
    }
}