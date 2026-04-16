N, K = map(int, input().split())

arr = []
for i in range(1, N + 1, 1):
    arr.append(i)

pop_list = []
pop_num = K
while len(arr) > 1:
    temp = []
    pop_num = (K - 1) % len(arr) + 1 
    
    temp += arr[0:(pop_num - 1)]
    pop_list.append(arr[pop_num - 1])
    del arr[0:pop_num]
    arr += temp

pop_list.append(arr[0])

print("<", end = "")
for i in range(len(pop_list) - 1):
    print(pop_list[i], end = ", ")
print(pop_list[len(pop_list) - 1], end = "")
print(">")
