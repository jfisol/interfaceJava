package org.figueroa.poointerfaces.imprenta.modelo;

public interface Imprimible {

    //public String imprimir();//métodos de la interface tiene que ser públic
   default public String imprimir(){
        return "Imprime un valor por defecto";
    } //evita que las clases que tengan implementadas la interface no necesite utilizar el metodo
}
