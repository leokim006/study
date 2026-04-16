def main():
    n = int(input())
    while n != 0:
        sums = n * (n + 1) // 2
        print(sums)
        n = int(input())


if __name__ == "__main__":
    main()
