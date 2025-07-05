package Clases;
public class Nodo<T> {
    private T elemento;
    private Nodo sgteNodo;
    
    public Nodo(){
        elemento = null;
        sgteNodo = null;
    }

    public Nodo(T elemento, Nodo sgteNodo) {
        this.elemento = elemento;
        this.sgteNodo = sgteNodo;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Nodo getSgteNodo() {
        return sgteNodo;
    }

    public void setSgteNodo(Nodo sgteNodo) {
        this.sgteNodo = sgteNodo;
    }
}
