package proyecto;
import java.util.Random;
import java.util.Scanner;
public class ProyectoJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAdivinar = random.nextInt(100) + 1; 
        int intentos = 5; 
        System.out.println("¿En que numero estoy pensando?");
        System.out.println("Tienes " + intentos + " intentos. ");
        while (intentos > 0) {
            System.out.print("Ingresa un numero: ");
            int adivino = scanner.nextInt();

            if (adivino == numeroAdivinar) {
                System.out.println("¡Felicidades! Has adivinado el numero.");
                break;
            } else {
                intentos--;

                if (adivino < numeroAdivinar) {
                    System.out.println("El número es mayor. Intentos restantes: " + intentos);
                } else {
                    System.out.println("El número es menor. Intentos restantes: " + intentos);
                }
            }

            System.out.print("¿Quieres más pistas? (si/no): ");
            String respuesta = scanner.next();

            if (respuesta.equalsIgnoreCase("si")) {
                System.out.println("Pista: El número es par.");
                intentos--;
                System.out.println("Intentos restantes: " + intentos);
            }

            if (intentos == 0) {
                System.out.println(" Te has quedado sin intentos. El número era " + numeroAdivinar + ".");
                break;
            }
        }
        System.out.println("¡Gracias por jugar!");
    }
}
