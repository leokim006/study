def main():
    N, M = map(int, input().split())
    while N != 0 or M != 0:
        n_list = []
        for _ in range(N + M):
            num = input()
            n_list.append(num)
        len_list = len(n_list)
        len_set  = len(set(n_list))
        print(len_list - len_set)
        N, M = map(int, input().split())


if __name__ == "__main__":
    main()
