import java.util.BitSet;

public class Main {
    private static void run(Provider p) {
        p.service1();
        p.service2();
        p.service1();
        p.service4();
        p.service3();
    }

    public static void main(String[] args) {
        BitSet bitSet = new BitSet();

        bitSet.set(1);
        bitSet.set(19);
        bitSet.set(20);
        bitSet.set(21);

        BitSetIterator iterator = new BitSetIterator(bitSet);

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();

        System.out.println(">>> Proxy fracture");
        InvoiceProxy invoiceProxy = new InvoiceProxy();
        run(invoiceProxy);

        System.out.println(">>> Coût total : " + invoiceProxy.totalCost());

        System.out.println(">>> Proxy fracture + authentification requise pour les version 3 et 4");
        Provider p = new ProtectionProxy(invoiceProxy, "1234");
        run(p);
        System.out.println(">>> Coût total avec authentification : " + invoiceProxy.totalCost());

        TacheComplexe tache1 = new TacheComplexe("tache1");
        tache1.add(new TacheElementaire("TacheElementaire1"));
        tache1.add(new TacheElementaire("TacheElementaire2"));
        tache1.add(new TacheElementaire("TacheElementaire3"));
        tache1.description();
        System.out.println("-----------------------------");
        TacheComplexe tache2 = new TacheComplexe("tache2");
        tache2.add(new TacheElementaire("TacheElementaire1"));
        tache2.add(tache1);
        tache2.description();
    }
}