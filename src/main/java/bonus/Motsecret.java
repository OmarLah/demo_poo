package bonus;

import java.util.Random;

public class Motsecret {


    private String[] tabMot = {"MAISON", "PHARMACIE", "VOITURE", "COMMUNAUTAIRE", "ASSOCIATION"};



    public static String motChoisi;
    public Motsecret() {
        this.tabMot = tabMot;
        this.generateurMot();
    }
    public static String getMotChoisi() {
        return motChoisi;
    }
    public String generateurMot() {

        Random r = new Random();
        return  this.motChoisi = this.tabMot[r.nextInt(this.tabMot.length)];

}


}
