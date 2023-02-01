import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TacheComplexe extends Tache implements Iterable<Tache> {
    private final Collection<Tache> taches;

    public TacheComplexe(String nom, int cout) {
        super.setNom(nom);
        super.setCout(cout);
        this.taches = new ArrayList<>();
    }

    public void add(Tache tache) {
        taches.add(tache);
    }

    public void remove(Tache tache) {
        taches.remove(tache);
    }

    public Tache getChild(int i) {
        return (Tache) taches.toArray()[i];
    }

    public void description() {
        System.out.println("nom: " + super.getNom() + ", cout : " + super.getCout());
        System.out.print("Les taches qui la composent: ");

        for (Tache t : this) {
            System.out.print(t.getNom() + ", ");
        }
        System.out.println();
    }

    public Iterator<Tache> iterator() {
        return taches.iterator();
    }
}
