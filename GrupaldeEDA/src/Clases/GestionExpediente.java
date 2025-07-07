package Clases;
public class GestionExpediente<T> {
    
    private Nodo<T> frente;
    private Nodo<T> ultimo;
    private int fechainicio,horainicio,fechafin,horafin;
    
    private Nodo<T> inicioLista;
    public GestionExpediente() {
        frente = null;
        ultimo = null;
        inicioLista =null;
    }
    
    public boolean esVacia() {
        if (frente == null) {
            return true;
        } else {
            return false;
        }
    }
    
    //Las fechas y horas por ahora estan en 0 hasta 
    //que entienda como implementarlo
    public void encolar(T pElemento){
        if (esVacia() == true){
            Nodo<T> nuevoNodo = new Nodo<T>(pElemento, null);
            frente = nuevoNodo;
            ultimo = nuevoNodo;
        } else { // La cola no está vacía
            Nodo<T> nuevoNodo = new Nodo<T>(pElemento, null);
            ultimo.setSgteNodo(nuevoNodo);
            ultimo = nuevoNodo;
        }
    }
    
    public T desencolar() {
        if (esVacia()) {
            return null; // o puedes lanzar una excepción si prefieres
        } else {
            T elemento = frente.getElemento();
            frente = frente.getSgteNodo();
            if (frente == null) {
                ultimo = null; // si la cola queda vacía
            }
            return elemento;
        }
    }
    
    public String FinTramite(Expediente Expediente){
        desencolar();
        return "Fecha de inicio: "+this.fechainicio+
                "\nHora de inicio: "+this.horainicio+
                "\nFecha de fin:"+this.fechafin+
                "\nFecha de fin: "+this.horainicio+
                "\nDocumentos: [dni: "+Expediente.getId()+", asunto: "+Expediente.getAsunto()+", documento: "+Expediente.getDocumento()+"]\n";
    }
    
    public String MostrarLista() {
        Nodo<T> aux = frente;
        String cola = "";
        if (aux == null) {
            cola = "Cola vacia.";
        } else {
            while (aux != null) {
                cola += "\n" + (Expediente) aux.getElemento();
                aux = aux.getSgteNodo();
            }
        }
        return cola;
    }
}
