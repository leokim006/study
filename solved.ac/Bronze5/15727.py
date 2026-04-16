def main():
    N = int(input())
    result = 0
    result += N // 5
    if N % 5 != 0:
       result += 1
    print(result)


if __name__ == "__main__":
    main()
