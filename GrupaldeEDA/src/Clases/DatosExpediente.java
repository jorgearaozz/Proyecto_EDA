package Clases;
public class DatosExpediente {
    private String nombre,telefono,correo;
    private int dni;

    public DatosExpediente(int dni, String nombre, String telefono, String correo) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }  

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public int getDni() {
        return dni;
    }    
}
