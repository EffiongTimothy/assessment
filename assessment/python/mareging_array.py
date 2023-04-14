first_array = [1, 2, 3, 4, 5]
second_array = [6, 7, 8, 9, 10]
new_array = []

new_array[0:0] = first_array
new_array[0:0] = second_array
for i in range(len(new_array)):
    for j in range(len(new_array) - i - 1):
        if new_array[j] > new_array[j + 1]:
            new_array[j], new_array[j + 1] = new_array[j + 1], new_array[j]

print(new_array)
