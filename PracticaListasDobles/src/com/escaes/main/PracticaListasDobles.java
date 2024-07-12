package com.escaes.main;

public class PracticaListasDobles {
    public static void main(String[] args) {

        DoubleLinkedList x=new DoubleLinkedList();

        x.crearListaDoble();
        x.ordenarLista();

        System.out.println("Lista ordenada de inicio a fin");

        x.imprimirListaInicioFin();
        

        System.out.println("--------------------------------------");
        System.out.println("Lista ordenada de fin a inicio");
        x.imprimirListaFinInicio();
    
        x.mostrarCantidad(0);


    }
}
