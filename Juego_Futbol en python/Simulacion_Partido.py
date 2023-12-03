class PartidoFutbol:
    def main(self):
        teclado = Scanner()
        posicion, nom_jugador = "", ""
        ingreso_equi, entrar, edad, goles = 0, 0, 0, 0
        sumagoles_a, sumagoles_b, num_jugadores = 0, 0, 0
        penal, goles_penal_a, goles_penal_b = 0, 0, 0
        i, j, k, l = 1, 1, 1, 1
        print("Para ingresar datos escriba: [1 = Si] y [2 = No]")
        entrar = int(input())
        while entrar == 1:
            print("Listado de jugadores por equipo: ")
            print("Para ingresar los datos de los equipos presione [1 para Equipo A] o [2 para Equipo B]")
            ingreso_equi = int(input())

            if ingreso_equi == 1:
                print("Cuantos jugadores tiene el equipo A: ")
                num_jugadores = int(input())
                while i <= num_jugadores:
                    print("Nombre: ")
                    nom_jugador = input()
                    print("Posicion: ")
                    posicion = input()
                    print("Edad: ")
                    edad = int(input())
                    print("Goles: ")
                    goles = int(input())
                    print("Equipo A")
                    sumagoles_a += goles
                    print(f"| Nombre: {nom_jugador} | Posicion: {posicion} | Edad: {edad} | Goles: {goles} |")
                    i += 1
            else:
                print("Cuantos jugadores tiene el equipo B: ")
                num_jugadores = int(input())
                while j <= num_jugadores:
                    print("Nombre: ")
                    nom_jugador = input()
                    print("Posicion: ")
                    posicion = input()
                    print("Edad: ")
                    edad = int(input())
                    print("Goles: ")
                    goles = int(input())
                    print("Equipo B")
                    print(f"| Nombre: {nom_jugador} | Posicion: {posicion} | Edad: {edad} | Goles: {goles} |")
                    sumagoles_b += goles
                    j += 1
            if sumagoles_a == sumagoles_b:
                print("Tanda de penales equipo A: ")
                for k in range(1, 6):
                    print(f"Penal: {k}")
                    penal = int(input())
                    goles_penal_a += penal
                print("Tanda de penales equipo B: ")
                for l in range(1, 6):
                    print(f"Penal: {l}")
                    penal = int(input())
                    goles_penal_b += penal
            print("Desea seguir ingresar datos escriba: [1 = Si] y [2 = No]")
            entrar = int(input())
        print(f"Goles Equipo A: {sumagoles_a}")
        print(f"Goles Equipo B: {sumagoles_b}")
        print(f"Penales Equipo A: {goles_penal_a}")
        print(f"Penales Equipo B: {goles_penal_b}")
        if sumagoles_a > sumagoles_b or goles_penal_a > goles_penal_b:
            print("Equipo Ganador: Equipo A")
        elif goles_penal_a == goles_penal_b:
            print("Partido empatado")
        else:
            print("Equipo Ganador: Equipo B")
class Scanner:
    def nextInt(self):
        return int(input())
    def next(self):
        return input()
if __name__ == "__main__":
    partido_futbol = PartidoFutbol()
    partido_futbol.main()