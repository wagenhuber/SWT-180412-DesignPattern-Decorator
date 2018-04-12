public class Klimaanlage extends Sonderausstattung {

    public Klimaanlage(Auto auto) {
        super(auto);
    }

    @Override
    public double getPreis() {
        return auto.getPreis() + 1500.0;
    }

    @Override
    public void druckeInfo() {
        auto.druckeInfo();
        System.out.print(", Klimaanlage");
    }
}
