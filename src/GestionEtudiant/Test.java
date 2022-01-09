package td4.GestionEtudiant;

public class Test {
    public static void main(String[] args) {
        Classe L1Maths = new Classe(4);
        L1Maths.ajouterEtudiant(new Etudiant("Sene", "Pierre", 21, "L1", "Maths"));
        L1Maths.ajouterEtudiant(new EtudiantEtranger("Tall", "Moussa", 20, "L1", "Maths", "Mauritanie"  ));        L1Maths.ajouterEtudiant(new EtudiantEtranger("Tall", "Moussa", 20, "L1", "Maths", "Mauritanie"  ));
        L1Maths.ajouterEtudiant(new EtudiantEtranger("Tallaaa", "Moussa", 20, "L1", "Maths", "Mali"  ));


        L1Maths.afficherListe();
    }
}
