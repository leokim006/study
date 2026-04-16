#include <iostream>

int main(){
    int T;
    std::cin >> T;
    
    for (int i = 0 ; i < T; i++){
        int min = 101;
        int sum = 0;
        for (int j = 0 ; j < 7; j++){
            int n;
            std::cin >> n;
            if ((n % 2) == 0){
                sum += n;
                if (n < min){
                    min = n;
                }
            }
        }
        std::cout << sum << " " << min << "\n";
    }

    return 0;
}
