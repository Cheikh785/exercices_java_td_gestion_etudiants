package td4.GestionEtudiant;

public class Etudiant {
    private String nom;
    private String prenom;
    private int age;
    private String niveau;
    private String filiere;

    public Etudiant() {}
    public Etudiant(String $nom, String $prenom, int $age, String $niveau, String $filiere) {
        this.nom = $nom;
        this.prenom = $prenom;
        this.age = $age;
        this.niveau = $niveau;
        this.filiere = $filiere;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getNiveau() {
        return niveau;
    }

    public String getFiliere() {
        return filiere;
    }

    public void affiche() {
        System.out.print("\t\t\t*\t\t\t\t\t\t -------Etudiant-------" + "\n\t\t\t*\t\t\tnom : " + this.nom + "\n\t\t\t*\t\t\tprenom : " + this.prenom + " \n\t\t\t*\t\t\tage : " + this.age + "\n\t\t\t*\t\t\tniveau : " + this.niveau + " \n\t\t\t*\t\t\tfilière : " + this.filiere + "\n");
    }

}


