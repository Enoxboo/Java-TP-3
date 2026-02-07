public class Promotion {
    private final String nom;

    public Promotion(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Promotion flash pour " + nom;
    }
}