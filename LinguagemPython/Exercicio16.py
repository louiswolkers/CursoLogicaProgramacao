maior = 0
n = int(input("Informe um número: "))
while n != 0:
    if n > maior:
        maior = n
    n = int(input("Informe um número: "))
print(f"O maior número é {maior}")