public class BurgerFactory {
    public static Burger createBurger(BurgerType type) {
        return switch (type) {
            case VEGGIE -> new BurgerVeggie();
            case CHEESE -> new CheeseBurger();
            case CHICKEN -> new ChickenBurger();
            default -> throw new IllegalArgumentException("Unknown burger type: " + type);
        };
    }
}
