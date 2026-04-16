def main():
    A, T = map(int, input().split())
    P = 10 + 2 * (25 - A + T)
    if P < 0:
        P = 0
    print(P)

if __name__ == "__main__":
    main()
