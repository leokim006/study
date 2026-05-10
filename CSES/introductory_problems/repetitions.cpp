#include <iostream>

int main() {
    char c;
    char temp = 'N';
    int count = 1;
    int temp_count = 0;

    while ((c = getchar()) != EOF && c != '\n') {
        if (c == temp) {
            count++;
        } else {
            if (count > temp_count) {
                temp_count = count;
                count = 1;
            } else {
                count = 1;
            }
        }
        temp = c;
    }
    if (count > temp_count) {
        temp_count = count;
    }
    
    std::cout << temp_count << "\n";
    
    return 0;
}
