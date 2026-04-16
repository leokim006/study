def main():
    arr = list()
    for _ in range(3):
        n = int(input())
        arr.append(n)
        arr.sort()
    print(arr[1])


if __name__ == "__main__":
    main()
