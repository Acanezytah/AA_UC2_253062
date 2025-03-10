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
        
        int[] listaBurbuja = {5, 3, 8, 4, 2}; // 1 
       
        /*METODO BURBUJA */
        burbuja(listaBurbuja); // 

        for (int num : listaBurbuja) {
            System.out.print(num + " "); // 1 
        }
                     
        /*METODO POR SELECCION*/ 
        int[] listaSeleccion = {5, 3, 8, 4, 2};
        seleccion(listaSeleccion);  
        
        for (int num : listaSeleccion) {  
            System.out.print(num + " ");         
    }
    
}
}
