package Clases;
import View.Menu;

public class Demo_EliminarLuego_ {
    private static int c=0;
    private static Local Local1 = new Local();
    private static Local Local2 = new Local();
    private static Local Local3 = new Local();
    public static void main(String[] args) {
        //Expediente(id,prioridad(0|1),asunto,documento,dni,nombre,telefono,correo)
        Expediente Expediente1 = new Expediente(1, 0, "asunto1", "documento1", 1, "Fabricio", "123", "@1");
        Expediente Expediente2 = new Expediente(2, 1, "asunto2", "documento2", 2, "Jorge", "456", "@2");
        Expediente Expediente3 = new Expediente(3, 1, "asunto3", "documento3", 3, "Gustavo", "789", "@3");
        Expediente Expediente4 = new Expediente(4, 0, "asunto4", "documento4", 4, "Luis", "999", "@4");
        
        //Local Funcs: 
        //Ingresar(Ingresa expediente),
        //MostrarColas(Muestra colas regulares y prioridad),
        //FinTramite(desencola y muestra datos)
        Ingresar(Expediente1);
        Ingresar(Expediente2);
        Ingresar(Expediente3);
        Ingresar(Expediente4);
        MostrarLocales();
        System.out.println("\n--\n");
        FinTramite(Local1);
        System.out.println("\n--\n");
        FinTramite(Local2);
        
        
        /*
          Menu x = new Menu();
          x.setVisible(true);
         */
    }
    public static void Ingresar(Expediente Expediente){
        if(c>2){
            c=0;
        }
        if(c==0){
            Local1.Ingresar(Expediente);
            c++;
        }else if(c==1){
            Local2.Ingresar(Expediente);
            c++;
        }else if(c==2){
            Local3.Ingresar(Expediente);
            c++;
        }
    }
    
    public static void MostrarLocales(){
        System.out.println("Local1: \n"+Local1.MostrarColas()+"\n");
        System.out.println("Local2: \n"+Local2.MostrarColas()+"\n");
        System.out.println("Local3: \n"+Local3.MostrarColas());
    }
    
    public static void FinTramite(Local Local){
        Local1.FinTramite();
    }
}
