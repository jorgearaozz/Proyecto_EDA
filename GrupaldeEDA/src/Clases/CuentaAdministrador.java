package Clases;
public class CuentaAdministrador {
    private String usuario,contraseña;
    private boolean ulima;

    public CuentaAdministrador(String usuario, String contraseña, boolean ulima) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.ulima = ulima;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isUlima() {
        return ulima;
    }

    public void setUlima(boolean ulima) {
        this.ulima = ulima;
    }
}
