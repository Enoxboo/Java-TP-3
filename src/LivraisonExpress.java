public class LivraisonExpress implements StrategieLivraison {
    public double calculerFrais(double distance) {
        return distance * 1.5;
    }
}