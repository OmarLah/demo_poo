package exercice2;

public class Film {

    private String titre;
    private String realisateur;
    private String annee;
    private String genre;




    public Film(String t, String r, String a, String g) {
        this.titre = t;
        this.realisateur = r;
        this.annee = a;
        this.genre = g;
    }
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    @Override
    public String toString() {
        return("Film{titre = " + this.titre + ", realisateur = " + this.realisateur + ", date de sortie = " + this.annee + ", genre =  " + this.genre + "}");
    }
}
