def main():
    T = int(input())
    for _ in range(T):
        d, n, s, p = map(int, input().split())
        paral_runitme = d + p * n
        non_paral_runtime = s * n
        if paral_runitme > non_paral_runtime:
            print("do not parallelize")
        elif paral_runitme < non_paral_runtime:
            print("parallelize")
        else:
            print("does not matter")

if __name__ == "__main__":
    main()
