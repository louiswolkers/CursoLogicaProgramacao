altura = float(input("Informe sua altura: "))
sexo = input("Informe seu sexo M/F: ")

if sexo.lower() == 'm':
    peso_ideal = (72.7 * altura) - 58
elif sexo.lower() == 'f':
    peso_ideal = (62.1 * altura) - 44.7
else:
    peso_ideal = 0
    print("Opção inválida.")

if peso_ideal > 0:
    print(f"Seu peso ideal é {peso_ideal:.2f}")


