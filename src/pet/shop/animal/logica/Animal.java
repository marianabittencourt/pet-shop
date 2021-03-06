
package pet.shop.animal.logica;


public class Animal {
    
    
    private String nome;
    private int idade;
    private String raca;
    private double peso;
    private String tipo;
    private String clienteResponsavel;

    public Animal(String nome, int idade, String raca, double peso, String tipo, String clienteResponsavel) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.peso = peso;
        this.tipo = tipo;
        this.clienteResponsavel = clienteResponsavel;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getRaca() {
        return raca;
    }

    public double getPeso() {
        return peso;
    }

    public String getTipo() {
        return tipo;
    }

    public String getClienteResponsavel() {
        return clienteResponsavel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setClienteResponsavel(String clienteResponsavel) {
        this.clienteResponsavel = clienteResponsavel;
    }
    
    
    
    
    
}
