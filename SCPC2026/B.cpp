#include <iostream>
#include <vector>

int main() {
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(NULL);

    int N, M;
    std::cin >> N >> M;
    std::vector<int> w(N);
    for (int i = 0; i < N; ++i) {
        std::cin >> w[i];
    }

    for (auto & i : w) {
        std::cout << i;
    }

    return 0;
}
