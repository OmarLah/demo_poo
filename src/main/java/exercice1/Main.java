package exercice1;

public class Main {
    public static void main(String[] args) {

        Chaise c1  = new Chaise();
        Chaise c2  = new Chaise(4, "Bois", "Marron", 19.50);


        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
