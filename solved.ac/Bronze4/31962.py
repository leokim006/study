def main():
    N, X = map(int, input().split())
    dic = {}
    for _ in range(N):
        key, val = map(int, input().split())
        if (key + val) <= X:
            dic[key] = val
    if not dic:
        print(-1)
    else:
        print(max(dic))

if __name__ == "__main__":
    main()
