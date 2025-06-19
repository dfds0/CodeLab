def timeConversion(s):
    statement = s.split(':')
    _hours = statement[0]
    _minutes = statement[1]
    _seconds = statement[2][:2]
    _zone = statement[2][2:]

    if _hours == '12':
        _hours = '00'

    if _zone == 'PM':
        _hours = int(_hours) + 12

    _hours = str(_hours)
    if len(_hours) < 1:
        _hours = '0' + _hours

    converted_time = _hours + ':' + _minutes + ':' + _seconds

    return converted_time


print(timeConversion('07:05:45PM'))  # 19:05:45
print(timeConversion('12:00:00AM'))  # 00:00:00
print(timeConversion('02:22:00PM'))  # 14:22:00
print(timeConversion('12:45:54PM'))  # 12:45:54
print(timeConversion('01:00:00AM'))  # 01:00:00