## 🧠 ¿Qué es QuickSort?

**QuickSort** (o Algoritmo de Ordenación Rápida) es un algoritmo de ordenamiento por **comparación** que sigue el paradigma **"Divide y Vencerás"** (**Divide and Conquer**). Es reconocido por ser uno de los algoritmos de ordenación más rápidos y eficientes en la práctica.

### Concepto y Funcionamiento

1.  **Selección del Pivote:** Se elige un elemento del arreglo (llamado **pivote**) como punto de referencia. En esta implementación en Java, se usa el último elemento del sub-arreglo.
2.  **Partición:** Se reordenan los elementos de tal manera que todos los **menores o iguales** al pivote quedan a su izquierda, y todos los **mayores** quedan a su derecha. El pivote queda en su posición final de ordenación. 
3.  **Recursión:** El proceso se aplica **recursivamente** a los sub-arreglos a la izquierda y a la derecha del pivote hasta que todo el arreglo está ordenado.

| Característica | Detalle |
| :--- | :--- |
| **Tiempo Promedio** | $O(n \log n)$ |
| **Peor Caso** | $O(n^2)$ |

---

## 🛠️ Instrucciones de Uso

Esta aplicación en Java lee un archivo de texto con números separados por comas, los ordena usando QuickSort y escribe el resultado en un archivo de salida.

### Requisitos

Necesitas tener instalado el **Java Development Kit (JDK 8 o superior)** para compilar y ejecutar el código.

### 1. Preparar el Archivo de Entrada

El programa espera que exista un archivo llamado `entrada_quicksort.txt` en el mismo directorio donde se ejecute.

* **Nombre del Archivo:** `entrada_quicksort.txt`
* **Formato:** Una línea de números enteros separados por comas.

**Ejemplo de contenido para `entrada_quicksort.txt`:**