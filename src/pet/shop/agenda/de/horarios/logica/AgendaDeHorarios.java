
package pet.shop.agenda.de.horarios.logica;


public class AgendaDeHorarios {
    
    private String cliente;
    private String animal;
    private String data;
    private String hora;
    private String tipoDeServiço;

    public AgendaDeHorarios(String cliente, String animal, String data, String hora, String tipoDeServiço) {
        this.cliente = cliente;
        this.animal = animal;
        this.data = data;
        this.hora = hora;
        this.tipoDeServiço = tipoDeServiço;
    }

    public String getCliente() {
        return cliente;
    }

    public String getAnimal() {
        return animal;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public String getTipoDeServiço() {
        return tipoDeServiço;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setTipoDeServiço(String tipoDeServiço) {
        this.tipoDeServiço = tipoDeServiço;
    }
    
    
}
