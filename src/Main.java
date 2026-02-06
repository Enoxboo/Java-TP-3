public class Main {
    public static void main(String[] args) {
        LecteurCSV lecteur = new LecteurCSV("ventes.csv");
        System.out.println(lecteur.getNbLignes());

        AnalyseurVentes analyseur = new CSVAdapter(lecteur);

        BurgerAnalytics analytics = new BurgerAnalytics(analyseur);

        analytics.genererRapport();
    }
}