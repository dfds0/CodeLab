def compareTriplets(_alice, _bob):
    alice_bonus = 0
    bob_bonus = 0

    for index, value in enumerate(_alice):
        value_alice = _alice[index]
        value_bob = _bob[index]

        if value_alice > value_bob:
            alice_bonus +=1
        elif value_bob > value_alice:
            bob_bonus += 1

    return [alice_bonus, bob_bonus]
