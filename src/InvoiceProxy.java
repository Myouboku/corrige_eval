public class InvoiceProxy implements Provider{
    private Provider provider;
    private int[] nbUses;
    private double[] costsOfServices;

    public InvoiceProxy() {
        provider = new RealProvider();
        nbUses = new int[] { 0, 0, 0, 0 };
        costsOfServices = new double[] { 11, 20, 22, 17 };
    }

    public void service1() {
        provider.service1();
        nbUses[0]++;
    }

    public void service2() {
        provider.service2();
        nbUses[1]++;
    }

    public void service3() {
        provider.service3();
        nbUses[2]++;
    }

    public void service4() {
        provider.service4();
        nbUses[3]++;
    }

    public double totalCost() {
        double totalCost = 0;
        for (int i = 0; i < nbUses.length; i++) {
            totalCost += nbUses[i] * costsOfServices[i];
        }
        return totalCost;
    }
}
