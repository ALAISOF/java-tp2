package partie3;

import partie1.CompteBancaire; // استيراد الحساب
import partie2.Banque;         // استيراد البنكة

public class TestBanque {
    public static void main(String[] args) {
        // دابا تقدر تخدم بيهم عادي
        Banque myBank = new Banque("MarocBank", 10);
        
        CompteBancaire c1 = new CompteBancaire("Hassan", 5000, 1000);
        myBank.ajouterCompte(c1);
        
        myBank.afficherTous();
        
        System.out.println("Total comptes: " + CompteBancaire.getNbComptes());
    }
}