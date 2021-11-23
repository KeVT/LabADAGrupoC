##Ej4Backspace.py

##Dado una cola doblemente enlazada, elimina tantos caracteres como # se encuentren después
from collections import deque

salida = deque('')
entrada = deque('abc#de##f#ghi#jklmn#op#')
for i in range(len(entrada)): 
  if entrada[i] != '#':     
    salida.append(entrada[i])
  else:
    salida.pop()
print(salida)

##Resultado
deque(['a', 'b', 'g', 'h', 'j', 'k', 'l', 'm', 'o'])
