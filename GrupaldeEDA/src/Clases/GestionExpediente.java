package Clases;
public class GestionExpediente<T> {
    
    private Nodo<T> frente;
    private Nodo<T> ultimo;
    
    public GestionExpediente() {
        frente = null;
        ultimo = null;
    }
    
    public boolean esVacia() {
        if (frente == null) {
            return true;
        } else {
            return false;
        }
    }
    
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
    
    
    
}
