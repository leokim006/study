def main():
    j_mbti = input()
    N = int(input())
    count = 0
    for _ in range(N):
        temp = input()
        if temp == j_mbti:
            count += 1
    print(count)

if __name__ == "__main__":
    main()
