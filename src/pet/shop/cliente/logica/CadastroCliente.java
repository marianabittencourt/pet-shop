package pet.shop.cliente.logica;

import java.util.Vector;

public class CadastroCliente {

    private Vector listaClientes = new Vector();

    public Vector getListaClientes() {
        return listaClientes;
    }

    public void cadastrarCliente(String nome, int idade, String telefone, String rg, String cpf) {
        Cliente cliente = new Cliente(nome, idade, telefone, rg, cpf);
        listaClientes.addElement(cliente);
    }
    
    public String listarClientes() {
        String clientes = "";

        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente cliente = (Cliente) listaClientes.elementAt(i);
            clientes += cliente.getNome() + " - " + cliente.getIdade() + "\n";
        }
        return clientes;
    }


}
