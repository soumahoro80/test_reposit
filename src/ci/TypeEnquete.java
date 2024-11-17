package ci;

import java.lang.StackWalker.StackFrame;

public class TypeEnquete {
        private int id;
        private String code ; 
        private String libelle;

    public static void main(String[] args) throws Exception {
        System.out.println("Start ....");
   
      
    
    }
    public TypeEnquete (int id, String code, String libelle){
        this.id = id;
        this.code = code;
        this.libelle = libelle;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public void AfficherTypeEnquete(){
        System.out.println("l'id de l'enquete est " +id + 
        " le code de l'enquete est " +code +" le titre de l'enquete est " +libelle);
    }
    @Override
    public String toString() {
        return "TypeEnquete [id=" + id + ", code=" + code + ", libelle=" + libelle + "]";
    }
    
}