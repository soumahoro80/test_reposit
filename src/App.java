import java.util.ArrayList;
import java.util.List;

import ci.Class1;
import ci.modele.Adresse;
import ci.modele.Person;
public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        /*Person person = new Person();
        person.nom = "soum";
        person.prenom = "Yaya";
        person.age = 40;
        person.taille = 1.72f;
        person.hasJob = true;
System.out.println(person.nom);

System.out.println(
            "bonjour " + person.nom + " " + person.prenom + ", vous avez " + person.age + " ans et vous mesurez " + person.taille );*/
   
        Person p1 = new Person("soum", "yaya", "Abou kenza", 40 );
        
        //p1.afficher();
            Person p2 = new Person("soum", "Yaya", 20, 1.72f);
        //p2.afficher();  
        String var2 = p2.getSitua(true);
        //System.out.println(var2);

          String var1 = p1.getSitua();
          
          //p1.setNom("mourad");
          System.out.println(var1);
         // p2.setPrenom("soum");
         
         
         Person idData[] = new Person[2]; 
         idData[0] = p1;
         idData[1] = p2;
        for (Person var4 : idData) {
           //var4.afficher();
        }
        List<Person> maListe = new ArrayList<>();
        maListe.add(p1);
        maListe.add(p2);
        
        for (Person var5 : maListe) {
            //var5.afficher();
            //System.out.println(var5.toString());
        }

        //Class1 classe1 = new Class1("YAO", "Kouassi",1.90f);
       
        //boolean isPersonEquals = p1.equals(p2);
       //System.out.println(isPersonEquals);
       
    Adresse addr = new Adresse("Abidjan", "13 Bp Abj 13", "Carrefour awa");
    
    
    List<String> diplomes = new ArrayList<>();
    diplomes.add("CQP");
    diplomes.add("CAP");
    diplomes.add("BT");
    diplomes.add("BTS");
    //p1.setAdresse(addr);
    //p1.afficher();
    //addr.afficher();
    //p1.afficher();
    addr.afficher();
    p1.setDiplomes(diplomes);
    p1.afficher();
    
}



}
