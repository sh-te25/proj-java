import java.util.Date;

public class Vol {
    Integer numVol;
    Date tempsDepart;
    Date tempsArrivee;
    String destination;
    String statut; // reporté, annulé, actif...

    public Vol(Integer nv, String st) {
        this.numVol = nv;
        this.statut = st;
    }

    void ajouterVoyageur() {
        System.out.println("Voyageur inscrit.");
    }

    void setPorteEmbarquement() {
        System.out.println("On peut accéder au vol depuis la porte 1.");
    }

}


