def sum_subarray(arr):
    sum = 0 
    for value in arr: 
        sum += value 
    return sum 

def balancedSums(arr):
    for index, value in enumerate(arr):
        if index == 0 or index == len(arr):
            continue

        sum_left = sum_subarray(arr[:index])
        sum_right = sum_subarray(arr[index+1:])
        if sum_left == sum_right:
            return 'YES'
    return 'NO'

arr = [1, 2, 3, 4, 6]

print(balancedSums(arr))