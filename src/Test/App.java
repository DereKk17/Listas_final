package Test;


import TdaLista.Lista;

public class App {
    public static void main(String[] args) {
        Lista<Integer> listaNumeros= new Lista<>();

        int dato = 11;

        for(int i = 0; i < 20; i ++){
            listaNumeros.append(dato);
            dato++;
        }


        System.out.println(listaNumeros);
        System.out.println(listaNumeros.size());

        dato = 11;
        for(int i = 0; i < 20; i ++){
            System.out.println(listaNumeros.buscar(dato));
            dato++;
        }

        listaNumeros.appendComienzo(10);
        listaNumeros.appendEntre(10,11);

        System.out.println(listaNumeros);
    }
}
