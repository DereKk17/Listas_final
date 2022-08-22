package TdaLista;

public class Lista<T> {
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
        nuevo.setDato(dato);

        if(isEmpty())
            inicio = nuevo;
        else{
            Nodo aux = new Nodo();
            aux.setSiguiente(inicio);

            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        size++;
    }

    public void appendComienzo(T dato){
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);

        if(isEmpty())
            inicio.setSiguiente(nuevo);
        else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        size++;
    }

    public Nodo buscar(T dato){
        Nodo siguiente = new Nodo();
        Nodo anterior = new Nodo();
        siguiente.setSiguiente(inicio);
        anterior.setSiguiente(siguiente);

        while(siguiente.getSiguiente() != null){

            if((siguiente.getDato() == dato)) {
                break;
            }
            siguiente = siguiente.getSiguiente();
            anterior = anterior.getSiguiente();

        }
        return anterior.getSiguiente();
    }

    public void appendEntre(T dato){
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);

        Nodo siguiente = new Nodo();
        Nodo anterior = new Nodo();
        siguiente.setSiguiente(inicio);
        anterior.setSiguiente(siguiente);

        while(siguiente.getSiguiente() != null){

            if((siguiente.getDato() == dato)){
              anterior.setSiguiente(nuevo);
              nuevo.setSiguiente(siguiente);
              break;
            }

            siguiente = siguiente.getSiguiente();
            anterior = anterior.getSiguiente();
        }
        size++;
    }

}
