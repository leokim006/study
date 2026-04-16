# Value
arr = [[ 0,  1,  2,  3,  4],
       [ 5,  6,  7,  8,  9],
       [10, 11, 12, 13, 14],
       [15, 16, 17, 18, 19],
       [20, 21, 22, 23, 24]]
rows, cols = (5, 5)

# get min, max
min_val = float('inf')
max_val = float('-inf')

for r in range(0, rows, 1):
    for c in range(0, cols, 1):
        if arr[r][c] > max_val:
            max_val = arr[r][c]
        if arr[r][c] < min_val:
            min_val = arr[r][c]

print(f"Max: {max_val}, Min: {min_val}")

# sum of rows
for r in range(0, rows, 1):
    sum_even = 0
    sum_odd = 0
    for c in range(0, cols, 1):
        if arr[r][c] % 2 == 0:
            sum_even += arr[r][c]
        else:
            sum_odd += arr[r][c]
    print(f"Sum of {r} rows, Even: {sum_even}, Odd: {sum_odd}")

# sum of cols
print("")
for c in range(0, cols, 1):
    sum_even = 0
    sum_odd = 0
    for r in range(0, rows, 1):
        if arr[r][c] % 2 == 0:
            sum_even += arr[r][c]
        else:
            sum_odd += arr[r][c]
    print(f"Sum of {c} cols, Even: {sum_even}, Odd: {sum_odd}")
