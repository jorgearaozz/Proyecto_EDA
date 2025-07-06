package Clases;

import View.Menu;

public class Demo_EliminarLuego_ {
    public static void main(String[] args) {
        Expediente Expediente1 = new Expediente("","","",0,"","","","","");
        GestionExpediente Tramite1 = new GestionExpediente();
        
        Tramite1.InsertarFrente(Expediente1);
        Tramite1.MostrarCola();
        Menu x = new Menu();
        x.setVisible(true);
    }
}
