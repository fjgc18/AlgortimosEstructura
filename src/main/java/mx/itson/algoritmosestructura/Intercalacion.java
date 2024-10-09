/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.algoritmosestructura;

/**
 *
 * @author Thinkpad
 */
public class Intercalacion {

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Encontrar el punto medio del array
            int mid = (left + right) / 2;

            // Ordenar la primera mitad
            mergeSort(array, left, mid);
            // Ordenar la segunda mitad
            mergeSort(array, mid + 1, right);

            // Mezclar las dos mitades
            merge(array, left, mid, right);
        }
    }

    public static void merge(int[] array, int left, int mid, int right) {
        // Tamaños de los sub-arrays temporales
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Crear arrays temporales
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copiar datos a los arrays temporales
        for (int i = 0; i < n1; ++i)
            leftArray[i] = array[left + i];
        for (int j = 0; j < n2; ++j)
            rightArray[j] = array[mid + 1 + j];

        // Mezclar los arrays temporales
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copiar elementos restantes de leftArray (si los hay)
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copiar elementos restantes de rightArray (si los hay)
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 7, 3, 1, 5, 2, 8, 6, 4};
        mergeSort(array, 0, array.length - 1);

        // Mostrar el array ordenado
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

