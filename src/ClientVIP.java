public class ClientVIP implements Observer {
    private final String nom;

    public ClientVIP(String nom) {
        this.nom = nom;
    }

    @Override
    public void update(String message) {
        System.out.println(nom + " a reçu : " + message);
    }
}