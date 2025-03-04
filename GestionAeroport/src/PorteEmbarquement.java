public class PorteEmbarquement {
    Integer noPorteEmbarquement;
    Integer noTerminal;
    Boolean statut; // ouverte, fermée; deux options possibles donc j'ai mis Boolean.

    public PorteEmbarquement(Integer npe, Integer nt, Boolean st) {
        this.noPorteEmbarquement = npe;
        this.noTerminal = nt;
        this.statut = st;
    }
}
