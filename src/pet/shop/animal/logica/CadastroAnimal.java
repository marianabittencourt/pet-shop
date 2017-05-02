package pet.shop.animal.logica;

import java.util.Vector;


public class CadastroAnimal {

    private Vector listaAnimais = new Vector();

    public Vector getListaAnimais() {
        return listaAnimais;
    }

   public void cadastrarAnimais(String nome, int idade, String raca, double peso, String tipo,String clienteResponsavel) {
        Animal animal = new Animal(nome, idade, raca, peso, tipo, clienteResponsavel);
        listaAnimais.addElement(animal);
    }

    public void listarAnimal() {

        String auxLista = "";

        for (int i = 0; i < listaAnimais.size(); i++) {
            Animal animal = (Animal) listaAnimais.elementAt(i);
            auxLista += animal.getNome() + " - " + animal.getIdade()+ " - " + animal.getRaca()+ " - " + animal.getPeso()+ " - "+ animal.getTipo()+ " - " + animal.getClienteResponsavel()+ "\n";
        }

    }

}
