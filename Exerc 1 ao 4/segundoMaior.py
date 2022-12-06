array = [ 1, 2, 3, 4, 5, 6, 6 ]

def secondBigger(lista):
    mx=max(lista[0], lista[1])
    secondMax=min(lista[0], lista[1])
    n=len(lista)
    for i in range(2, n):
        if lista[i]>mx:
            secondMax=mx
            mx=lista[i]
        elif lista[i]>secondMax and \
            mx != lista[i]:
            secondMax=lista[i]

    print(f"O segundo maior da lista é: {secondMax}")

secondBigger(array)
