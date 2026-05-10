import time

t = 0
start = time.time()

for i in range(0, 100):
    for j in range(0, 100):
        for k in range(0, 100):
            t = t + 1

end = time.time()
print(end - start)
