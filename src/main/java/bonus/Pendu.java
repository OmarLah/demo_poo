package bonus;

public class Pendu {

    private String masque;

    private int nbEssais;

    private String mot;

    public Pendu(int nbEssais) {
    }
    public int getNbEssais() {
        return nbEssais;
    }

    public void setNbEssais(int nbEssais) {
        this.nbEssais = nbEssais;
    }
    public String getMasque() {
        return masque;
    }

    public void setMasque(String masque) {
        this.masque = masque;
    }
    public String getMot() {
        return mot;
    }

    public void setMot(String mot) {
        this.mot = mot;
    }
    public boolean testChart(char c) {
        if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
            return true;
        }
        return false;
    }

    public String genererMasque(String mot) {
        this.mot = mot;
        char[] chars = mot.toCharArray();
        for(int i = 0; i < mot.length(); i++) {
            chars[i] = '*';
        }
        mot = String.valueOf(chars);
        this.masque = mot;
        return mot;
    }

    public String testWin(char c) {
        c = Character.toUpperCase(c);
        if (testChart(c) == false) {
            return ("La caractere saisis n'est pas une lettre");
        } else if (this.mot.contains(String.valueOf(c))) {
            String.valueOf(c).toUpperCase();
            char[] chars = this.mot.toCharArray();
            char[] chars2 = this.masque.toCharArray();

            for (int i = 0; i < mot.length(); i++) {
                if (chars[i] == c)
                    chars2[i] = c;
            }

            this.masque = String.valueOf(chars2);
            this.mot = String.valueOf(chars);
            if (this.mot.contains(String.valueOf('*'))) {
                return this.masque;
            } else if(this.masque.equals(this.mot)){
                return "Bravo Vous avez trouvez le mot mystère : " + this.masque;
            }
        }

        return this.masque;
    }
}
