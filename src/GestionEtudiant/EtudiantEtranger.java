package td4.GestionEtudiant;

public class EtudiantEtranger extends Etudiant {
    public String origine;

    public EtudiantEtranger(String $nom, String $prenom, int $age, String $niveau, String $filiere, String $origine) {
        super($nom, $prenom, $age, $niveau, $filiere);
        this.origine = $origine;
    }

    public void affiche() {
        super.affiche();
        System.out.print("\t\t\t*\t\t\tpays d'origine : " + this.origine + "\n");
    }
}
