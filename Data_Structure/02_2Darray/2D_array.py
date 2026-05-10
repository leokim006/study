import numpy as np
'''
a = [0, 1, 2, 3, 4, 5]
rows, cols = (3, 2)

a = np.reshape(a, (rows, cols))

for i in range(0, rows):
    print(' ')
    for j in range(0, cols):
        print(a[i][j], end = '')
print('\n')
'''

rows, cols = (3, 3)
arr = []
for i in range(0, rows, 1):
    for j in range(0, cols, 1):
        arr.append(int(input("Input: ")))

arr = np.reshape(arr, (rows, cols))
for i in range(0, rows):
    print(" ")
    for j in range(0, cols):
        print(arr[i][j], end = ' ')

sums = 0
maxs = 0

for i in range(0, rows):
    for j in range(0, cols):
        sums += arr[i][j]
        if maxs < arr[i][j]:
            maxs = arr[i][j]

avg = sums / 9

print(f"\nSum: {sums}, Max: {maxs}, Average: {avg}")
