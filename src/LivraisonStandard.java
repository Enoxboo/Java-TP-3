public class LivraisonStandard implements StrategieLivraison {
    public double calculerFrais(double distance) {
        return distance * 0.5;
    }
}