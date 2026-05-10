#include <iostream>

int main(){
    int n;
    std::cin >> n;

    long long int num = 0;
    for (int i = 1; i <= n; i++){
        num += i;
    }

    int temp = 0;
    for (int i = 0; i < n - 1; ++i){
        std::cin >> temp;
        num -= temp;
    }

    std::cout << num << "\n";

    return 0;
}
