package exercice3;

public class Joueur {

    private String nom;
    private int niveau = 1 ;
    private int exp;




    public Joueur(String n) {
        this.nom = n;

    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void effecterUneQuete() {
        exp += 10;
    }

    public void monterNiveau(int i) {

        if(this.exp < 100) {

            effecterUneQuete();

            System.out.println("Le joueur " + this.nom + " effectue la quête n° " + i);
        }
        if(this.exp == 100) {
            this.niveau += 1;
            this.exp = 0;
            System.out.println("Le joueur " + this.nom + " passe au niveau : " + this.niveau);
        }
//

    }
}
