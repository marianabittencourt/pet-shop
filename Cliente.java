
package PetShop;

public class Cliente {

    
    private String nome;
    private int idade;
    private String telefone;
    private String rg;
    private String cpf;
    
    
     Cliente(String nome,int idade,String telefone,String rg,String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.rg = rg;
        this.cpf = cpf;
        
    
    }

   

     public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}