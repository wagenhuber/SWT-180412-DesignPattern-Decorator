public class Main {
    public static void main(String[] args) {
        Auto auto = new Navigation(new BMW316());
        auto.druckeInfo();
        System.out.println(" für den Preis: " + auto.getPreis());

        auto = new Klimaanlage(auto);
        auto.druckeInfo();
        System.out.println(" für den Preis: " + auto.getPreis());
    }
}
