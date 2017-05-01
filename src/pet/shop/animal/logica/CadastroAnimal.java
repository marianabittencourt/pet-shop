package pet.shop.animal.logica;

import java.util.Vector;
import pet.shop.cliente.logica.Cliente;

public class CadastroAnimal {

    private Vector listaAnimais = new Vector();

    public Vector getListaAnimais() {
        return listaAnimais;
    }

    public void inserirAnimal(Animal animal) {
        listaAnimais.addElement(animal);
    }

    public void cadastrarAnimal() {

        String auxLista = "";

        for (int i = 0; i < listaAnimais.size(); i++) {
            Animal animal = (Animal) listaAnimais.elementAt(i);
            auxLista += animal.getNome() + " - " + animal.getIdade() + "\n";
        }

    }

}
