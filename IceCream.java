import java.util.Scanner;

public class IceCream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many scoops of ice cream would you like?: ");
        int scoopCount = scanner.nextInt();
        scanner.nextLine(); // Clear input buffer

        String[] flavors = new String[scoopCount];

        System.out.println("\nPerfect! Now choose a flavor for each scoop:");
        System.out.println("    0. Chocolate");
        System.out.println("    1. Strawberry");
        System.out.println("    2. Vanilla");

        for (int i = 0; i < scoopCount; i++) {
            System.out.print("\n" + i + ". ");
            flavors[i] = scanner.nextLine();
        }

        System.out.println("\nThank you for your order! You've chosen the following flavors:");
        for (int i = 0; i < scoopCount; i++) {
            System.out.println("    " + i + ". " + flavors[i]);
        }

        System.out.print("\nIs that correct? Press Enter to continue");
        scanner.nextLine();

        System.out.println("\nAll set! Please go to the counter — Robotina will give you your ice cream 🍦");

        scanner.close();
    }
}


//Vamos a hacer un programa que haga un pedido online por cada helado ordenado, vamos a escoger cuantas bolas de helado le pondremos y sus sabores.

        //Ejemplo de como debe mostrarse en la terminal:
        /* 
            ¿Cuántas bolas de helado quieres?: 3

            ¡Perfecto! Ahora escoge de que sabor quieres cada helado: 
                0. Chocolate
                1. Fresa
                2. Vainilla

            ¡Gracias por tu orden! Has pedido los siguientes sabores:
                0. Chocolate
                1. Fresa
                2. Vainilla
            
            ¿Es correcto? presiona intro para continuar

            ¡Listo, tenemos tu orden! Acércate al mostrador y Robotina te entregará tu helado
        */

        // La cantidad y los sabores escoge el usuario

        //Los índices 0, 1 y 2 (y los que sean) no lo escribirá el usuario, saldrá automáticamente según la cantidad de bolas de helado que haya escogido el usuario. Primero saldrá 0. y esperará a que el usuario escriba el primer sabor y después del "enter" aparecerá el 1. para que el usuario escriba el segundo sabor y así sucesivamente.

        //Has de usar un array para almacenar los sabores de helado y un bucle para imprimirlos.

        //Mira en el ejemplo los saltos de línea que has de tener.
    
