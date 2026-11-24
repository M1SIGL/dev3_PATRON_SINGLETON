public final class Connexion
{ 
    //attributs prive pour l'encapsulation 
    private String name;
    private String pass;
    private static  Connexion dbConnexion = null;

    // constructeur prive
    // ceci annule le constructueur publique par defaut
    private Connexion(String name, String pass)
    {
        this.name = name;
        this.pass = pass;
    }

    public static   Connexion createConnexion(String name, String pass)
    {
        if(dbConnexion == null)
        {
            dbConnexion = new Connexion(name, pass);

        }
        return dbConnexion;
    }

    public  String closeConnexion()
    {
        this.dbConnexion = null;
        System.out.println(super.toString() +".closeConnexion()");
        return "closed....!";

    }

    //generation des getters et setter de la classe : Name
    //getter
    public String getName()
    {
        return  this.name;
    }

    //setter
    public  void  SetName(String name)
    {
        this.name = name;
    }

        //generation des getters et setter de la classe : Pass
    //getter
    public String getPass()
    {
        return  this.pass;
    }

    //setter
    public  void  SetPass(String pass)
    {
        this.pass = pass;
    }


}
