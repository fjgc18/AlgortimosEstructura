/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.algoritmosestructura;

/**
 *
 * @author Thinkpad
 */
public class Shell {

    /**
     * Método que implementa el algoritmo de ordenación Shell Sort.
     * @param array El array de enteros que será ordenado.
     * 
     * El algoritmo Shell Sort utiliza un enfoque de inserción modificado
     * que comienza comparando elementos distantes y va reduciendo esa 
     * distancia (gap) en cada iteración hasta llegar a una comparación
     * de elementos adyacentes (como el ordenamiento por inserción normal).
     */
    public static void shellSort(int[] array) {
        int n = array.length;  // Tamaño del array

        // El gap se inicia como la mitad del array y se reduce hasta 1
        for (int gap = n / 2; gap > 0; gap /= 2) {
            
            // Itera sobre los elementos desde la posición gap hasta el final del array
            for (int i = gap; i < n; i++) {
                // Almacena el valor actual en una variable temporal
                int temp = array[i];
                int j;

                // Desplaza los elementos del subarray que están separados por gap
                // y son mayores que el valor actual (temp)
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    // Desplaza el elemento hacia adelante
                    array[j] = array[j - gap];
                }

                // Coloca el valor temporal en su posición correcta
                array[j] = temp;
            }
        }
    }

    /**
     * Método principal para probar el algoritmo Shell Sort.
     * @param args No se utilizan argumentos en esta ejecución.
     */
    public static void main(String[] args) {
        // Array de ejemplo que será ordenado
        int[] array = {9, 7, 3, 1, 5, 2, 8, 6, 4};

        // Llamada al método de ordenación Shell Sort
        shellSort(array);

        // Muestra el array ordenado
        System.out.println("Array ordenado:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}



    

