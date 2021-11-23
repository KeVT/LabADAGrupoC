##Ej5InterviewWait.py

##En una cola doblemente enlazada, dado un índice se compara el primer y último elemento de la cola
##y el menor valor se va acumulando, sumando y borrando hasta que el primer o último valor sea igual al 
##índice inicial. Finalmente imprime la suma acumulada. Utilizando colas doblemente enlazadas.

from collections import deque

entrada = deque([4, -1, 5, 2, 3])
index = -1
b = 0
for i in range(len(entrada)-2): 
  n = len(entrada)
  if (entrada[0] != index) or (entrada[n-1] != index):
      a = min(entrada[0], entrada[n-1])
      entrada.remove(a)
      b = b + a
  print(entrada)
  print(b)

#Resultado
deque([4, -1, 5, 2])
3
deque([4, -1, 5])
5
deque([-1, 5])
9
