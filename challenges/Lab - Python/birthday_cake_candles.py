def birthdayCakeCandles(candles):
    max_value = max(candles)

    return  candles.count(max_value)

arr = [3, 2, 1, 3]
print(birthdayCakeCandles(arr))
