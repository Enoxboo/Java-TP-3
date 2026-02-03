public class SandwichBuilder {
    String bread;
    String meat;
    String cheese;
    String vegetables;
    String sauce;
    boolean toasted;

    public SandwichBuilder setBread(String bread) {
        this.bread = bread;
        return this;
    }

    public SandwichBuilder setMeat(String meat) {
        this.meat = meat;
        return this;
    }

    public SandwichBuilder setCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public SandwichBuilder setVegetables(String vegetables) {
        this.vegetables = vegetables;
        return this;
    }

    public SandwichBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public SandwichBuilder setToasted(boolean toasted) {
        this.toasted = toasted;
        return this;
    }

    public Sandwich build() {
        if (bread == null || bread.isEmpty()) {
            throw new IllegalStateException("Le pain est obligatoire pour construire un sandwich");
        }
        return new Sandwich(this);
    }
}
