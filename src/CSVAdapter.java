import java.util.HashMap;
import java.util.Map;

public class CSVAdapter implements AnalyseurVentes {
    private LecteurCSV lecteur;

    public CSVAdapter(LecteurCSV lecteur) {
        this.lecteur = lecteur;
    }

    @Override
    public double getTotalVentes() {
        double total = 0.0;

        for (int i = 1; i < lecteur.getNbLignes(); i++) {
            String[] colonnes = lecteur.getColonnes(i);

            String prixQuantite = colonnes[2].trim();
            String[] parts = prixQuantite.split("x");

            double prix = Double.parseDouble(parts[0]);
            int quantite = Integer.parseInt(parts[1]);

            total += prix * quantite;
        }

        return total;
    }

    @Override
    public int getNbCommandes() {
        return lecteur.getNbLignes() - 1;
    }

    @Override
    public Map<String, Double> getCAParProduit() {
        Map<String, Double> caParProduit = new HashMap<>();

        for (int i = 1; i < lecteur.getNbLignes(); i++) {
            String[] colonnes = lecteur.getColonnes(i);

            String produit = colonnes[1].trim();
            String prixQuantite = colonnes[2].trim();

            String[] parts = prixQuantite.split("x");
            double prix = Double.parseDouble(parts[0]);
            int quantite = Integer.parseInt(parts[1]);

            double montant = prix * quantite;

            caParProduit.put(produit, caParProduit.getOrDefault(produit, 0.0) + montant);
        }

        return caParProduit;
    }
}