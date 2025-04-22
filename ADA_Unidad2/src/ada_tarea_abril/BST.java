/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ada_tarea_abril;

/**
 *
 * @author Akane
 */
public class BST {
    // Clase nodo del árbol
    static class Nodo {
        int valor;
        Nodo izquierdo, derecho;

        Nodo(int valor) {
            this.valor = valor;
            izquierdo = derecho = null;
        }
    }

    Nodo raiz;

    /**
     * Inserta un nuevo valor en el árbol
     */
    public Nodo insertar(Nodo nodo, int valor) {
        if (nodo == null) return new Nodo(valor);

        if (valor < nodo.valor) {
            nodo.izquierdo = insertar(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertar(nodo.derecho, valor);
        }
        return nodo;
    }

    /**
     * Realiza una búsqueda de un valor en el árbol
     */
    public boolean buscar(Nodo nodo, int valor) {
        if (nodo == null) return false;
        if (valor == nodo.valor) return true;
        return valor < nodo.valor ? buscar(nodo.izquierdo, valor) : buscar(nodo.derecho, valor);
    }

    /**
     * Elimina un nodo con el valor dado del árbol
     * Si el nodo tiene dos hijos, se reemplaza por su sucesor inorden (el menor valor del subárbol derecho)
     */
    public Nodo eliminar(Nodo nodo, int valor) {
        if (nodo == null) return null;

        if (valor < nodo.valor) {
            nodo.izquierdo = eliminar(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = eliminar(nodo.derecho, valor);
        } else {
            // Nodo encontrado
            if (nodo.izquierdo == null)
                return nodo.derecho;
            else if (nodo.derecho == null)
                return nodo.izquierdo;

            // Nodo con dos hijos: buscar sucesor inorden
            nodo.valor = valorMinimo(nodo.derecho);
            nodo.derecho = eliminar(nodo.derecho, nodo.valor);
        }
        return nodo;
    }

    /**
     * Encuentra el valor mínimo de un subárbol (usado para encontrar el sucesor inorden)
     */
    public int valorMinimo(Nodo nodo) {
        int minimo = nodo.valor;
        while (nodo.izquierdo != null) {
            minimo = nodo.izquierdo.valor;
            nodo = nodo.izquierdo;
        }
        return minimo;
    }

    /**
     * Imprime el recorrido inorden (izquierda, raíz, derecha)
     */
    public void inorden(Nodo nodo) {
        if (nodo != null) {
            inorden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inorden(nodo.derecho);
        }
}
}
