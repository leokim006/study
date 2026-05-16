#include <iostream>
#include <vector>
#include <algorithm>

int main() {
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(NULL);

    int N, K;
    long long int M;
    std::cin >> N >> K >> M;
    std::vector<int> arr(N);

    for (int i = 0; i < N; ++i) {
        std::cin >> arr[i];
    }

    std::vector<int> temp(N);
    for (int t = N; t < M; ++t) {
        for (int i = 0; i < t; ++i) {
            temp[i] = arr[(t - N) + i];
        }
        std::sort(temp.begin(), temp.end());
        for (auto & a : temp) {
            std::cout << a << ' ';
        }
        arr.push_back(temp[K - 1]);
    }

    std::cout << arr[M - 1] << '\n';

    return 0;
}
