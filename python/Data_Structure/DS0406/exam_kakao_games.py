key  = [[0, 0, 0],
        [1, 0, 0],
        [0, 1, 1]]

lock = [[1, 1, 1],
        [1, 1, 0],
        [1, 0, 1]]

result = False

row = len(lock)
col = len(lock[0])

num_hole = []
for r in range(row):
    for c in range(col):
        if key[r][c] == 1:
            temp = []
            temp.append(r)
            temp.append(c)
            num_hole.append(temp)

print(num_hole)

t_row = len(num_hole)
t_col = len(num_hole[0])

new_c = max(num_hole)[1] - min(num_hole)[1]
new_r = max(num_hole)[0] - max(num_hole)[0]

print(new_c, new_r)
