N = int(input())
M = int(input())

sol_num = 0
for r in range(N - 1):
    if (M == 1):
        break
    for c in range(M):
        if c == 0:
            sol_num += 1
        elif c == (M - 1):
            sol_num += 1
        else:
            sol_num += 2

print(sol_num)
