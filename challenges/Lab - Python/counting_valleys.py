def countingValleys(steps):
    antes = 0
    depois = 0 
    vale = 0

    for step in steps:
        if step == 'U':
            depois += 1
        else:
            depois -= 1

        print(f'step: {step} - antes: {antes} x depois: {depois}')
        if antes < 0 and depois >= 0:
            vale += 1

        antes = depois 
    
    return vale

print(countingValleys('UDDDUDUU'))
print(countingValleys('UUUUUU'))
print(countingValleys('DUDUDU'))
print(countingValleys('DDUUDDUDUUUD'))
