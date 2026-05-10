def binSearch(arr, data):
    start = 0
    end = len(arr) - 1

    while start <= end:
        mid = (start + end) // 2
        if arr[mid] == data:
            print("Find in index", mid)
            return
        else:
            if arr[mid] > data:
                end = mid - 1
            else:
                start = mid + 1
    print("Not found")

def main():
    a = [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
    binSearch(a, int(input("찾는 값: ")))

if __name__ == "__main__":
    main()
