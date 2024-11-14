package ci.modele;

public class Adresse implements Affichage{
String ville;
String codePostal;
String rue;

public Adresse(String s, String y, String z) {
    this.ville = s;
    this.codePostal = y;
    this.rue = z;
}

public String getVille() {
    return ville;
}

public void setVille(String ville) {
    this.ville = ville;
}

public String getCodePostal() {
    return codePostal;
}

public void setCodePostal(String codePostal) {
    this.codePostal = codePostal;
}

public String getRue() {
    return rue;
}

public void setRue(String rue) {
    this.rue = rue;
}
public void afficher(){
    System.out.println("Bonjour votre ville est " + this.ville + " vous habitez à "  + this.rue + " et votre code postal est  " + this.codePostal);
}

}

