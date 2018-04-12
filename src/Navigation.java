public class Navigation extends Sonderausstattung {

    public Navigation(Auto auto) {
        super(auto);
    }

    @Override
    public double getPreis() {
        return auto.getPreis() + 2500.0;
    }

    @Override
    public void druckeInfo() {
        auto.druckeInfo();
        System.out.print(", Navigation");
    }
}
