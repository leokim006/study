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
    FULL = 10
    stack = input()
    stack = list(stack)
    top = len(stack) - 1
    pop_stack = []
    while isStackEmpty(FULL, stack, top) != True:
        print(top)
        result, top = pop(FULL, stack, top)
        pop_stack.append(result)
    print(pop_stack)
    print(stack)
    if stack == pop_stack:
        print(True)
    else:
        print(False)


if __name__ == "__main__":
    main()
