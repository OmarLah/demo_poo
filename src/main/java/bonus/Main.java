package bonus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Motsecret m = new Motsecret();
        Pendu p = new Pendu(15);
        Scanner sc = new Scanner(System.in);

        int count = 0;
        p.setNbEssais(10);
        System.out.println("TROUVER LE MOT MYSTERE :" + p.genererMasque(m.generateurMot()) + "en " +  p.getNbEssais() + " essais");

            for(int i = p.getNbEssais(); i > 0; i--) {
                if(p.getMasque().equals(p.getMot())){
                    break;
                } else {
                    System.out.println("Vous avez " + (p.getNbEssais() - count) + " essais");
                    System.out.println("Choisissez une lettre : ");
                    char lettre = sc.nextLine().charAt(0);
                    count++;
                    System.out.println(p.testWin(lettre));
                    System.out.println("------------------");


                }
        }


    }
}
