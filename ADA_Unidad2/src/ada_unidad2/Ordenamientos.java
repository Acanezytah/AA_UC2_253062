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
 * Complejidad: O(n a la 2)
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
            }
        }
    }
     
    /*-----------------------------------------------------*/
     
    /**
     * Metodo para realizar el ordenamiento por selección
     * @param arr 
     * Complejidad: O(n a la 2)
     */
    public static void seleccion(int[] arr) {
        int n = arr.length;  // 1 

        for (int i = 0; i < n - 1; i++) {  // n-1
            int minIndex = i;  // 1 

            for (int j = i + 1; j < n; j++) {  // n-i-1
                if (arr[j] < arr[minIndex]) {  // n
                    minIndex = j;  // 1 
                }
            }

            // Intercambio
            int temp = arr[i];  // 1 
            arr[i] = arr[minIndex];  // 1 
            arr[minIndex] = temp;  // 1 
        }
    }
    
     /*-----------------------------------------------------*/
    
    /**
     * Metodo para realizar el metodo por inserción
     * @param arr 
     * Complejidad: O(n a la 2)
     */
    public static void insercion(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {  
            int key = arr[i];  
            int j = i - 1;  

            while (j >= 0 && arr[j] > key) {  
                arr[j + 1] = arr[j];  
                j--;  
            }
            arr[j + 1] = key;  
        }
    }
    
    /*-----------------------------------------------------*/
    
    /**
     * Metodo para realizar el metodo quickSort de ordenamiento
     * @param arr , inicio y fin
     * Complejidad: O(n a la 2)
     */
    static void quickSort(int arr[], int inicio, int fin) {
        if (inicio < fin) {
            int pivote = particion(arr, inicio, fin); 

            // Ordena recursivamente los elementos antes y después del pivote
            quickSort(arr, inicio, pivote - 1);
            quickSort(arr, pivote + 1, fin);
        }
    }

    /**
     * Metodo para realizar la particion del metodo quicksort
     * @param arr , inicio y fin
     * Complejidad: O(n a la 2)
     */
    static int particion(int arr[], int inicio, int fin) {
        int pivote = arr[fin]; 
        int i = inicio - 1; 

        for (int j = inicio; j < fin; j++) {
            if (arr[j] < pivote) { 
                i++;
                // Intercambiar arr[i] y arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Intercambiar 
        int temp = arr[i + 1];
        arr[i + 1] = arr[fin];
        arr[fin] = temp;

        return i + 1; 
    }
    
    /**
    * Metodo para realizar la mezcla en Merge Sort
    * @param arr, inicio, medio y fin
    * Complejidad: O(n)
    */
   static void mezclar(int arr[], int inicio, int medio, int fin) {
       int n1 = medio - inicio + 1;
       int n2 = fin - medio;

       int izquierda[] = new int[n1];
       int derecha[] = new int[n2];

       for (int i = 0; i < n1; i++) {
           izquierda[i] = arr[inicio + i];
       }
       for (int j = 0; j < n2; j++) {
           derecha[j] = arr[medio + 1 + j];
       }

       int i = 0, j = 0, k = inicio;
       while (i < n1 && j < n2) {
           if (izquierda[i] <= derecha[j]) {
               arr[k] = izquierda[i];
               i++;
           } else {
               arr[k] = derecha[j];
               j++;
           }
           k++;
       }

       while (i < n1) {
           arr[k] = izquierda[i];
           i++;
           k++;
       }

       while (j < n2) {
           arr[k] = derecha[j];
           j++;
           k++;
       }
   }

   /**
    * Metodo recursivo de Merge Sort
    * @param arr, inicio y fin
    * Complejidad: O(n log n)
    */
   static void mergeSort(int arr[], int inicio, int fin) {
       if (inicio < fin) {
           int medio = inicio + (fin - inicio) / 2;

           mergeSort(arr, inicio, medio);
           mergeSort(arr, medio + 1, fin);

           mezclar(arr, inicio, medio, fin);
       }
   }



    }


