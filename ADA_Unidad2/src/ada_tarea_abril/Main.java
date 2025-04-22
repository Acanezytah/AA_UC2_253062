/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ada_tarea_abril;

/**
 *
 * @author Akane
 */
public class Main {
    public static void main(String[] args) {
         BST arbol = new BST();

        // Inserción de los valores
        int[] valores = {50, 30, 70, 20, 40, 60, 80};
        for (int valor : valores) {
            arbol.raiz = arbol.insertar(arbol.raiz, valor);
        }

        // Recorrido inorden antes de eliminar
        System.out.print("Inorden antes de eliminar: ");
        arbol.inorden(arbol.raiz);
        System.out.println();

        // Eliminación del nodo con valor 50 (tiene dos hijos)
        // Se reemplaza por su sucesor inorden (el menor valor del subárbol derecho: 60)
        arbol.raiz = arbol.eliminar(arbol.raiz, 50);

        // Recorrido inorden después de eliminar
        System.out.print("Inorden despues de eliminar 50: ");
        arbol.inorden(arbol.raiz);
        System.out.println();

        // Búsquedas
        int[] buscarValores = {30, 50, 60};
        for (int valor : buscarValores) {
            boolean encontrado = arbol.buscar(arbol.raiz, valor);
            System.out.println(valor + " encontrado? " + (encontrado ? "Si" : "No"));
        }
    }
}
