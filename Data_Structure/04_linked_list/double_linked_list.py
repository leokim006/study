# Double Linked List

class Node():
    def __init__(self):
        self.data = None
        self.llink = None
        self.rlink = None

n0 = Node()
n0.data = "에스파"

n1 = Node()
n1.data = "아이브"

n2 = Node()
n2.data = "뉴진스"

n3 = Node()
n3.data = "잇지"

n0.rlink = n1
n1.rlink = n2
n2.rlink = n3
n3.llink = n2
n2.Linked = n1
n1.Linked = n0
head = n0
tail = n3
