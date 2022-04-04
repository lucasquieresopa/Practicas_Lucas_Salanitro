palabra = input("Ingrese una palabra: ")

lista_valores = (('AEIOULNRST'),('DG'),('BCMP'),('FHVWY'),('K'),('JX'),('QZ'))

pts = 0
for i in palabra.upper():
    if i in lista_valores[0]: pts += 1
    if i in lista_valores[1]: pts += 2
    if i in lista_valores[2]: pts += 3
    if i in lista_valores[3]: pts += 4
    if i in lista_valores[4]: pts += 5
    if i in lista_valores[5]: pts += 8
    if i in lista_valores[6]: pts += 10

print(f'Palabra: {palabra}\n Puntos: {pts}')