package proyecto;
import java.util.Scanner;
public class ProyectoBimestral {
        public static void main(String[] args) {
        int numIng,numAdiv, limInt=5, intentos;
        boolean adivino = false;
        Scanner teclado = new Scanner(System.in);
        numAdiv = (int)(Math.random()*(10-1+1)+1);
        for (intentos = 1; intentos<= limInt;intentos++){
            System.out.print("En que numero estoy  pensando?: ");
            numIng=teclado.nextInt();
            if(numIng == numAdiv){
                adivino = true;
                break;
            }else if (intentos<=limInt){
                if (numAdiv>numIng)
                    System.out.println("Es mayor ");
            }
                
            
        }
    }
}
