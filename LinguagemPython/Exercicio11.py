valor_hora = 10.00
valor_hora_excedente = 20.00
e = 0
c = int(input("Informe o código: "))
n = float(input("Informe a quantidade de horas trabalhadas: "))

if n > 50:
    e = (n - 50) * valor_hora_excedente
    salario = (50 * valor_hora) + e
    print(f"Salário total R$ {salario}")
    print(f"Salário excedente R$ {e}")
else:
    salrio = (n * valor_hora)
    print(f"Salário total R$ {salario}")
    print(f"Salário excedente R$ {e}")