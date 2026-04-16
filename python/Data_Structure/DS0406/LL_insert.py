def insert(a, b):
    n = Node()
    n.data = b

    current = head
    for i in range(0, a - 1):
        current = current.link

    n.link = current.link
    current.link = n

insert(2, "아이즈원")

current = n0
while current.link != None:
    print(current.data)
    current = current.link
print(current.data)
