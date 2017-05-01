package PetShop;

import java.util.Vector;

public class Loja {
    private int codigo;
    private Vector listaClientes = new Vector();

    Loja(int cod){
        this.codigo = cod;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void inserirCliente(Cliente clt){
        listaClientes.addElement(clt);
    }
    
    public String retornarCliente(){
        String auxLista = "";
        
        for(int i=0; i < listaClientes.size(); i++){
            Cliente cliente = (Cliente)listaClientes.elementAt(i);
            auxLista += cliente.getNome() + " - " +  cliente.getIdade() + "\n";
        }
        return auxLista;
    }

    public void alterarCliente(Cliente auxCliente) {
        for(int i=0; i<listaClientes.size(); i++){
            Cliente cliente = (Cliente)listaClientes.elementAt(i);
            if(cliente.getNome() == auxCliente.getNome()){
                listaClientes.setElementAt(auxCliente, i);
                break;
            }
        }
    }

    public void excluirCliente (Cliente auxCliente) {
        for(int i=0; i<listaClientes.size(); i++){
            Cliente cliente = (Cliente)listaClientes.elementAt(i);
            if(cliente.getNome() == auxCliente.getNome()){
                listaClientes.removeElementAt(i);
                break;
            }
        }
    }
    
}
