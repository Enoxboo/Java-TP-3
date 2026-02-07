import java.util.ArrayList;
import java.util.List;

public class BurgerFastRestaurant {
    private List<Observer> observers;

    public BurgerFastRestaurant() {
        this.observers = new ArrayList<>();
    }

    public void ajouterClientVIP(Observer client) {
        observers.add(client);
    }

    public void retirerClientVIP(Observer client) {
        observers.remove(client);
    }

    private void notifierClients(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void creerPromotionFlash(Promotion promo) {
        notifierClients(promo.toString());
    }
}