package exercice2;

public class Main {
    public static void main(String[] args) {

        Film f1 = new Film("La Haine", "Mathieu Kassovitz", "1995-05-31", "Drame");
        Film f2 = new Film("Avatar 2", "James Cameron", "2022-12-14", "Action");

        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}
