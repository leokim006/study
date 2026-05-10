#include <iostream>
#include <algorithm>
#include <vector>

int main() {
    int n;
    std::cin >> n;

    std::vector<int> arr(n - 1);

    int num;
    for (int i = 0; i < n - 1; ++i){
        std::cin >> num;
        arr[i] = num;
    }

    std::sort(arr.begin(), arr.end());

    int start = 0;
    int end = n - 2;
    while (start <= end) {
        int mid = (start + end) / 2;
        if (arr[mid] == mid + 1) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }

    std::cout << start + 1<< "\n";
    /*
    while (start <= end) {
        int mid = (start + end) / 2;
        if (arr[mid] != mid + 1){
            if (mid == 0 || arr[mid - 1] == mid){
                std::cout << mid + 1 << "\n";
                return 0;
            } else {
                end = mid - 1;
            }
        } else {
            start = mid + 1;
        }
    }
    std::cout << n << "\n";
    */

    return 0;
}
