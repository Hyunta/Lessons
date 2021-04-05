N = int(input())
a,b = divmod(N,10)
i= 0
c,d = a,b

while True:
    t = c
    c = d
    d = (t+d) % 10
    i = i + 1
    if (c,d) == (a,b):
        break

print(i)
