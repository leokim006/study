# 배열 출력 함수 정의
def print_list(data):
    for r in range(len(data[0])):
        for c in range(len(data)):
            print(data[r][c], end = " ")
        print()

# 배열 정의
array = [[ 0,  1,  2,  3,  4],
         [ 5,  6,  7,  8,  9],
         [10, 11, 12, 13, 14],
         [15, 16, 17, 18, 19],
         [20, 21, 22, 23, 24]]
result_array = [list([0] * 5) for _ in range(5)]

# 배열의 행, 열 정의
row = len(result_array[0])
col = len(result_array)

# 배열 회전
for r in range(row):
    for c in range(col):
        result_array[4 - c][r] = array[r][c]

# 배열 출력
print_list(result_array)
