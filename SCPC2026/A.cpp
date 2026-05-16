#include <iostream>
#include <cstring>

int main() {
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(NULL);

    std::string ans = "SCSC";
    std::string str;
    std::cin >> str;

    int i = 0;
    int j = 0;
    while (true) {
        if (i > 4 || j > 4) {
            break;
        }
        if (str[i] != ans[j]) {
            std::cout << ans[j];
            ans[i] = '\0';
            j++;
        } else {
            ans[j] = '\0';
            ++i;
            ++j;
        }
    }

    return 0;
}
