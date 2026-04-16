#include <iostream>

int main(){
    long long int N;
    long long int arr[6];
    long long int T, P;
    std::cin >> N;
    for (int i = 0; i < 6; i++){
        std::cin >> arr[i];
    }
    std::cin >> T >> P;

    long long int tshirt_sets = 0;
    for (int i = 0; i < 6; i++){
        tshirt_sets += (arr[i] + T - 1) / T;
    }

    std::cout << tshirt_sets << std::endl;

    long long int n_pen_set = N / P;
    long long int need_pen = N % P;
    std::cout << n_pen_set << " " << need_pen << std::endl;

    return 0;
}
