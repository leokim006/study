#include <iostream>
#include <vector>
#include <algorithm>
#include <cstdlib>

int main() {
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(NULL);

    int n, m, k;
    std::cin >> n >> m >> k;

    std::vector<int> applicants(n), apartments(m);
    
    for (int i = 0; i < n; ++i) {
        std::cin >> applicants[i];
    }
    for (int i = 0; i < m; ++i) {
        std::cin >> apartments[i];
    }

    std::sort(applicants.begin(), applicants.end());
    std::sort(apartments.begin(), apartments.end());

    int i = 0;
    int j = 0;
    int count = 0;
    
    while(i < n && j < m) {
        if (abs(apartments[j] - applicants[i]) <= k) {
            i++;
            j++;
            count++;
        } else {
            if (apartments[j] - applicants[i] > k) {
                i++;
            } 
            else {
                j++;
            }
        }
    }
    std::cout << count << '\n';

    return 0;
}

