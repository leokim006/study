def main():
    n = input()
    while n != '0':
        while len(n) > 1:
            temp = 0
            for c in n:
                temp += int(c)
            n = str(temp)
        print(n)
        n = input()


if __name__ == "__main__":
    main()
