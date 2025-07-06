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
    
    public void MostrarCola() {
        Nodo<T> aux = frente;
        while (aux != null) {
            System.out.print(" " + aux.getElemento());
            aux = aux.getSgteNodo();
        }
    }
    
    public void InsertarFrente(T Elemento) {
        if (esVacia() == true) {
            Nodo<T> nuevoNodo = new Nodo<T>(Elemento, null);
            frente = nuevoNodo;
            ultimo = nuevoNodo;
        } else { // La cola no está vacía
            Nodo<T> nuevoNodo = new Nodo<T>(Elemento, null);
            nuevoNodo.setSgteNodo(frente);
            frente = nuevoNodo;
        }
    }
    
    public String FinTramite(Expediente Expediente){
        return "Fecha de inicio: "+this.fechainicio+
                "\nHora de inicio: "+this.horainicio+
                "\nFecha de fin:"+this.fechafin+
                "\nFecha de fin: "+this.horainicio+
                "\nDocumentos: "+Expediente.getId()+Expediente.getAsunto()+Expediente.getDocumento()+"\n";
    }
     public void agregarALista(T elemento) {
        Nodo<T> nuevo = new Nodo<>(elemento, null);
        if (inicioLista == null) {
            inicioLista = nuevo;
            nuevo.setSgteNodo(inicioLista); // apuntamos a sí mismo
        } else {
            Nodo<T> aux = inicioLista;
            while (aux.getSgteNodo() != inicioLista) {
                aux = aux.getSgteNodo();
            }
            aux.setSgteNodo(nuevo);
            nuevo.setSgteNodo(inicioLista); // cierra el ciclo
        }
    }

    public void mostrarLista() {
        if (inicioLista == null) {
            System.out.println("Lista vacía");
            return;
        }

        System.out.println("Lista circular de expedientes:");
        Nodo<T> aux = inicioLista;
        do {
            System.out.println(aux.getElemento());
            aux = aux.getSgteNodo();
        } while (aux != inicioLista);
    }
    
    
    
}
