n, m = map(int, input().split())

while n != 0 or m != 0:
    if n > m:
        print("Yes")
    else:
        print("No")
    n, m = map(int, input().split())
