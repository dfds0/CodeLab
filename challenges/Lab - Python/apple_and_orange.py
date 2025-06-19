def countApplesAndOranges(s, t, a, b, apples, oranges):
    
    count_apple = 0
    for apple in apples:
        position = a + apple
        if position >= s and position <= t:
            count_apple += 1
    
    count_orange = 0
    for orange in oranges:
        position = b + orange
        if position >= s and position <= t:
            count_orange += 1

    return count_apple, count_orange


s = 7
t = 11
a = 5
b = 15
apples = [-2, 2, 1]
oranges = [5, -6]
a, b = countApplesAndOranges(s, t, a, b, apples, oranges)
print(a)
print(b)
print('')

s = 7
t = 11
a = 5
b = 15
apples = [-5, -6, -7]
oranges = [10, 9, 8]
a, b = countApplesAndOranges(s, t, a, b, apples, oranges)
print(a)
print(b)
print('')

s = 4
t = 10
a = 3
b = 12
apples = [1, 2, 3, 4]  # Final: 4,5,6,7
oranges = [-2, -3, -4]  # Final: 10,9,8
a, b = countApplesAndOranges(s, t, a, b, apples, oranges)
print(a)
print(b)
print('')

s = 7
t = 11
a = 7
b = 11
apples = [0]    # Cai no ponto 7 (início da casa)
oranges = [0]   # Cai no ponto 11 (fim da casa)
a, b = countApplesAndOranges(s, t, a, b, apples, oranges)
print(a)
print(b)