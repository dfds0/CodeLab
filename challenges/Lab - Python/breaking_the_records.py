def breakingRecords(scores):
    max = scores[0]
    min = scores[0]
    count_max = 0
    count_min = 0

    for score in scores:
        if score > max:
            max = score
            count_max += 1
        if score < min:
            print(f' score:{score} x min:{min}')
            min = score
            count_min += 1

    return [count_max, count_min]


scores = [10, 5, 20, 20, 4, 5, 2, 25, 1]
print(breakingRecords(scores))