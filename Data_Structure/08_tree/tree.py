class treeNode:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

def searchTree(data):
    global root
    current = root
    if current is None:
        print("not found")
        return False

    while True:
        if data == current.data:
            print("find: " + str(data))
            return True
        elif data < current.data:
            if current.left is None:
                print("not found")
                return False
            current = current.left
        else:
            if current.right is None:
                print("not found")
                return False
            current = current.right

def insertTree(data):
    global root
    if searchTree(data):
        print("Already exist: " + str(data))
        return

    n = treeNode(data)
    if root is None:
        root = n
        return

    current = root
    while True:
        if data < current.data:
            if current.left is None:
                current.left = n
                break
            current = current.left
        else:
            if current.right is None:
                current.right = n
                break
            current = current.right

def inorder(node):
    if node is None:
        return
    inorder(node.left)
    print(node.data)
    inorder(node.right)

def deleteTree(data):
    global root
    if not searchTree(data):
        print("Not Exist " + str(data))
        return
        
    parent = None
    current = root
    
    while True:
        if current.data == data:
            if current.left is None and current.right is None:
                if parent.left == current:
                    parent.left = None
                else:
                    parent.right = None
                del(current)
            elif current.right is None:
                if parent.left == current:
                    parent.left = current.left
                else:
                    parent.right = current.left
                del(current)
            elif current.left is None:
                if parent.left == current:
                    parent.left = current.right
                else:
                    parent.right = current.right
                del(current)
            break
        else:
            parent = current
            if current.data > data:
                current = current.left
            else:
                current = current.right

root = None

insertTree(10)
insertTree(12)
insertTree(5)
insertTree(4)
insertTree(20)
insertTree(8)

inorder(root)

