package exemple1__du_cours;

public final class Singleton {
    private static Singleton instance = null;
    // D'autres attributs, classiques et non "static".
    private String attribut1;
    private int attribut2;

    // Constructeur de l'objet.
    private Singleton() {
        // La présence d'un constructeur privé supprime le constructeur public par défaut.
        super();
    }

    // Méthode renvoyant une instance de la classe Singleton
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // D'autres méthodes classiques et non "static".
    public void op1(int x, int y, int z) {
        this.attribut1 = "bonjour"; // Note : dans l'image, il y a une faute de frappe (attrib1 au lieu de attribut1)
    }

    public void op2(int x, int y, int z) { }
}
