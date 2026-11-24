public class App {

    public  App (){ }

    public static void main(String[] args)
    {
        // creation d'une connexion 1ere 
        Connexion c = Connexion.createConnexion("Paul","123");
        System.out.println(c.getName()+"--"+ c.getPass());

        // creation d'une connexion 2 eme
        Connexion b = Connexion.createConnexion("Daniel","1235");
        System.out.println(b.getName()+"--"+ b.getPass());

        //changement du mot de passe 
        b.SetPass("3245");
        System.out.println(b.getName()+"--"+ b.getPass());

        //On constate que  peut importe l'instance creee la valeur reste la meme
        // si on change  une information sur un attribut alors cela modifie toutes les instances
        //avec la meme valeur
        // ce qui traduit l'unicite de la connexion a la base de donnees

        //La seule facon de creer une nouvelle connexion est de detruire l'instance
        //en utilisant la methode closeConnexion()
        System.out.println(b.closeConnexion());

    }
}
