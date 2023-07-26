package exercice5;


public class Arbre extends Plante{

    private float circonference;
    public Arbre(String nom, float hauteur, String couleurFeuille, float circonference ) {
        super(nom, hauteur, couleurFeuille);
        this.circonference = circonference;
    }

    public void afficher() {
        System.out.println("Plante { nom = " + this.nom + ", hauteur = " + this.hauteur + "cm, couleur des feuilles = " + this.couleurFeuille + ", circonférence du tronc =" + this.circonference + "cm}");

    }
}