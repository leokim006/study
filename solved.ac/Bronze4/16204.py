n, m, k = map(int, input().split())

if m == k:
    print(n)
else:
    fx = n - m
    bx = n - k
    if m > k:
        cnum = m - (m - k)
    else:
        cnum = k - (k - m)
    if fx > bx:
        cnum += fx - (fx - bx)
    else:
        cnum += bx - (bx - fx)
    print(cnum)
