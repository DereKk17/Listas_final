package Lista;

public class TDALista<T> {
    private Nodo inicio;
    private int size;
    Nodo nodo = new Nodo();

    public boolean isEmpty(){
        return inicio ==  null;
    }

    public int size() {
        return size;
    }

    public void append(T dato){
        Nodo nuevo = new Nodo();


        if(isEmpty())
            inicio = nuevo;
        else{
            Nodo aux = new Nodo();
            aux.setSiguiente(nuevo);

            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        size++;
    }

    public void appendComienzo(T dato){
        Nodo nuevo = new Nodo();

        if(isEmpty())
            inicio = nuevo;
        else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    public Nodo getIndexOf(T dato){
        Nodo aux = new Nodo();
        Nodo index = new Nodo();
        aux.setSiguiente(inicio);

        while(aux.getSiguiente() != null){

            if((aux.getDato() == dato)) {
                index = aux;
                break;
            }

            aux = aux.getSiguiente();

        }
        return index;
    }

}
