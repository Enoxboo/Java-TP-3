public class Main {
    public static void main(String[] args) {
        Burger burger1 = BurgerFactory.createBurger(BurgerType.CHEESE);
        System.out.println(burger1.getRecipe() + " - " + burger1.getPrice() + "€");

        Burger burger2 = BurgerFactory.createBurger(BurgerType.VEGGIE);
        System.out.println(burger2.getRecipe() + " - " + burger2.getPrice() + "€");

        Burger burger3 = BurgerFactory.createBurger(BurgerType.CHICKEN);
        System.out.println(burger3.getRecipe() + " - " + burger3.getPrice() + "€");
    }
}
