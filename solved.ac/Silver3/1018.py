row, col = map(int, input().split())

chessboard = [list('.') * col for _ in range(row)]

for i in range(row):
    temp = input()
    for j in range(col):
        chessboard[i][j] = temp[j]

for r in range(row):
    for c in range(col):
        print(chessboard[r][c], end = " ")
    print()


