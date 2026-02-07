// CommandeValidationFacade.java
public class CommandeValidationFacade {
    private final ConnexionService connexionService;
    private final StockService stockService;
    private final TempsService tempsService;
    private final LivreurService livreurService;
    private final PerimetreService perimetreService;

    public CommandeValidationFacade() {
        this.connexionService = new ConnexionService();
        this.stockService = new StockService();
        this.tempsService = new TempsService();
        this.livreurService = new LivreurService();
        this.perimetreService = new PerimetreService();
    }

    public void validerCommande() {
        connexionService.verifierConnexion();
        stockService.verifierStock();
        tempsService.verifierTemps();
        livreurService.verifierLivreur();
        perimetreService.verifierPerimetre();
        System.out.println("Commande validée");
    }
}