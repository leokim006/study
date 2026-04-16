#include <iostream>

int main(){
    int n;
    std::cin >> n;

    for (int i = 0; i < n; i++){
        int c, p;
        std::cin >> c >> p;
        int total_price = (c * p) - ((c - 1) * 2);
        std::cout << c << " " << p << std::endl;
        std::cout << total_price << std::endl;
    }

    return 0;
}
