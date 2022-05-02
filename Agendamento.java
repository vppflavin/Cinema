package Cinema;
import java.util.ArrayList;

public class Agendamento {
    // N numero de salas;
    // M numero de fileiras;
    
    private String nome;
    private String idade;
    private String filme;
    
     public Agendamento(String separar) {
        String[] separarA = separar.split(";");
         
        this.nome = separarA[0];
        this.idade = separarA[1];
        this.filme = separarA[2];
     }

    Agendamento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
     public void setNome(String nome){
         this.nome = nome;
     }
     
     public String getNome(){
         return nome;
     }
     
     public void setIdade(String idade){
         this.idade = idade;
     }
     
     public String getIdade(){
         return idade;
     }
     
     public void setFilme(String filme){
         this.filme = filme;
     }
     
    public String getFilme(){
        return filme;
    }
}
 