def diagonalDifference(arr):
    
    diagonal_principal = 0
    diagonal_secundaria = 0
    size = len(arr)

    for line_i in range(size):
        for column_j in range(size):
            if line_i == column_j:
                diagonal_principal += arr[line_i][column_j]

            if (line_i + column_j) == (size -1):
                diagonal_secundaria += arr[line_i][column_j]

    sum = diagonal_principal - diagonal_secundaria
    if sum < 0:
        sum = sum * -1 
    return sum 

arr = []
arr.append([1, 2, 3])  #0,2
arr.append([4, 5, 6])  #1,1
arr.append([9, 8, 9])  #2,0

print(diagonalDifference(arr))