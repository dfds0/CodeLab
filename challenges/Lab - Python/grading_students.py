def gradingStudents(grades):
    new_grades = []
    for value in grades:
        if value < 38:
            new_grades.append(value)
        else:
            factor = value % 5
            if factor < 3:
                new_grades.append(value)
            else: 
                value = value + (5 - factor)
                new_grades.append(value)

    return new_grades

grades = [73, 67, 38, 33]

print(gradingStudents(grades))

