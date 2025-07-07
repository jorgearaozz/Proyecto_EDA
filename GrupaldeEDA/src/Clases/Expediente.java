package Clases;
public class Expediente extends DatosExpediente{
    private String asunto,documento;
    private int id,prioridad;

    public Expediente(int id, int prioridad, String asunto, String documento, int dni, String nombre, String telefono, String correo) {
        super(dni, nombre, telefono, correo);
        this.id = id;
        this.prioridad = prioridad;
        this.asunto = asunto;
        this.documento = documento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public int getDni() {
        return super.getDni();
    }

    @Override
    public String getCorreo() {
        return super.getCorreo();
    }

    @Override
    public String getTelefono() {
        return super.getTelefono();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }
    
    //Expediente(id,prioridad(0|1),asunto,documento,dni,nombre,telefono,correo)
    
    @Override
    public String toString() {
        return "[id: " + id + 
                ", prioridad: " + prioridad +
                ", asunto: " + asunto + 
                ", documento: " + documento + 
                ", dni: "+getDni()+
                ", nombre: "+getNombre()+
                ", telefono: "+getTelefono()+
                ", correo: "+getCorreo()+
                "]"; 
    }
}

