package Prueba;


import TdaLista.Lista;

public class App {
    public static void main(String[] args) {
        Lista<Integer> listaNumeros= new Lista<>();

        int dato = 11;

        for(int i = 0; i < 20; i ++){
            listaNumeros.append(dato);
            dato++;
        }

    }
}
