def partition(arr, low, high):
    pivot = arr[high]
    i = low - 1
    for j in range(low, high):
        if arr[j] <= pivot:
            i += 1
            arr[i], arr[j] = arr[j], arr[i]

    arr[i + 1], arr[high] = arr[high], arr[i + 1]
    return i + 1

def quickSort(array, low, high):
    if low < high:
        p = partition(array, low, high)
        quickSort(array, low, p - 1)
        quickSort(array, p + 1, high)

def main():
    arr = [6, 41, 20, 34, 9, 38, 46, 55]
    quickSort(arr, 0, len(arr) - 1)
    
    ans_ind = 0
    diff = arr[len(arr) - 1] - arr[0]
    for i in range(len(arr) - 1):
        if arr[i + 1] - arr[i] < diff:
            ans_ind = i
            diff = arr[i + 1] - arr[i]
    print(f"({arr[ans_ind]}, {arr[ans_ind + 1]})")

    print(arr)

if __name__ == "__main__":
    main()
