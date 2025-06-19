def sum_sub_array(sub_array):
    sum = 0
    for value in sub_array:
        sum += value 
    return sum 

def birthday(s, d, m):
    match = 0 
    len_array = len(s)
    for index in range(len_array):
        sub_array = s[index:(index + m)]
        if len(sub_array) == m and sum_sub_array(sub_array) == d: 
            match = match + 1

    return match 

s = [2, 2, 1, 3, 2]
d = 4
m = 2

print( birthday(s, d , m) )

