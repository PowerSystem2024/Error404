numbers = list(range(1, 51))

for i in range(len(numbers)):
    if i != len(numbers) - 1:
        print(numbers[i], end="-")
    else:
        print(numbers[i])
