def miniMaxSum(arr):
    values = []

    for index_i, value_i in enumerate(arr):

        sum = 0 
        for index_j, value_j in enumerate(arr):
            if index_i != index_j:
                sum += value_j
            
        values.append(sum)
    return min(values), max(values)

A,B = miniMaxSum([1, 3, 5, 7 ,9])

print(str(A))
print(str(B))