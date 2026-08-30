FILAS = 5
COLUMNAS = 5
 
 
def llenar_matriz():
    print("Ingrese los 25 valores de la matriz (5x5):\n")
    matriz = []
    for fila in range(FILAS):
        fila_actual = []
        for columna in range(COLUMNAS):
            valor = int(input(f"  Valor [fila {fila + 1}, columna {columna + 1}]: "))
            fila_actual.append(valor)
        matriz.append(fila_actual)
    return matriz
 
 
def mostrar_matriz(matriz):
    print("\n--- Matriz ingresada ---")
    for fila in matriz:
        print("".join(f"{valor:6d}" for valor in fila))
 
 
def main():
    matriz = llenar_matriz()
    mostrar_matriz(matriz)
 
 
if __name__ == "__main__":
    main()