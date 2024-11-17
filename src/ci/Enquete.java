package ci;

public class Enquete {
        private int id;
        private String titre ; 
        private String description;
        private TypeEnquete TypeEnquete;

    public static void main(String[] args) throws Exception {
        System.out.println("Start ....");
    }
  
    public Enquete (int id, String titre, String description, TypeEnquete TypeEnquete){
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.TypeEnquete = TypeEnquete;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public TypeEnquete getTypeEnquete() {
        return TypeEnquete;
    }
    public void setTypeEnquete(TypeEnquete typeEnquete) {
        TypeEnquete = typeEnquete;
    }

    public void AfficherEnquete(){
        System.out.println("l'id de l'enquete est " +id + 
        " le code de l'enquete est " +titre +" le titre de l'enquete est " +description + 
        " le type de l'enquete est " +TypeEnquete);
    }

    @Override
    public String toString() {
        return "Enquete [id=" + id + ", titre=" + titre + ", description=" + description + ", TypeEnquete="
                + TypeEnquete + "]";
    }
   
}
    
