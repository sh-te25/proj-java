public class Avion {
    String constructeur;
    Integer capacite;
    String statut; // réparation, en ravitaillement, prête

    public Avion(String cst, Integer cap, String st) {
        this.constructeur = cst;
        this.capacite = cap;
        this.statut = st;
    }
}
