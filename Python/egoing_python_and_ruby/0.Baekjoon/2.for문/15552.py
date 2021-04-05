import sys

I = int(input())
for i in range(I):
    a, b = map(int, sys.stdin.readline().split())
    print (a+b)
