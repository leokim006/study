# append pop reverse index insert remove count len
# use only append, del, len
# Error

idol = ["Aespa", "ive", "NewJeans", "ITZY"]

def Myappend(a):
    idol.append(a)

def Mypop():
    x = idol[len(idol) - 1]
    del(idol[len(idol) - 1])
    return x

def Myreverse():
    return

def Myindex(data): # Time Complexity O(n)
    for i in range(0, len(idol), 1):
        if idol[i] == data:
            found = i
            break
    if ((found == len(idol)) and (idol[found] != data)):
        return "Not Found"
    else:
        return found

def Myinsert(a, b):
    for i in range(len(idol) - 1, a, -1):
        idol[i + 1] = idol[i]
    idol[a] = b

def Myremove(data):
    for i in range(0, len(idol), 1):
        if idol[i] == data:
            break
    idol[i] = None
    for j in range (i + 1, len(idol), 1):
        idol[j - 1] = idol[j]
        ido[j] = None

    del (idol[len(idol) - 1])

def Mycount():
    return

def Mylen():
    return

Myappend("Kazuha")
print(idol)
print(Myindex("NewJeans"))
print(Myindex("Twice"))



'''
print(Mypop())
print(idol)
print(Myindex("NewJeans"))
Myinsert(3, "WonYoung")
print(idol)


Myremove("aespa")
Myremove("aespa")
print(idol)
'''
