/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.algoritmosestructura;

/**
 *
 * @author Thinkpad
 */
public class EdadesShell {
    public static void shellSort(int[] array) {
        int n = array.length;
        
        // Inicialización del gap : Comienza dividiendo el array por la mitad (gap = n / 2) y 
        //ya partir de ahí reduce progresivamente el gap dividiéndolo por 2 en cada iteración.
        for (int gap = n / 2; gap > 0; gap /= 2) {
            
            // Ordenamiento por inserción con gap : Para cada valor de gap, se recorre el array y
            //se realiza una especie de ordenamiento por inserción para los elementos que están separados por esa cantidad de posiciones.
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;
                
                // Mover elementos del array que estén desordenados con respecto al gap
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                
                // Insertar el elemento en su posición correcta
                array[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] edades = {45, 22, 85, 30, 12, 70, 33, 20};

        System.out.println("Edades antes de ordenar: ");
        for (int edad : edades) {
            System.out.print(edad + " ");
        }
        
        shellSort(edades);
        
        System.out.println("\nEdades después de ordenar con Shell Sort: ");
        for (int edad : edades) {
            System.out.print(edad + " ");
        }
    }
}

