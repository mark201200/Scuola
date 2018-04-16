package compito;

public class Atleta {
    private int numeroGol;
    private String squadra;
    private String nome;
    private String cognome;
    private String dataNascita;

    private void aggiornaGol(int g){
        numeroGol=g;
    }

    private void inizioAnno(int g){
        numeroGol=0;
    }

    private void aggiornaSquadra(String s){
        squadra=s;
    }

    public String ritornaSquadra() {
        return squadra;
    }

    public void impostaSquadra(String squadra) {
        this.squadra = squadra;
    }

    public String ritornaNome() {
        return nome;
    }

    public void impostaNome(String nome) {
        this.nome = nome;
    }

    public String ritornaCognome() {
        return cognome;
    }

    public void impostaCognome(String cognome) {
        this.cognome = cognome;
    }

    public String ritornaDataNascita() {
        return dataNascita;
    }

    public void impostaDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }
}
