def start():
    print("\n - You are standing in a dark room.")
    print("There is a door to your left and right, which one do you take? (L ou R)")

    _input = input(">").lower()

    if "l" in _input:
        scp_room_a()
    elif "r" in _input:
        scp_room_b()
    else:
        no_input()

def scp_room_a():
    print("\n - There is a person here.")
    print("Behind the person is another door")
    print("The person is holding a box")
    print("What would you do ? (1 or 2)")
    print("1 - Take the box")
    print("2 - Ignore the man")

    _input = input(">").lower()

    if "1" in _input:
        print("The person killed you")
    elif "2" in _input:
        print("The person ignore you, you access the new room")
        end_room()
    else:
        no_input()

def scp_room_b():
    print("\n - Now you  entered the SCP-XXX room!")
    print("The SCP is sleeping. \n Behind the SCP, there is a door")
    print("What would you do ? (1 or 2)")
    print("1 - Go through the door silently")
    print("2 - Attack the SCP")

    _input = input(">").lower()

    if "1" in _input:
        end_room()
    elif "2" in _input:
        print("The SCP killed you")
    else:
        no_input()

def end_room():
    print("\n - There a room filled with documennts")
    print("There is another door")
    print("What would you do ? (1 or 2)")
    print("1 - Take some document")
    print("2 -  Just go through the door")

    _input = input(">").lower()

    if "1" in _input:
        print("The document were cursed! you die")
    elif "2" in _input:
        print("You are free!")
    else:
        no_input()

def no_input()
    print("END!")

start()