package ci.modele;


import java.util.List;

public class Person implements Affichage {
    private String nom;
    private String prenom;
    private int age;
    private float taille;
    private boolean hasJob;
    private Adresse adresse;
    private List<String> diplomes;
    

    public Person (String n, String z, String x, int a)
    {
    
        nom = n;
        prenom = z;
        age = a;
       
    }


   public Person (String n, String p, int a, float b)
   {
    nom = n;
    prenom = p;
    age = a;
    taille = b;

   }
   
   public Person(String d, String e, int f) {
        this("nom", "prenom",19,1.87F);
        //System.out.println("constructeur person avec 3 param");
    }

/*public Person(String nom, String prenom, String prenom2, int age, float taille, boolean hasJob) {
    this.nom = nom;
    this.prenom = prenom;
    this.prenom2 = prenom2;
    this.age = age;
    this.taille = taille;
    this.hasJob = hasJob;*/

    public void afficher() {
        System.out.println(
            "bonjour, " + this.nom + " " + this.prenom + ", vous avez " + this.age + " ans et vous mesurez " + this.taille );
        if (adresse != null) {
            adresse.afficher();
        }
        if (diplomes != null) {
            System.out.println("diplome" + this.diplomes);
        }
   
    }
    public String getSitua(){
        String situation = hasJob ? "En emploi" : "Au chomage";
       // System.out.println(situation);
        return situation;  
    }

    public String getSitua(boolean hasJob){
        String situation = hasJob ? "En emploi" : "Au chomage";
        //System.out.println(situation);
        return situation;  
    }

  
    /*@Override
    public String toString() {
        return "Person [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", taille=" + taille + ", hasJob="
                + hasJob + ", toString()=" + super.toString() + "]";
    }*/



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (nom == null) {
            if (other.nom != null)
                return false;
        } else if (!nom.equalsIgnoreCase(other.nom))
            return false;
        if (prenom == null) {
            if (other.prenom != null)
                return false;
        } else if (!prenom.equalsIgnoreCase(other.prenom))
            return false;
        return true;

    
    }


    public Adresse getAdresse() {
        return adresse;
    }


    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }


    public List<String> getDiplomes() {
        return diplomes;
    }


    public void setDiplomes(List<String> diplomes) {
        this.diplomes = diplomes;
    }



    }

    


