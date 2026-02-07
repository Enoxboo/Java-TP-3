public class Main {
    public static void main(String[] args) {
        BurgerFastRestaurant restaurant = new BurgerFastRestaurant();
        ClientVIP matteo = new ClientVIP("Matteo");
        restaurant.ajouterClientVIP(matteo);

        Promotion promo1 = new Promotion("Super promo");
        restaurant.creerPromotionFlash(promo1);


    }
}