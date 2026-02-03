public class Main {
    public static void main(String[] args) {
        TPE tpe1 = TPE.getInstance();
        tpe1.pay(15.0f);

        TPE tpe2 = TPE.getInstance();
        tpe2.pay(25.5f);

        TPE tpe3 = TPE.getInstance();
        tpe3.pay(9.99f);

        System.out.println("Chiffre d'affaires: " + tpe1.getRevenue() + "€");
        System.out.println("Chiffre d'affaires: " + tpe2.getRevenue() + "€");

        tpe1.reset();

        System.out.println("Nouvelle journée: " + tpe1.getRevenue() + "€");
        System.out.println("Nouvelle journée: " + tpe2.getRevenue() + "€");
    }
}