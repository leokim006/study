def main():
    N = int(input())
    A = int(input())
    B = int(input())
    C = int(input())
    D = int(input())
    
    kor_day = A / C
    math_day = B / D
    print(int(N - max(kor_day, math_day)))
    

if __name__ == "__main__":
    main()
