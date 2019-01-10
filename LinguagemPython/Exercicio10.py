p = float(input("Informe o peso dos peixes: "))

if p > 50:
    m = (p - 50) * 4.00
    e = 'excesso'
    print(f"Você deverá paga R$ {m}")
else:
    m = 0
    e = 0
    print(f"Multa: {m}")
    print(f"Excesso: {e}")