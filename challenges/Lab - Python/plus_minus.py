def plusMinus(arr):
    positivos = 0
    negativos = 0
    zero = 0 

    for value in arr:
        if value > 0:
            positivos +=1
        elif value < 0:
            negativos += 1
        else:
            zero += 0

    print(positivos / len(arr))
    print(negativos / len(arr))
    print(zero / len(arr))

    

arr = [-4, 3, -9, 0, 4, 1]

plusMinus(arr)