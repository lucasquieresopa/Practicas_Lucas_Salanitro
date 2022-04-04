import string
frase = "Tres tristes tigres, tragaban trigo en un trigal, en tres tristes trastos, tragaban trigo tres tristes tigres."
palabra = "tigres"

print(frase.lower().replace(',',"").replace('.',"").split().count(palabra))


