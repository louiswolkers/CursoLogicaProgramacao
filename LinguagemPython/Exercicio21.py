vetor = []
pares = []
impares = []
for n in range(1, 6):
    vetor.append(n)
    if n % 2 == 0:
        pares.append(n)
    else:
        impares.append(n)

for p in pares:
    print(p)

print("***************")

for p in impares:
    print(p)
