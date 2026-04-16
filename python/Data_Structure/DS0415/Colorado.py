class Node:
    def __init__(self, data):
        self._data = data
        self._next = None

FULL = int(input("Queue size: "))
size = 0
front = None
rear = None

def isEmpty():
    global front
    return front == None

def isFull():
    global size, FULL
    return size >= FULL

def enQueue(data):
    global size, front, rear
    if isFull():
        print("Queue is full")
        return
    n = Node(data)
    size += 1
    if rear == None:
        front = rear = n
    else:
        rear._next = n
        rear = n

def deQueue():
    global size, front, rear
    if isEmpty():
        print("Queue is empty")
        return None
    size -= 1
    n = front
    front = n._next
    return n._data

def printQueue():
    global size, front, rear
    current = front
    while current != None:
        print(current._data, end = " -> ")
        current = current._next
    print(None)

