#include <iostream>

int main(){
    int day;
    std::cin >> day;

    if ((day % 7) == 2){
        std::cout << 1 << std::endl;
    } else {
        std::cout << 0 << std::endl;
    }

    return 0;
}
