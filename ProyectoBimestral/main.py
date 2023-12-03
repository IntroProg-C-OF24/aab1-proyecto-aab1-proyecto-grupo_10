import random
def juego_adivina_numero():
    numero_adivinar = random.randint(1, 100)
    intentos = 5
    print("¿En que numero estoy pensando?")
    print(f"Tienes {intentos} intentos. ")
    while intentos > 0:
        adivino = int(input("Ingresa un  numero: "))
        if adivino == numero_adivinar:
            print("¡Felicidades! Has adivinado el número.")
            break
        else:
            intentos -= 1

            if adivino < numero_adivinar:
                print(f"El número es mayor. Intentos restantes: {intentos}")
            else:
                print(f"El número es menor. Intentos restantes: {intentos}")

        respuesta = input("¿Quieres más pistas? (si/no): ")

        if respuesta.lower() == "si":
            print("Pista: El número es par.")
            intentos -= 1
            print(f"Intentos restantes: {intentos}")

        if intentos == 0:
            print(f"Te has quedado sin intentos. El número era {numero_adivinar}.")
            break
    print("¡Gracias por jugar!")
if __name__ == "__main__":
    juego_adivina_numero()
