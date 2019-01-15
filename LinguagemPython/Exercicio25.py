vetor = []
posicao = 0
tem_maior_50 = false
for n in range(0, 10):
    num = int(input("Informe {0} valor para o vetor: ".format(n+1)))
    vetor.append(num)
for n in vetor:
    if n > 50:
        print("O número {0} está na posição {1} do vetor.".format(n, vetor.index(n)))
        tem_maior_50 = true
    posicao = posicao + 1
if tem_maior_50 == False:
    print("Não existe nenhum número maior que 50")