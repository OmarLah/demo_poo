package exercice4;

public class Main {
    public static void main(String[] args) {

        WaterTank w1 = new WaterTank(100, 10);

        WaterTank w2 = new WaterTank(70, 25);


        System.out.println("WaterTank 1 volume de depart : " + w1.getNiveau_remplissage());
        System.out.println("WaterTank 2 volume de depart : " + w2.getNiveau_remplissage());
        System.out.println("Volume total des WaterTank : " + WaterTank.getVolume_total());
        w1.remplir(5);
        System.out.println("Volume total des WaterTank : " + WaterTank.getVolume_total());
        w1.remplir(60);
        System.out.println("Volume total des WaterTank : " + WaterTank.getVolume_total());
        w2.vider(5);
        System.out.println("Volume total des WaterTank : " + WaterTank.getVolume_total());
        w2.vider(20);
        System.out.println("Volume total des WaterTank : " + WaterTank.getVolume_total());
        System.out.println("WaterTank 1 volume de depart : " + w1.getNiveau_remplissage());
        System.out.println("WaterTank 2 volume de depart : " + w2.getNiveau_remplissage());
        System.out.println("Poids total de la citerne 1 : " + (w1.getNiveau_remplissage() + w1.getPoids_a_vide()) + " Kg") ;
        System.out.println("Poids total de la citerne 2 : " + (w2.getNiveau_remplissage() + w2.getPoids_a_vide()) + " Kg");


    }
}
