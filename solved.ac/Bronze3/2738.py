row, col = map(int, input().split())

arr1 = [list(map(int, input().split())) for _ in range(row)]
arr2 = [list(map(int, input().split())) for _ in range(row)]
arr_sum = [[0] * col for _ in range(row)]


for r in range(row):
    for c in range(col):
        arr_sum[r][c] = arr1[r][c] + arr2[r][c]


for r in range(row):
    for c in range(col):
        print(arr_sum[r][c], end = " ")
    print()
