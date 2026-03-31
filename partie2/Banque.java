package partie2; 

import partie1.CompteBancaire; // هادي ضرورية باش البنكة تعرف شنو هو CompteBancaire

public class Banque {
    private String nom;
    private CompteBancaire[] comptes;
    private int nbActuels;

    public Banque(String nom, int capaciteMax) {
        this.nom = nom;
        this.comptes = new CompteBancaire[capaciteMax];
        this.nbActuels = 0;
    }

    public void ajouterCompte(CompteBancaire c) {
        if (nbActuels < comptes.length) {
            comptes[nbActuels] = c;
            nbActuels++;
        }
    }

    public void afficherTous() {
        System.out.println("\n--- Banque: " + nom + " ---");
        for (int i = 0; i < nbActuels; i++) {
            comptes[i].afficher();
        }
    }
}