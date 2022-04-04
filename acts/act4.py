articulo = """Experiences in Developing a Distributed Agent-based Modeling Toolkit with Python.
Distributed agent-based modeling (ABM) on high-performance computing resources provides the promise of capturing unprecedented details of large-scale complex systems. However, the specialized knowledge required for developing such ABMs creates barriers to wider adoption and utilization. Here we present our experiences in developing an initial implementation of Repast4Py, a Python-based distributed ABM toolkit. We build on our experiences in developing ABM toolkits, including Repast for High Performance Computing (Repast HPC), to identify the key elements of a useful distributed ABM toolkit. We leverage the Numba, NumPy, and PyTorch packages and the Python C-API to create a scalable modeling system that can exploit the largest HPC resources and emerging computing architectures."""

facil = 0
aceptable = 0
dificil = 0
muy_dificil = 0

oraciones = articulo.replace("\n"," ").split(".")
titulo = oraciones[0]
oraciones = oraciones[1:]

for i in range(len(oraciones)):
    print(oraciones[i].split(" "))
    
    
for i in range(len(oraciones)):
    cant_palabras = len(oraciones[i].split(" "))
    print(cant_palabras)
    if(cant_palabras <= 12): 
        facil += 1
    elif(cant_palabras >= 13 and cant_palabras<= 17): 
        aceptable +=1
    elif(cant_palabras >= 18 and cant_palabras<= 25): 
        dificil += 1
    else:
        muy_dificil +=1


if len(titulo) >= 10:
    print("Titulo muy largo")
else:
    print("Titulo esta ok")

print(f'Cantidad de oraciones faciles de leer:{facil} aceptables para leer:{aceptable}, dificil de leer:{dificil}, muy dificil de leer:{muy_dificil}')