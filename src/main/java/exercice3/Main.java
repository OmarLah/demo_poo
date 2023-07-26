package exercice3;


import exercice3.Joueur;

public class Main {
    public static void main(String[] args) {



        Joueur moi = new Joueur("moi");

        for (int i = 1; i < 21; i++) {
            moi.monterNiveau(i);
        }

        System.out.println(moi.getExp());

    }
}