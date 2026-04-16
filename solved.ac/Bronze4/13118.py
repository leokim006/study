def main():
    pi = list(map(int, input().split()))
    x, y, r = map(int, input().split())
    
    index = None
    for i in range(len(pi)):
        if pi[i] == x:
            index = i + 1
            break
    if index != None:
        print(i + 1)
    else:
        print(0)

if __name__ == "__main__":
    main()
