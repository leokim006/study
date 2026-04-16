import sys

def isStackFull(FULL, stack, top):
    if top >= FULL - 1:
        return True
    else:
        return False

def isStackEmpty(FULL, stack, top):
    if (top <= -1):
        return True
    else:
        return False

def push(FULL, stack, top, item):
    if isStackFull(FULL, stack, top):
        print("Stack is FULL!!!!!!!")
        return
    top += 1
    stack[top] = item
    return top

def pop(FULL, stack, top):
    if isStackEmpty(FULL, stack, top):
        print("Stack is EMPTY!!!!!!")
        return None
    a = stack[top]
    stack[top] = None
    top -= 1
    return a, top

def main():
    FULL = 100
    top = -1
    string = input()
    result = True
    stack = [None] * FULL
    for c in string:
        if c == '(':
            top = push(FULL, stack, top, c)
        elif c == ')':
            res, top = pop(FULL, stack, top)
            if res == None:
                result = False
    if top != -1:
        result = False
    print(result)

if __name__ == "__main__":
    main()
