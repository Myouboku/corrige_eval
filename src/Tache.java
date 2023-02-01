public abstract class Tache {
    private String nom;
    private int cout;

    public void add(Tache component) {
        throw new UnsupportedOperationException();
    }

    public void remove(Tache component) {
        throw new UnsupportedOperationException();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Tache getChild(int i) {
        return null;
    }

    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }

    public abstract void description();
}
