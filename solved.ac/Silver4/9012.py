class Stack:
    def __init__(self):
        self._items = []
        self.max_size = 50
        self.top = -1

    def is_full(self):
        return self.top == (self.max_size - 1)

    def is_empty(self):
        return len(self._items) == 0

    def push(self, item):
        if self.is_full():
            return
        self._items.append(item)
        self.top += 1

    def pop(self):
        if self.is_empty():
            return None
        self.top -= 1
        return self._items.pop()

    def peek(self):
        if self.is_empty():
            return None
        return self._items[-1]

    def size(self):
        return len(self._items)

def main():
    N = int(input())
    for _ in range(N):
        stack = Stack()
        result = True
        string = input()
        for c in string:
            if c == '(':
                stack.push(c)
            elif c == ')':
                return_val = stack.pop()
                if return_val == None:
                    result = False
        if result == False or stack.top != -1:
            print("NO")
        else:
            print("YES")

if __name__ == "__main__":
    main()
