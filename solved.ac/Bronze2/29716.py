def main():
    J, N = map(int, input().split())
    count = 0

    for _ in range(N):
        tall = 0
        string = input()
        for c in string:
            if 'A' <= c and c <= 'Z':
                tall += 4
            elif 'a' <= c and c <= 'z':
                tall += 2
            elif '0' <= c and c <= '9':
                tall += 2
            elif c == ' ':
                tall += 1
        if tall <= J:
            count += 1
    print(count)


if __name__ == "__main__":
    main()
