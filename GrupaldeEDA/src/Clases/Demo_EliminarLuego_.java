package Clases;
import View.Menu;

public class Demo_EliminarLuego_ {
    public static void main(String[] args) {
        Local Local1 = new Local();
        //Expediente(id,prioridad(0|1),asunto,documento,dni,nombre,telefono,correo)
        Expediente Expediente1 = new Expediente(1, 0, "asunto1", "documento1", 1, "Fabricio", "123", "@1");
        Expediente Expediente2 = new Expediente(2, 1, "asunto2", "documento2", 2, "Jorge", "456", "@2");
        Expediente Expediente3 = new Expediente(2, 1, "asunto3", "documento3", 2, "Gustavo", "789", "@3");
        
        //Local Funcs: 
        //Ingresar(Ingresa expediente),
        //MostrarColas(Muestra colas regulares y prioridad),
        //FinTramite(desencola y muestra datos)
        Local1.Ingresar(Expediente1);
        Local1.Ingresar(Expediente2);
        Local1.Ingresar(Expediente3);
        Local1.MostrarColas();
        System.out.println("\n--\n");
        System.out.println(Local1.FinTramite(Expediente3));
        
        
        /*
          Menu x = new Menu();
          x.setVisible(true);
         */
    }
}
