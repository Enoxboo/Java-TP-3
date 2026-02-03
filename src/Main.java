public class Main {
    public static void main(String[] args) {
        Sandwich sandwich1 = new SandwichBuilder()
                .setBread("baguette")
                .setCheese("cheddar")
                .setVegetables("laitue, tomate")
                .setSauce("mayo")
                .setToasted(false)
                .build();

        Sandwich sandwich2 = new SandwichBuilder()
                .setBread("complet")
                .setMeat("rosbif")
                .build();

        Sandwich sandwich3 = new SandwichBuilder()
                .setBread("ciabatta")
                .setMeat("poulet")
                .setCheese("emmental")
                .setVegetables("tomate, oignon")
                .setSauce("moutarde")
                .setToasted(true)
                .build();

        System.out.println("Commande 1");
        System.out.println(sandwich1);
        System.out.println("\nCommande 2");
        System.out.println(sandwich2);
        System.out.println("\nCommande 3");
        System.out.println(sandwich3);
    }
}
