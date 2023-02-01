public class TacheElementaire extends Tache{
    public TacheElementaire(String nom, int cout) {
        super(nom, cout);
    }
    public void description() {
        System.out.println("nom: " + super.getNom() + ", cout : " + super.getCout());
    }
}
