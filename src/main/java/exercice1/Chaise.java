package exercice1;
public class Chaise {

    private int pied;
    private String materiaux;
    private String couleur;
    private double prix;
    public Chaise() {
    }
    public Chaise(int p, String m, String c, double pr) {
        this.pied = p;
        this.materiaux = m;
        this.couleur = c;
        this.prix = pr;
    }


    public String toString() {
        return("Je suis une chaise avec " + this.pied + " en " + this.materiaux + " de couleur " + this.couleur + " à un prix de " + this.prix );
    }
}
