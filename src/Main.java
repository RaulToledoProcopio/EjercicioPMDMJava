import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada por teclado
        int opcion; //

        do { // Bucle que se repite hasta que el usuario pulsa el 0

            System.out.println("Menú:");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Ejercicio 8");
            System.out.println("0. Salir"); // Opción para salir del programa
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Ejercicio1(); // Llama a la función
                    break;
                case 2:
                    Ejercicio2();
                    break;
                case 3:
                    Ejercicio3();
                    break;
                case 4:
                    Ejercicio4();
                    break;
                case 5:
                    Ejercicio5();
                    break;
                case 6:
                    Ejercicio6();
                    break;
                case 7:
                    Ejercicio7();
                    break;
                case 8:
                    Ejercicio8();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Elije una opción válida");
                    break;
            }
        } while (opcion != 0);
    }

    public static void Ejercicio1() {
        int vida = 100;
        String personaje = "Naruto";
        System.out.println("El personaje " + personaje + " tiene " + vida + " puntos de vida.");
    }

    public static void Ejercicio2() {
        int energia = 80;
        // Determina si el personaje es fuerte o débil basándose en la energía
        String estado = energia > 50 ? "Personaje fuerte" : "Personaje débil";
        System.out.println(estado);
    }

    public static void Ejercicio3() {
        // Array que contiene los items
        String[] cofres = {"Espada", "Escudo", "Pocion"};
        // Itera sobre cada cofre y muestra lo que contiene
        for (String cofre : cofres) {
            System.out.println("Has encontrado: " + cofre);
        }
    }

    public static void Ejercicio4() {
        // Itera del 1 al 5
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Numero: " + i);
        }
    }

    public static void Ejercicio5() {
        Personaje goku = new Personaje("Goku", 100, 50); // Crea un nuevo personaje Goku
        goku.mostrarInfo();
    }

    public static void Ejercicio6() {
        String personaje = null; // Inicializa la variable personaje como nula
        // Comprueba si el personaje no es nulo
        if (personaje != null) {
            System.out.println("El personaje es " + personaje);
        } else {
            System.out.println("No hay personaje.");
        }
    }

    public static void Ejercicio7() {
        System.out.println(multiplicar(5)); // Llamamiento a la función multiplicar

        // Define una operación de suma
        Operacion operacion = (a, b) -> a + b;
        System.out.println(operacion.sumar(3, 4));
    }

    public static void Ejercicio8() {
        // Crea dos personajes, Goku y Vegeta
        Personaje goku = new Personaje("Goku", 100, 20);
        Personaje vegeta = new Personaje("Vegeta", 80, 25);

        // Bucle de combate
        while (goku.vida > 0 && vegeta.vida > 0) {
            goku.vida -= vegeta.ataque; // Goku recibe daño de Vegeta
            vegeta.vida -= goku.ataque; // Vegeta recibe daño de Goku
            // Muestra la vida actual de cada personaje
            System.out.println("Vida de Goku: " + goku.vida);
            System.out.println("Vida de Vegeta: " + vegeta.vida);
        }

        // Define quién ha ganado el combate
        if (goku.vida <= 0) {
            System.out.println("Vegeta ha ganado el combate.");
        } else {
            System.out.println("Goku ha ganado el combate.");
        }
    }

    public static int multiplicar(int num) {
        return num * 2;
    }

    // Clase Personaje
    static class Personaje {
        String nombre; // Nombre del personaje
        int vida; // Puntos de vida del personaje
        int ataque; // Puntos de ataque del personaje

        // Constructor para los atributos del personaje
        public Personaje(String nombre, int vida, int ataque) {
            this.nombre = nombre;
            this.vida = vida;
            this.ataque = ataque;
        }

        public void mostrarInfo() {
            System.out.println("Nombre: " + nombre + ", Vida: " + vida + ", Ataque: " + ataque);
        }
    }
}