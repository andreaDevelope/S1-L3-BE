public class Sim {
    private String numeroSim;
    private double creditoDisponibile;
    private String[] listaChiamate = new String[5];
    private String[] chiamata = new String[2];

    public Sim(String numeroSim) {
       this.numeroSim = numeroSim;
       this.creditoDisponibile = 0;
    }

    public String getNumeroSim(){
        return this.numeroSim;
    }

    public void ricaricaSim(int param){
        this.creditoDisponibile += param;
    }



    public void stampaDati(){

    }
}
