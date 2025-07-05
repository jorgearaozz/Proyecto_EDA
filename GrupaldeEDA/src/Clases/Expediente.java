package Clases;
public class Expediente extends DatosExpediente{
    private String id,asunto,documento;
    private int prioridad;

    public Expediente(String id, String asunto, String documento, int prioridad, String dni, String nombre, String telefono, String correo) {
        super(dni, nombre, telefono, correo);
        this.id = id;
        this.asunto = asunto;
        this.documento = documento;
        this.prioridad = prioridad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    
    
    
    
}

