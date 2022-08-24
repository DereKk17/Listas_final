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

    public int obtenerIndiceDe(T dato){
        Nodo siguiente = new Nodo();
        Nodo anterior = new Nodo();
        siguiente.setSiguiente(inicio);
        anterior.setSiguiente(siguiente);

        int indice = 0;
        while(siguiente.getSiguiente() != null){

            if((siguiente.getDato() == dato)) {
                break;
            }

            siguiente = siguiente.getSiguiente();
            anterior = anterior.getSiguiente();
            indice ++;
        }
        return indice - 1 ;
    }

    public Object buscarPorIndice(int indice){
        Nodo aux = new Nodo();
        aux.setSiguiente(inicio);

        int i = -1;

        while(aux.getSiguiente() != null){
            if(i == indice){
                break;
            }
            aux = aux.getSiguiente();
            i++;
        }
        return aux.getDato();

    }

    public void appendEntre(T dato, T datoEnLista){
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);

        Nodo siguiente = new Nodo();
        Nodo anterior = new Nodo();
        siguiente.setSiguiente(inicio);
        anterior.setSiguiente(siguiente);

        while(siguiente.getSiguiente() != null){

            if((siguiente.getDato() == datoEnLista)){
              anterior.setSiguiente(nuevo);
              nuevo.setSiguiente(siguiente);
              break;
            }

            siguiente = siguiente.getSiguiente();
            anterior = anterior.getSiguiente();
        }
        size++;
    }

    public String toString(){
        String lista = "";
        for(Nodo n = inicio; n != null; n = n.getSiguiente()){
            lista = lista + " " + n.getDato();
        }
        return lista;
    }

    public void borrar(T dato) {
        Nodo anterior = new Nodo();
        Nodo actual = new Nodo();
        Nodo siguiente = new Nodo();

        siguiente.setSiguiente(inicio);
        actual.setSiguiente(siguiente);
        anterior.setSiguiente(actual);


        while (actual.getSiguiente() != null) {

            if ((actual.getDato() == dato)) {
                break;
            }
            actual = actual.getSiguiente();
            anterior = anterior.getSiguiente();
            siguiente = siguiente.getSiguiente();

        }

        anterior.setSiguiente(siguiente);

        size --;
    }

    public boolean esta(T dato){
        Nodo aux = new Nodo();
        aux.setSiguiente(inicio);
        boolean estado = false;

        while(aux.getSiguiente() != null){
            if(aux.getDato() == dato){
                estado = true;
            }
            aux = aux.getSiguiente();
        }
        return estado;
    }

}
