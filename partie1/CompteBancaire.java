package partie1; // هادي كتقول بلي هاد الملف كاين وسط دوسي partie1

public class CompteBancaire {
    private int numero;
    private String titulaire;
    private double solde;
    private double decouvertAutorise;

    private static int nbComptes = 0;
    private static double tauxInteretAnnuel = 0.03;

    public CompteBancaire() {
        nbComptes++;
        this.numero = nbComptes;
        this.titulaire = "Inconnu";
        this.solde = 0.0;
        this.decouvertAutorise = 0.0;
    }

    public CompteBancaire(String titulaire, double soldeInitial, double decouvertAutorise) {
        nbComptes++;
        this.numero = nbComptes;
        this.titulaire = titulaire;
        this.solde = soldeInitial;
        this.decouvertAutorise = decouvertAutorise;
    }

    // ... (باقي الميتودات: afficher, deposer, retirer, virementVers ...)
    // غادي تخليهم كولهم كيفما كانو فلكود لي فات
    
    public void afficher() {
        System.out.println("Compte N" + numero + " | Titulaire: " + titulaire + " | Solde: " + solde);
    }
    
    public void deposer(double montant) { if (montant > 0) this.solde += montant; }
    
    public void retirer(double montant) {
        if (montant > 0 && (this.solde + this.decouvertAutorise) >= montant) this.solde -= montant;
    }

    public void virementVers(CompteBancaire autre, double montant) {
        if ((this.solde + this.decouvertAutorise) >= montant) {
            this.retirer(montant);
            autre.deposer(montant);
        }
    }

    public double calculerSoldeAvecInterets() {
        this.solde += (this.solde * tauxInteretAnnuel);
        return this.solde;
    }

    public double calculerSoldeAvecInterets(double bonus) {
        this.solde += (this.solde * (tauxInteretAnnuel + bonus));
        return this.solde;
    }

    public static int getNbComptes() { return nbComptes; }
    public static double getTauxInteretAnnuel() { return tauxInteretAnnuel; }
}