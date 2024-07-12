package com.escaes.main;
import java.util.Scanner;

public class DoubleLinkedList {

NodoDouble head;//cabeza
NodoDouble tail;//cola o ultimo nodo de la lista

    DoubleLinkedList(){

        this.head=null;
        this.tail=null;

    }


    public int crearListaDoble(){

        String resp;
        int contNodos=0;
        Scanner read=new Scanner(System.in); 
        System.out.println("Desea crear una lista doble?(s/n)");
        resp=read.nextLine();

        while(resp.equals("s")){

            
            
            System.out.println("Escriba el dato a guardar: ");
            int valor=read.nextInt();
            read.nextLine();
            NodoDouble p=new NodoDouble(valor);
            
            if(head==null){
                head=p;// Si la lista está vacía, el nuevo nodo es la cabeza
                tail=p;// También es el último nodo ya que es el único nodo
                contNodos++;
            }else{
                
                tail.next=p;//Enlazar el nuevo nodo al siguinte de la cola. 
                p.prev=tail;//Hacer que el nodo anterior sea el previo ya que en la siguiente linea de codigo apenas 
                // se hace que la cola sea igual al valor. 
                contNodos++;
            }
            tail=p;//Se habia enlazado el valor de P anteriormente en el next de la cola, 
            //ahora simplemente pasa la cola a obtener ese valor.

            System.out.println("Desea agregar un nuevo dato?:(s/n)");
            resp=read.nextLine();
            
        }
        read.close();
       
        return contNodos;
     
    }


  public void imprimirListaInicioFin(){

        NodoDouble temp=head;
        int contNodos=0;
        if (temp==null){
         System.out.println("La lista esta vacia."); 
         return;  
        }else{

            while (temp!=null) {
                
                System.out.println(temp.dato);
                contNodos++;
                temp=temp.next;
                
            }

            System.out.println("La cantidad de datos es:"+contNodos);
        }

  }  

  public void imprimirListaFinInicio(){

    //Aca se busca imprimir la lista desde el fin al inicio, asi que se inicializa el nodo temporal en la cola(tail), y sencillamente
    //se retrocede con el prev en vez del next

    NodoDouble temp=tail;
    int contNodos=0;
    if(temp==null){
        System.out.println("la lista esta vacia.");

        return;

    }else{
        while(temp!=null){

            System.out.println(temp.dato);
            contNodos++;

            temp=temp.prev;

        }
        
        System.out.println("La cantidad de datos es:"+contNodos);
    }
  }

    public void ordenarLista(){

        NodoDouble p=head;

        if(p==null){
            System.out.println("Lista vacia.");

            return;

        }

        while (p.next!=null) {
            NodoDouble temp=p.next;

            while (temp!=null) {
                if (p.dato>temp.dato) {
                    int aux=p.dato;
                    p.dato=temp.dato;
                    temp.dato=aux;
                }
            temp=temp.next;
            }
        
        p=p.next;
        }
    }

    public void mostrarCantidad(int contNodos){

        System.out.println(contNodos);

    }


}
