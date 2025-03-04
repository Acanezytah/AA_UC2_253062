/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ada_unidad2;

/**
 *
 * @author Akane
 */
public class Ordenamientos {
    
/**
 * Método para realizar el ordenamiento burbuja
 * @param arr - El Arreglo
 * return: La lista ordenada
 */ 
     public static void burbuja(int[] arr) {
        int n = arr.length; // 1 

        for (int i = 0; i < n - 1; i++) { // (n-1) 
            for (int j = 0; j < n - 1 - i; j++) { // (n-1) + (n-2) + ... + 1 
                if (arr[j] > arr[j + 1]) { // 1 
                    // Intercambio de valores
                    int temp = arr[j];   // 1 
                    arr[j] = arr[j + 1]; // 1 
                    arr[j + 1] = temp;   // 1 
                }
                //O(n a la 2)
            }
        }
    }
}