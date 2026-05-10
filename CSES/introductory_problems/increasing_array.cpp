#include <iostream>
#include <vector>

int main() {
    int n;
    std::cin >> n;

    std::vector<int> vec(n);

    for (int i = 0; i < n; ++i) {
        std::cin >> vec[i];
    }

    long long int out = 0;
    for (int i = 0; i < n - 1; ++i) {
        if (vec[i] > vec[i + 1]) {
            out += vec[i] - vec[i + 1];
            vec[i + 1] = vec[i];
        }
    }

    std::cout << out << "\n";

    return 0;
}
