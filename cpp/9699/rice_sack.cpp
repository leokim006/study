#include <iostream>

int main(){
    int case_num;
    std::cin >> case_num;

    for (int i = 1; i <= case_num; i++){
        int max = 0;
        for (int j = 0 ; j < 5; j++){
            int n;
            std::cin >> n;
            if (n > max){
                max = n;
            }
        }
        std::cout << "Case #" << i << ": " << max << "\n";
    }

    return 0;
}
