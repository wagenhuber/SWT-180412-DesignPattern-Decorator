public class BMW318 implements Auto{

    @Override
    public double getPreis() {
        return 40000;
    }

    @Override
    public void druckeInfo() {
        System.out.print("BMW 318");
    }

}
