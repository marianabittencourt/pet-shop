
package pet.shop.agenda.de.horarios.logica;

import java.util.Vector;
import pet.shop.animal.logica.Animal;


public class CadastroAgendaDeHorarios {
    
    private Vector listaHorarios = new Vector();

    public Vector getListaAnimais() {
        return listaHorarios;
    }

   public void cadastrarAnimais(String nome, String animal, String data, String hora, String tipoDeServico) {
        AgendaDeHorarios agenda = new AgendaDeHorarios(nome, animal, data, hora, tipoDeServico);
        listaHorarios.addElement(agenda);
    }

    public void listarHorarios() {

        String auxLista = "";

        for (int i = 0; i < listaHorarios.size(); i++) {
            AgendaDeHorarios agenda = (AgendaDeHorarios) listaHorarios.elementAt(i);
           auxLista += agenda.getCliente()+ " - " + agenda.getAnimal()+ " - " + agenda.getData()+ " - " + agenda.getHora()+ " - "+ agenda.getTipoDeServiço()+ " - "+ "\n";
        }

    }

}
    

