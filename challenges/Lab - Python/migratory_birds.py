def migratoryBirds(arr):
    map = {}
    for value in arr:
        if value in map:
            map[value] = map[value] + 1
        else:
            map[value] = 1

    best = 0
    max = 0
    for value in map:
        if map[value] > max:
            best = value 
            max = map[value]
    
    for value in map: 
        if map[value] == max:
            if value < best:
                best = value

    return best 


arr = [1, 4, 4, 4, 5, 3]
print(migratoryBirds(arr))

arr = [1, 1, 2, 2, 3]
print(migratoryBirds(arr))

