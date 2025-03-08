/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ada_unidad2;
import static ada_unidad2.Ordenamientos.burbuja;
import static ada_unidad2.Ordenamientos.seleccion;
/**
 *
 * @author Akane
 */
public class main {
    public static void main(String[] args) {
        
        int[] numeros = {5, 3, 8, 4, 2}; // 1 
       
        /*METODO BURBUJA */
        burbuja(numeros); // 

        for (int num : numeros) {
            System.out.print(num + " "); // 1 
        }
                     
        /*METODO POR SELECCION*/    
        seleccion(numeros);  
        
        for (int num : numeros) {  
            System.out.print(num + " ");         
    }
    
}
}
