N, K = map(int, input().split())
arr = list(map(int, input().split()))

count = 0
for last in range(N, 1, -1):
    max_ind = arr.index(max(arr[0:last]))
    if (last - 1) != max_ind:
        count += 1
        arr[last - 1], arr[max_ind] = arr[max_ind], arr[last - 1]
        if count == K:
            print(arr[max_ind], arr[last - 1], sep = " ")

if count < K:
    print(-1)
