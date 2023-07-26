package exercice5;

public class Plante {

    protected String nom;
    protected float hauteur;
    protected String couleurFeuille;

    public Plante(String nom, float hauteur, String couleurFeuille) {
        this.nom = nom;
        this.hauteur = hauteur;
        this.couleurFeuille = couleurFeuille;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getHauteur() {
        return hauteur;
    }

    public void setHauteur(float hauteur) {
        this.hauteur = hauteur;
    }

    public String getCouleurFeuille() {
        return couleurFeuille;
    }

    public void setCouleurFeuille(String couleurFeuille) {
        this.couleurFeuille = couleurFeuille;
    }

    public void afficher() {
        System.out.println("Plante { nom = " + this.nom + ", hauteur = " + this.hauteur + "cm, couleur des feuilles = " + this.couleurFeuille + "}");

    }





}