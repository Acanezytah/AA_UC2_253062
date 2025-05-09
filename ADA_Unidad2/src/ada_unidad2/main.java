/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ada_unidad2;
import static ada_unidad2.Ordenamientos.burbuja;
import static ada_unidad2.Ordenamientos.insercion;
import static ada_unidad2.Ordenamientos.mergeSort;
import static ada_unidad2.Ordenamientos.quickSort;
import static ada_unidad2.Ordenamientos.seleccion;
/**
 *
 * @author Akane
 */
public class main {
    public static void main(String[] args) {
        
        int[] listaBurbuja = {5, 3, 8, 4, 2}; // 1 
       
        /*METODO BURBUJA */
        burbuja(listaBurbuja); // 

        for (int num : listaBurbuja) {
            System.out.print(num + " "); // 1 
        }
        System.out.println();           
        /*METODO POR SELECCION*/ 
        int[] listaSeleccion = {5, 3, 8, 4, 2};
        seleccion(listaSeleccion);  
        
        for (int num : listaSeleccion) {  
            System.out.print(num + " ");         
    }
        System.out.println();  
        
        /*METODO POR INSERCION*/
        int[] listaInsercion = {5, 3, 8, 4, 2};
        insercion(listaInsercion);
        
        for (int num : listaInsercion) {
            System.out.print(num + " ");
    
        }
        System.out.println();  
        
        /*METODO QUICKSORT*/
        int[] listaQuickSort = {5, 3, 8, 4, 2};
        int n = listaQuickSort.length;      

        quickSort(listaQuickSort, 0, n - 1);

        // Imprimir arreglo ordenado
        for (int num : listaQuickSort) {
            System.out.print(num + " ");
        }
        System.out.println(); 
        
        /* METODO MERGE SORT */
        int[] listaMergeSort = {5, 3, 8, 4, 2};
        int a = listaMergeSort.length;

        mergeSort(listaMergeSort, 0, a - 1);

        // Imprimir arreglo ordenado
        for (int num : listaMergeSort) {
            System.out.print(num + " ");
        }
        System.out.println();
}
}
