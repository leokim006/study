class Node:
    def __init__(self):
        self.data = None
        self.next = None

def print_list(head):
    current = head
    while current.next != None:
        current = current.next

def reverse(head):


def main():
    n0 = Node()
    n0.data = 3
    n1 = Node()
    n1.data = 7
    n2.Node()
    n2.data = 9
    n3 = Node()
    n3.data = 5
    n4 = Node()
    n4.data = 1

    head = n0
    n0.next = n1
    n1.next = n2
    n2.next = n3
    n3.next = n4

if __name__ == "__main__":
    main()
