class Node():
    def __init__(self):
        self.data = None
        self.rlink = None
        self.llink = None

n0 = Node()
n0.data = 3

n1 = Node()
n1.data = 7

n2 = Node()
n2.data = 9

n3 = Node()
n3.data = 5

n4 = Node()
n4.data = 1

head = n0
n0.rlink = n1
n1.rlink = n2
n2.rlink = n3
n3.rlink = n4
back = n4


