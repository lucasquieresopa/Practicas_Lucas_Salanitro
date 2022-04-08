minas = [
'-----',
'*----',
'-----',
'--*--',
]


def comprobarMinas(minas,i,j,cant):
    '''Comprueba si hay una mina ('*')en la posicion indicada'''
    if minas[i][j] == '*':   
        cant += 1
    return cant

minas_resuelto = []
for i in range(4):

    texto = ('')
    
    for j in range(5):
    
        if minas[i][j] == '-':
            
            cant_bombas = 0
            
            if i > 0 and j > 0: # -> arriba izq
                cant_bombas = comprobarMinas(minas,i-1,j-1,cant_bombas)
            if i < 3 and j > 0: # -> abajo izq
                cant_bombas = comprobarMinas(minas,i+1,j-1,cant_bombas)
            if i > 0 and j < 4: # -> arriba der
                cant_bombas = comprobarMinas(minas,i-1,j+1,cant_bombas)
            if i < 3 and j < 4: # -> abajo der
                cant_bombas = comprobarMinas(minas,i+1,j+1,cant_bombas)
            
            if i > 0: # -> ver si arriba es *
                cant_bombas = comprobarMinas(minas,i-1,j,cant_bombas)
            if i < 3: #-> ver si abajo es *
                cant_bombas = comprobarMinas(minas,i+1,j,cant_bombas)
            if j > 0: #-> ver si izq es *
                cant_bombas = comprobarMinas(minas,i,j-1,cant_bombas)
            if j < 4: #-> ver si der es *
                cant_bombas = comprobarMinas(minas,i,j+1,cant_bombas)
                
            texto = (f'{texto}{cant_bombas}')
        else:
            texto = (f'{texto}*')    
    minas_resuelto.append(texto)

print(minas_resuelto)

"""def reemplazar(bombas,k,i):

    if bombas[i][k] == '-':
        bombas[i][k].replace('-','1')
    elif bombas[i][k]== '1':
        bombas[i][k].replace('-','2')
    elif bombas[i][k] == '2':
        bombas[i][k].replace('-','3')
    else:
        bombas[i][k].replace('-','4')
    print(bombas)
    
    return bombas
           
           
           
bombas = minas.copy()    

for i in range(4):
    for k in range(5):
        bombas[i][k].split()
print(bombas)

for i in range(4):
    for k in range(5):
        if bombas[i][k] == '*':
            
            if k > 0:
                # celdas izq
                reemplazar(bombas,k-1,i)
            if k < 4: 
                #celdas der
                reemplazar(bombas,k+1,i)
            if i > 0:
                #celdar arriba
                reemplazar(bombas,k,i-1)
            if i < 3:
                #celdas abajo
                reemplazar(bombas,k,i+1)
print(minas)
print(bombas)"""