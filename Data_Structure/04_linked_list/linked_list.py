# Single Linked List

class Node():
    def __init__(self):
        self.data = None
        self.link = None

def print_list():
    current = n0
    while current.link != None:
        print(current.data)
        current = current.link
    print(current.data)

def delete_node(a):
    current = n0
    for i in range(0, a - 1):
        current = current.link
    current.link = current.link.link

def insert(a, b):
    n = Node()
    n.data = b

    current = n0
    for i in range(0, a - 1):
        current = current.link

    n.link = current.link
    current.link = n

n0 = Node()
n0.data = "에스파"

n1 = Node()
n1.data = "아이브"

n2 = Node()
n2.data = "뉴진스"

n3 = Node()
n3.data = "잇지"

n0.link = n1
n1.link = n2
n2.link = n3

print_list()
print()

n4 = Node()
n4.data = "블랙핑크"

n4.link = n2
n1.link = n4

print_list()
print()

delete_node(2)
print_list()
print()


insert(2, "아이즈원")

print_list()
print()



# search, reverse, swap; time complexity: O(n)
