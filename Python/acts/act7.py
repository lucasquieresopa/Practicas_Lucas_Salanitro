cadena = input("Ingrese una palabra o frase ")

heterograma = True
i = 0
conjunto_letras = []

while (heterograma == True)and(i < len(cadena)):
    letra = cadena[i]
    if letra in conjunto_letras:
        print("No es un heterograma")
        heterograma = False
    else:
        conjunto_letras.append(cadena[i])
    i += 1
if heterograma == True:
    print("Es un heterograma!!!!")

