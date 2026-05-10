#include <iostream>
#include <vector>
#include <algorithm>

int main() {
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(NULL);

    int n, x;
    std::cin >> n >> x;
    std::vector<int> child(n);
    for (int i = 0; i < n; i++) {
        std::cin >> child[i];
    }
    std::sort(child.begin(), child.end());

    int i = 0;
    int j = n - 1;
    int num_gondolas = 0;
    while (i <= j) {
        if (child[i] + child[j] <= x) {
            ++i;
        }
        --j;
        ++num_gondolas;
    }
    std::cout << num_gondolas << '\n';

    return 0;
}
