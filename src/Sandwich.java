public class Sandwich {
    private final String bread;
    private final String meat;
    private final String cheese;
    private final String vegetables;
    private final String sauce;
    private final boolean toasted;

    Sandwich(SandwichBuilder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.cheese = builder.cheese;
        this.vegetables = builder.vegetables;
        this.sauce = builder.sauce;
        this.toasted = builder.toasted;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "pain='" + bread + '\'' +
                ", viande='" + meat + '\'' +
                ", fromage='" + cheese + '\'' +
                ", légumes='" + vegetables + '\'' +
                ", sauce='" + sauce + '\'' +
                ", grillé=" + toasted +
                '}';
    }

}
