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
    stack[top] = a

def pop(FULL, stack, top):
    if isStackEmpty(FULL, stack, top):
        print("Stack is EMPTY!!!!!!")
        return None
    a = stack[top]
    stack[top] = None
    top -= 1
    return a, top

def main():


if __name__ == "__main__":
    main()
