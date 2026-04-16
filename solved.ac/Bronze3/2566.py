row, col = (9, 9)
arr = [list(map(int, input().split())) for _ in range(row)]

max_val = float('-inf')
max_ind_r = 0
max_ind_c = 0
for r in range(row):
    for c in range(col):
        if arr[r][c] > max_val:
            max_val = arr[r][c]
            max_ind_r = r + 1
            max_ind_c = c + 1

print(max_val)
print(max_ind_r, max_ind_c)
