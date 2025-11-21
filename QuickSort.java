import java.io.*;
import java.util.Arrays;

public class QuickSort {

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    static void ordenar(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            ordenar(arr, low, pi - 1);
            ordenar(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        try {
            
            BufferedReader br = new BufferedReader(new FileReader("c:\\ProgramasJava3C25\\AlgoritmosDeOrdenamiento\\QuickSort\\entrada_quicksort.txt"));
            String linea = br.readLine();
            br.close();

            if (linea != null) {
                String[] partes = linea.split(",");
                int[] numeros = new int[partes.length];
                for (int i = 0; i < partes.length; i++) {
                    numeros[i] = Integer.parseInt(partes[i].trim());
                }

                ordenar(numeros, 0, numeros.length - 1);

                BufferedWriter bw = new BufferedWriter(new FileWriter("salida_quicksort.txt"));
                bw.write("QuickSort Resultado: " + Arrays.toString(numeros));
                bw.close();
                
                System.out.println("Proceso QuickSort terminado.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}