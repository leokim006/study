# print(ord('b') - ord('a'))
L = int(input())
string = input()
hashing = 0
r = 1
M = 1234567891

for i in range(L):
    char_val = ord(string[i]) - ord('a') + 1
    hashing = (hashing + char_val * r) % M
    r = (r * 31) % M

print(hashing)
