package td4.GestionEtudiant;

public class Classe {
    private final int maxEt;
    private Etudiant[] listeEt;
    private int nbEt;

    public Classe(int $maxEt) {
        maxEt = $maxEt;
        listeEt = new Etudiant[this.maxEt];
    }

    public void ajouterEtudiant(Etudiant et) {
        int i = 0;
        while (i < listeEt.length && listeEt[i] != null)
            i++;
        if (i <= listeEt.length)
            listeEt[i] = et;
        else
            System.out.println("La classe est pleine !");
    }

    public void afficherListe() {
        System.out.println("\n\t\t\t*********************************************************************************************************************************");
        System.out.println("\t\t\t\t\t\t\t\t\t -------Classe " + this.listeEt[0].getNiveau() + " " + this.listeEt[0].getFiliere() + "-------");
        for (Etudiant etudiant : listeEt) {
            if (etudiant != null) {
                etudiant.affiche();
            }
        }
        System.out.println("\t\t\t* \n\t\t\t********************************************************************************************************************************* \n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tBYE\n\n");
    }
}
