#include <iostream>

int main(){
    char c;
    std::cin >> c;
    if (c == 'N' || c == 'n'){
        std::cout << "Naver D2\n";
    } else {
        std::cout << "Naver Whale\n";
    }

    return 0;
}
