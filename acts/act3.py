import string

texto = "Dado un texto solicite por teclado una letra e imprima las palabras que comienzan con dicha letra. En caso que no se haya ingresado una letra, indique el error. Ver: módulo string"


print("Ingrese una letra")
letra = input()
if letra in string.ascii_letters:
    for n in texto.split(" "):
        if n.startswith(letra):
            print(n)
else:
    print("No fue una letra")
