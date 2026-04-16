import sys

def main():
    n = int(input())
    for _ in range(n):
        sentece = sys.stdin.readline().split()
        for string in sentece:
            string = string[::-1]
            print(string, end = " ")
        print()

if __name__ == "__main__":
    main()
