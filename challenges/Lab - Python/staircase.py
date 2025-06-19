def staircase(n):
    line = []
    for value in range(n):
        line.append(' ')
    
    #print(''.join(line))

    for value in range(n):
        index = n - value - 1
        line[index] = '#'
        #print('# value: ' + str(value) + " infdex: " + str(index) + " ? " + str(line[index]))
        print(''.join(line))


staircase(6)