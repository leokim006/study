def binSearch(arr, data):
    start = 0
    end = len(arr) - 1

    while start <= end:
        mid = (start + end) // 2
        if arr[mid] == data:
            return mid
        else:
            if arr[mid] > data:
                end = mid - 1
            else:
                start = mid + 1

def findNum(arr):
    start = 0
    end = len(arr) - 1
    
    while start <= end:
        mid = (start + end) // 2
        print(mid)
        if arr[mid - 1] == mid + 1 and arr[mid] != mid + 1:
            print(mid + 1)
            return
        else:
            if arr[mid] == mid + 1:
                end = mid - 1
            else:
                start = mid + 1

def main():
    a = [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31]
    findNum(a)

if __name__ == "__main__":
    main()
