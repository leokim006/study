#include <iostream>

int main(){
    int t;
    std::cin >> t;

    for (int i = 0; i < t; i++){
        int n;
        std::cin >> n;
        int max = 0;
        int min = 100;
        for (int j = 0; j < n; j++){
            int xi;
            std::cin >> xi;
            if (xi > max){
                max = xi;
            }
            if (xi < min){
                min = xi;
            }
        }
        int tot_dis = (max - min) * 2;
        std::cout << tot_dis << "\n";
    }
}
