import java.util.Scanner;

public class Boxes {
    public static void main(String[] args) {
        String[] cajas = {
                "Libros",
                "Utensilios de cocina",
                "Artículos de baño",
                "Bolsos",
                "Zapatos",
                "Cosas de verano",
                "Cosas de invierno",
        };
                Scanner scanner = new Scanner(System.in);

                System.out.print("Hola, soy tu asistente de la organización ¿Qué deseas buscar? ");
                String búsqueda = scanner.nextLine();

                int indiceCaja = -1;  // -1 significa no encontrado
                for (int i = 0; i < cajas.length; i++) {
                    // Para hacer la búsqueda case-insensitive, convierto todo a minúsculas
                    if (cajas[i].equalsIgnoreCase(búsqueda)) {
                        indiceCaja = i;
                        break;
                    }
                }


                if (indiceCaja != -1) {
                    System.out.println(búsqueda + " están en la caja " + indiceCaja);
                } else {
                    System.out.println(búsqueda + " no las empacaste, oops!");
                }

                scanner.close();
            }
        }

        
        /* ¡Nos mudamos de piso! Vamos a crear un pequeño programa que nos ayude a saber en que caja pusimos las siguientes cosas:

        Caja 0. Libros
        Caja 1. Utensilios de cocina
        Caja 2. Artículos de baño
        Caja 3. Bolsos
        Caja 4. Zapatos
        Caja 5. Cosas de verano
        Caja 6. Cosas de invierno
        */

        //Crea un array con las cosas que contienen las cajas

        //Pregunta al usuario lo siguiente: Hola, soy tu asistente de la organización ¿Qué deseas buscar? (la respuesta deberá aparecer en la terminal en la misma línea)

        //¡Crea un programa que te devuelva lo siguiente: <cosas> están en la caja <índice> en el caso de no existir que devuelva: <cosas> no las empacaste, oops!


