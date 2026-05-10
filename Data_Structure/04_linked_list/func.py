class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

def traverse(head):
    current = head
    while current is not None:
        print(current.data, end = " -> ")
        current = current.next
    print("None")

def insert(head, index, data):
    current = head
    for _ in range(index - 1):
        if current is not None:
            current = current.next
    new_n = Node(data)
    temp = current.next
    current.next = new_n
    new_n.next = temp

def delete(head, index):
    current = head
    for _ in range(index - 1):
        if current is not None:
            current = current.next
    temp = current.next.next
    current.next = temp
        

def search(head, data):
    current = head
    i = 0
    while current is not None:
        if current.data == data:
            break
        current = current.next
        i += 1

    return i

def reverse(head):
    p = head
    q = None
    while p is not None:
        r = q
        q = p
        p = p.next
        q.next = r
    return q

def swap(head, index1, index2):
    node_f = None
    curr_f = head
    for _ in range(index1):
        node_f = curr_f
        curr_f = curr_f.next

    node_b = None
    curr_b = head
    for _ in range(index2):
        node_b = curr_b
        curr_b = curr_b.next
    
    if node_f is not None:
        node_f.next = curr_b
    else:
        head = curr_b

    if node_b is not None:
        node_b.next = curr_f
    else:
        head = curr_f

    temp = curr_f.next
    curr_f.next = curr_b.next
    curr_b.next = temp
    
    return head

def main():
    n1 = Node(3)
    n2 = Node(7)
    n3 = Node(9)
    n4 = Node(5)
    n5 = Node(1)

    head = n1
    n1.next = n2
    n2.next = n3
    n3.next = n4
    n4.next = n5
    
    traverse(head)
    insert(head, 2, 10)
    traverse(head)
    delete(head, 2)
    traverse(head)
    print(search(head, 9))
    head = reverse(head)
    traverse(head)
    head = swap(head, 1, 3)
    traverse(head)

if __name__ == "__main__":
    main()
