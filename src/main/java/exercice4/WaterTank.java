package exercice4;

public class WaterTank {

    private float poidsAVide;
    private float capaciteMax = 100;
    private float niveauRemplissage;

    private static float volumeTotal;



    public WaterTank(float poids_a_vide, float niveau_remplissage) {
        this.poidsAVide = poids_a_vide;
        this.niveauRemplissage = niveau_remplissage;
        volumeTotal += this.niveauRemplissage;

    }
    public static float getVolume_total() {
        return volumeTotal;
    }

    public float getPoids_a_vide() {
        return poidsAVide;
    }
    public void setPoids_a_vide(float poids_a_vide) {
        this.poidsAVide = poids_a_vide;
    }

    public float getCapacite_max() {
        return capaciteMax;
    }

    public void setCapacite_max(float capacite_max) {
        this.capaciteMax = capacite_max;
    }

    public float getNiveau_remplissage() {
        return niveauRemplissage;
    }

    public void setNiveau_remplissage(float niveau_remplissage) {
        if(this.niveauRemplissage > niveau_remplissage){
            volumeTotal -= (this.niveauRemplissage - niveau_remplissage);
        } else if (this.niveauRemplissage < niveau_remplissage) {
            volumeTotal += (niveau_remplissage - this.niveauRemplissage);
        }
        this.niveauRemplissage = niveau_remplissage;
    }


    public String remplir(float volume) {
        if(this.capaciteMax >= this.niveauRemplissage + volume) {
            this.niveauRemplissage += volume;
            volumeTotal += volume;
            return ("Le quantité souhaité a été  ajouté : " + volume);
        } else {
            return("Le quantité d'eau que vous voulez ajouté est trop importante");
        }
    }

    public String vider(float volume) {
        if(this.niveauRemplissage >= volume) {
            this.niveauRemplissage -= volume;
            volumeTotal -= volume;
            return ("Le quantité souhaité a été  retiré : " + volume);
        } else {
            return("Le quantité d'eau que vous voulez vider est trop importante");
        }
    }



}
