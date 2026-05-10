class treeNode:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

def inOrder(n):
    if n == None:
        return
    inOrder(n.left)
    print(n.data)
    inOrder(n.right)

def preOrder(n):
    if n == None:
        return
    print(n.data)
    preOrder(n.left)
    preOrder(n.right)

def postOrder(n):
    if n == None:
        return
    postOrder(n.left)
    postOrder(n.right)
    print(n.data)

def main():
    n1 = treeNode(1)
    n2 = treeNode(2)
    n3 = treeNode(3)
    n4 = treeNode(4)
    n5 = treeNode(5)
    n6 = treeNode(6)
    n7 = treeNode(7)
    n8 = treeNode(8)
    n1.left = n2
    n1.right = n3
    n2.left = n4
    n2.right = n5
    n3.left = n6
    n6.left = n7
    n6.right = n8
    
    print("=== In Order ===")
    inOrder(n1)
    print()
    print("=== Pre Order ===")
    preOrder(n1)
    print()
    print("=== Post Order ===")
    postOrder(n1)

if __name__ == "__main__":
    main()
