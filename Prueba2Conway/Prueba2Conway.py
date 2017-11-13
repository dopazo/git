from itertools import groupby

def Conway(numero):
    for _ in range(10):
        print(numero)
        numero = ''.join([str(len(list(i))) + k for k, i in groupby(numero)])

ini=input("Iniciar en que numero:")
Conway(ini)