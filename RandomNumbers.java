import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        //Escribe un programa que genere un array de 2 dimensiones de 100 filas y 10 columnas  con números aleatorios del 0 al 99, a través de un bucle anidado (Si no te suenan estos conceptos, ¡búscalos!)
        int[][] array = new int[100][10];
        Random random = new Random();
        for (int fila = 0; fila < 100; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                array[fila][columna] = random.nextInt(100); // Números entre 0 y 99
            }
        }
        for (int fila = 0; fila < 100; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                System.out.print(array[fila][columna] + "\t");
            }
            System.out.println();
            /**
             * Function name: randomNumber
             *
             * @return (int)
             *
             * Inside the function:
             * 1. generate random numbers from 0 to 99
             */


            /**
             * Function name: print2DArray
             *
             * @param integers (2D array int)
             *
             * Inside the function:
             * 1. nested loop that prints a 2D array using the randomNumber function
             */

        }
    }
}