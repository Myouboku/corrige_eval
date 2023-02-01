public class Database {
    private static Database singleObject;
    private final int record;
    private final String name;

    private Database(String name) {
        this.name = name;
        record = 0;
    }

    public static Database getInstance(String name) {
        synchronized (Database.class) {
            if (singleObject == null) {
                singleObject = new Database(name);
            }
        }
        return singleObject;
    }

    public void describeRecord() {
        System.out.println("Le numéro de l'enregistrement est " + record + " et le nom de la base de données est " + name);
    }

    public String getName() {
        return name;
    }
}
