#include <iostream>

int main(){
    long long int n; // long long int 쓰는게 좋음. 문제 확인
    std::cin >> n;

    for (;;){
        std::cout << n << " "; // 출력문을 맨 위에 적으면 한번만 써도 됨
        if (n == 1){
            break;
        }
        if (n % 2 == 0){
            n = n / 2;
        } else {
            n = n * 3 + 1;
        }
    }

    return 0;
}
