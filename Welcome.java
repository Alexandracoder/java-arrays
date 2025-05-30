public class Welcome {
    public static void main(String[] args) {

        //Crea un array que contenga 5 nombres de coders y con un bucle 'for-each' imprime: ¡Hola <name>, bienvenida a Java!
        String[] names = {"Paola", "Paulinchi", "Mary", "Bruna", "More",};
        for (String name : names) {
            System.out.println("------------------------");
            System.out.println("¡Hola " + name + ", bienvenida a Java! ");
        }
        //Escribe un bucle 'for' que imprima solo los siguientes números: 10 - 30 - 50 - 70 - 90 del array numbers, sin modificarlo ni creando uno nuevo
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        for (int i = 0; i <9; i+=2) {
            System.out.println();
            System.out.println(numbers[i]);
        }


            //Crea un array que contenga algunos números y usa un bucle 'for-each' e imprime cada número duplicado (multiplicado por 2)
        int[] numbers1 = { 8 ,4 , 6, 9, 20, 10};
        for (int num : numbers1 ) {
            System.out.println("------------------------");
            System.out.println( num * 2);
        }

            //Crea un array de tipo char que contenga las vocales en minúsculas y usa un bucle 'for-each' e imprime cada vocal en mayúsculas
        char[] vowels = { 'a','e', 'i', 'o', 'u'};
        for (char Vowel : vowels) {
            System.out.println();
            System.out.println(String.valueOf(Vowel).toUpperCase());
        }
    }


    }

