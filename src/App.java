

import ci.Enquete;
import ci.TypeEnquete;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Start ....");

        // Création des objets TypeEnquete
        TypeEnquete te1 = new TypeEnquete(1, "012024", "enquête des CQP");
        TypeEnquete te2 = new TypeEnquete(2, "022024", "enquête des CAP");
        
        //te1.AfficherTypeEnquete();
        //te2.AfficherTypeEnquete();
       
        Enquete e1 = new Enquete(1, "enquête des CQP", "enquête des apprentis C2D2", te1);
        Enquete e2 = new Enquete(2, "enquête des CAP", "enquête des formés des états ETFPA", te2);
       
        //e1.AfficherEnquete();
        //e2.AfficherEnquete();
       
        Enquete[] enqueteList = {e1, e2};
        for (Enquete enquete : enqueteList) {
            System.out.println(enquete);
    }
    }
}
