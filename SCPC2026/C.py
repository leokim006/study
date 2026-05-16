N, K, M = map(int, input().split())
arr = [*map(int, input().split())]

for t in range(N, M):
    temp = arr[(t - N):t]
    temp.sort()
    arr.append(temp[K - 1])

print(arr[M - 1])
