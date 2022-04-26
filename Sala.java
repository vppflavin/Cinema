package Cinema;
public class Sala {

    private String nomeFilme;
    private int faixaEtaria;
    private int capacidade;

    public Sala(String entradaSala) {
        String[] entrada = entradaSala.split(";");

        this.nomeFilme = entrada[0];
        this.faixaEtaria = Integer.parseInt(entrada[1]);
        this.capacidade = Integer.parseInt(entrada[2]);

}
    public int setFaixaEtaria(String faixaEtaria){
        if(faixaEtaria.equalsIgnoreCase("L")){
            this.faixaEtaria = 0;
            return 0;
    }else{ 
         this.faixaEtaria = StringToInteger(faixaEtaria);
         return StringToInteger(faixaEtaria);  
        }

    }
     public int getFaixaEtaria(){
        return faixaEtaria;
     }

    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }

    public int getCapacidade(){
        return capacidade;
    }

    public void setNomeFilme(String nomeFilme){
        this.nomeFilme = nomeFilme;
    }

    public int StringToInteger(String entrada){
        return Integer.parseInt(entrada);
}
    }
