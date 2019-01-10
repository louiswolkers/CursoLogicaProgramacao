numero = int(input("Informe um número: "))
if numero % 2 == 0:
    if numero > 0:
        print(f"O número {numero} é par e positivo.")
    else:
        print(f"O número {numero} é par e negativo.")
else:
    if numero > 0:
        print(f"O número {numero} é impar e positivo")
    else:
        print(f"O número {numero} é impar e negativo")