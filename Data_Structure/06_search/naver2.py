import sys

def seq_gat(string):
    gather = ['a', 'e', 'i', 'o', 'u']
    seq = 0
    for c in string:
        if c in gather:
            seq += 1
            if seq == 2:
                return True
        else:
            seq = 0
            continue

def seq_con(string):
    gather = ['a', 'e', 'i', 'o', 'u']
    seq = 0
    for c in string:
        if c not in gather:
            seq += 1
            if seq == 3:
                return True
        else:
            seq = 0
            continue

def main():
    word_list = sys.stdin.readline().split()

    sg = 0
    sc = 0

    for word in word_list:
        if seq_gat(word):
            sg += 1
        if seq_con(word):
            sc += 1
    
    print(sg)
    print(sc)

if __name__ == "__main__":
    main()
