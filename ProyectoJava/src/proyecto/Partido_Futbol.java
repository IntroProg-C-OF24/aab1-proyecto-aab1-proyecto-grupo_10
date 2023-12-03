package Proyecto;
import java.util.Scanner;
public class Partido_Futbol {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String posicion, nomJugador;
        int ingresoEqui, entrar, edad, goles, sumagolesA=0, sumagolesB=0, numJugadores, penal, golesPenalA=0, golesPenalB=0, i=1, j=1, k=1, l=1;
        
        System.out.println("Para ingresar datos escriba: [1 = Si] y [2 = No]");
        entrar = teclado.nextInt();
        
        while(entrar == 1){
            System.out.println("Listado de jugadores por equipo: ");
            System.out.println("Para ingressr los datos de los equipos aplaste [1 para Equipo A] o [2 para Equipo B]");
            ingresoEqui = teclado.nextInt();
            if(ingresoEqui == 1){
                System.out.println("Cuantos jugadores tiene el equipo A: ");
                numJugadores = teclado.nextInt();
                while(i <= numJugadores){
                    System.out.println("Nombre: ");
                    nomJugador = teclado.next();
                    System.out.println("Posicion: ");
                    posicion = teclado.next();
                    System.out.println("Edad: ");
                    edad = teclado.nextInt();
                    System.out.println("Goles: ");
                    goles = teclado.nextInt();
                    System.out.println("Equipo A");
                    sumagolesA = sumagolesA + goles;
                    System.out.println("| "+" Nombre: "+nomJugador+" | "+" Posicion: "+posicion+" | "+" Edad: "+edad+" | "+" Goles: "+goles+" | ");
                    i = i + 1;
                }
            }else {
                System.out.println("Cuantos jugadores tiene el equipo B: ");
                numJugadores = teclado.nextInt();
                while(j <= numJugadores){
                    System.out.println("Nombre: ");
                    nomJugador = teclado.next();
                    System.out.println("Posicion: ");
                    posicion = teclado.next();
                    System.out.println("Edad: ");
                    edad = teclado.nextInt();
                    System.out.println("Goles: ");
                    goles = teclado.nextInt();
                    System.out.println("Equipo B");
                    System.out.println("| "+" Nombre: "+nomJugador+" | "+" Posicion: "+posicion+" | "+" Edad: "+edad+" | "+" Goles: "+goles+" | ");
                    sumagolesB = sumagolesB + goles;
                    j = j + 1;
                }
            }
            if(sumagolesA == sumagolesB){
                System.out.println("Tanda de penales equipo A: ");
                for (k = 1; k <= 5; k++) {
                    System.out.println("Penal: "+k);
                    penal = teclado.nextInt();
                    golesPenalA = golesPenalA + penal;                 
                }
                System.out.println("Tanda de penales equipo B: ");
                for (l = 1; l <= 5; l++) {
                    System.out.println("Penal: "+l);
                    penal = teclado.nextInt();
                    golesPenalB = golesPenalB + penal;
                }
            }
            System.out.println("Desea seguir ingresar datos escriba: [1 = Si] y [2 = No]");
            entrar = teclado.nextInt();   
        }
        System.out.println("Goles Equipo A: "+sumagolesA);
        System.out.println("Goles Equipo B: "+sumagolesB);
        System.out.println("Penales Equipo A: "+golesPenalA);
        System.out.println("Penales Equipo B: "+golesPenalB);
        if(sumagolesA > sumagolesB || golesPenalA > golesPenalB){
                System.out.println("Equipo Ganador: Equipo A ");               
            }else if(golesPenalA == golesPenalB){
                System.out.println("Partido empatado");      
            }else
                System.out.println("Equipo Ganador: Equipo B");
    }
    
}
